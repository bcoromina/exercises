package types

object ScalaTypes extends App{

  sealed trait Request

  case class ReqA() extends Request
  case class ReqB() extends Request

  sealed trait Response
  case class RespA() extends Response
  case class RespB() extends Response

  // Problem:
  // write one component to process each individual messages
  // write a def process(in: Request) : Response
  // write a function to process message
  trait NaiveProcessor[Req <: Request, Resp <: Response] {
    def process(in: Req): Resp
  }

  class NaiveMessageProcessor(npa: NaiveProcessor[ReqA, RespA], npb: NaiveProcessor[ReqB, RespB]) {
    def process(in: Request): Response = in match {
      case a:ReqA => npa.process(a)
      case b:ReqB => npa.process(new ReqA) // Mixing types !!!
    }
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // In addition the coder can  mix ReqA with RespB.
  // In other words: def foo(r: NaiveProcessor[ReqA, RespB]): Unit = ???

  trait Processor[R <: Request] {
    type RespType <: Response // Family polymorphism
    // it ensures that processor of ReqA will give RespA as a response
    def process(req: R): RespType
  }


  class MessageProcessor(procA: Processor[ReqA], procB: Processor[ReqB]) {
    def processMessage(req: Request): Response = req match {
      case a:ReqA => procA.process(a)
      case b:ReqB =>  procB.process(b)
    }
  }

  val procA = new Processor[ReqA] {
    override type RespType = RespA
    override def process(req: ReqA): RespType = RespA()
  }

  val procB = new Processor[ReqB] {
    override type RespType = RespB
    override def process(req: ReqB): RespType = RespB()
  }

  val response: Response = new MessageProcessor( // I would like RespA instead of Response as type for Response
    procA,
    procB
  ).processMessage(ReqA())

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // There is only one place where Request and Response are associated, Processor. In other places association is
  // hided (promotes encapsulation)
  //
  // Problem: I still can mess things up in processMessage method

  implicit val a = new Processor[ReqA] {
    override type RespType = RespA
    override def process(req: ReqA): RespType = RespA()
  }

  implicit val b = new Processor[ReqB] {
    override type RespType = RespB
    override def process(req: ReqB): RespType = RespB()
  }

  object FinalMessageProcessor {
    def processMessage[R <: Request](in: R)(implicit processor: Processor[R]): processor.RespType = processor.process(in)
  }

  // Extensibility/OpenClosed Principle: Add Requests, Response and Processors without touching MessageProcessor, only individual processor

  val r: RespA = FinalMessageProcessor.processMessage(ReqA())


  println(r)
}
