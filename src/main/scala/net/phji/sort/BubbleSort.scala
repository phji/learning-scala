package net.phji.sort

import scala.annotation.tailrec

/**
  * Created by kazutoshifujimoto on 2016/07/03.
  */
class BubbleSort {

  def run(lis: List[Int]) = {
    loop(lis)
  }

  def loop(lis: List[Int]): List[Int] = {
    val (swapped, counted) = swap(lis, 0)

    if (counted == 0) {
      lis
    } else {
      loop(swapped)
    }
  }

  def swap(lis: List[Int], count: Int): (List[Int], Int) = {

    @tailrec
    def swap(lis: List[Int], count: Int, index: Int): (List[Int], Int) = {
      if (index == (lis.length - 1)) {
        (lis, count)
      } else {
        val (swapped, counted) = if (lis(index) > lis(index + 1)) {
          val u = lis.take(index) union List(lis(index + 1), lis(index)) union lis.drop(index + 2)

          (u, count + 1)
        } else {
          (lis, count)
        }

        swap(swapped, counted, index + 1)
      }
    }

    swap(lis, count, 0)
  }
}
