package net.phji.search

import java.io.ByteArrayInputStream

import org.scalatest.FunSuite

/**
  * Created by kazutoshifujimoto on 2016/07/08.
  */
class LinearSearchTest extends FunSuite {
  val data =
    """|5
      |1 2 3 4 5
      |3
      |3 4 1""".stripMargin


  test("main") {
    assertResult("3\n") {
      val in = new ByteArrayInputStream(data.getBytes())
      val out = new java.io.ByteArrayOutputStream()
      Console.withOut(out) {
        Console.withIn(in) {
          LinearSearch.main(Array.empty[String])
        }
      }
      out.toString()
    }
  }

}
