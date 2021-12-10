import cats.effect.IO
import cats.effect.unsafe.IORuntime

import collection.mutable.Stack
import org.scalatest.*
import flatspec.*
import matchers.*
import org.http4s.*
import org.http4s.Status
import org.http4s.syntax.literals.uri

implicit val runtime: IORuntime = cats.effect.unsafe.IORuntime.global

import scala.collection.mutable

class SampleTest extends AnyFlatSpec with should.Matchers {

  it should "Reply 200 for the basic request" in {
    val getRoot = Request[IO](Method.GET, uri"/hello/mibo")
    val io = Main.helloWorldService.run(getRoot)
    val response: Response[IO] = io.unsafeRunSync()
//    println(response.status)
    response.status.code should be (200)
//    response.body.as[String] should be ("tet")
  }

//  "A Stack" should "pop values in last-in-first-out order" in {
//    val stack = new mutable.Stack[Int]
//    stack.push(1)
//    stack.push(2)
//    stack.pop() should be (2)
//    stack.pop() should be (1)
//  }
//
//  it should "throw NoSuchElementException if an empty stack is popped" in {
//    val emptyStack = new Stack[Int]
//    a [NoSuchElementException] should be thrownBy {
//      emptyStack.pop()
//    }
//  }
}