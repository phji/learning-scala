package net.phji.search

/**
  * Created by kazutoshifujimoto on 2016/07/08.
  */
object LinearSearch {

  import scala.io.StdIn._

  def main(args: Array[String]) {
    val n = readInt()
    val s = readLine().split(" ").map(_.toInt)
    val q = readInt()
    val t = readLine().split(" ").map(_.toInt).map { i =>
      i -> true
    }.toMap

    println(s.filter { key =>
      t.contains(key) && t(key) == true
    }.length)
  }

}
