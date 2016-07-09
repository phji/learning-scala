package net.phji.sort

import org.scalatest.{BeforeAndAfterEach, FunSuite}

/**
  * Created by kazutoshifujimoto on 2016/07/03.
  */
class BubbleSortTest extends FunSuite with BeforeAndAfterEach {

  val lis = List(8, 4, 3, 7, 6, 5, 2, 1)
  val sort = new BubbleSort()

  test("testLoop") {
    assertResult(List(1, 2, 3, 4, 5, 6, 7, 8)) {
      sort.loop(lis)
    }
  }

  test("testSwap") {
    assertResult((List(4, 3, 7, 6, 5, 2, 1, 8), 7)) {
      sort.swap(lis, 0)
    }
  }

  test("testRun") {
    val result = (1 to 100000).toList
    assertResult(result) {
      sort.run(result.reverse)
    }
  }

}
