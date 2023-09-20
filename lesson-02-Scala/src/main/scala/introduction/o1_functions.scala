package introduction

object o1_functions extends App {

  val x0: Any = println("o_01_functions start")

  /**
   * Функции
   */


  /**
   * Реализовать ф-цию  sum, которая будет суммировать 2 целых числа и выдавать результат
   */
  def sum(x: Int, y: Int): Int = x + y

  val x1: Int = sum(3, 5)
  println("x1: " + x1)

  val sum2: (Int, Int) => Int = (a, b) => a + b
  val x2: Int = sum(2, 12)
  println("x2: " + x2)


  // (Int, Int) => Int == Int => Int => Int

  val sumCurried: Int => Int => Int = sum2.curried


  // Partial function

  val divide: PartialFunction[(Int, Int), Int] = {
    case x if x._2 != 0 => x._1 / x._2
    case x if x._2 == 0 => 0
  }

  val l = List((4, 2), (5, 0), (9, 3))
  l.collect(divide)
  println("l:" + l)


  // SAM Single Abstract Method
  trait Printer {
    def apply(s: String): Unit
  }
  val p: Printer = a => println(a)

  /**
   * Задание 1. Написать ф-цию метод isEven, которая будет вычислять является ли число четным
   */


  /**
   * Задание 2. Написать ф-цию метод isOdd, которая будет вычислять является ли число нечетным
   */


  /**
   * Задание 3. Написать ф-цию метод filterEven, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются четными
   */


  /**
   * Задание 4. Написать ф-цию метод filterOdd, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются нечетными
   */


  /**
   * return statement
   *
   */


}
