import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble

class CalculatorImplementation {
  val calculate=new Calculator

  //function to input two numbers and return tuple
  def inputNumbers: (Int,Int) ={
    print("Enter first number : ")
    val number1=readInt()
    print("Enter second number : ")
    val number2=readInt()
    (number1,number2)
  }

  //function to perform operation as per the selected operation
  def performOperation(operation:Int) ={
    operation match {
        //addition
      case 1=>
        val numbers=inputNumbers
        val result=calculate.addition(numbers._1,numbers._2)
        println(s"Addition of ${numbers} is "+result)
        //subtraction
      case 2=>
        val numbers=inputNumbers
        val result=calculate.subtraction(numbers._1,numbers._2)
        println(s"Subtraction of ${numbers} is "+result)
        //multiplication
      case 3=>
        val numbers=inputNumbers
        val result=calculate.multiplication(numbers._1,numbers._2)
        println(s"Multiplication of ${numbers} is "+result)
        //division
      case 4=>
        val numbers=inputNumbers
        val result=calculate.division(numbers._1,numbers._2)
        println(s"Division of ${numbers} is "+result)
        //power
      case 5=>
        val numbers=inputNumbers
        val result=calculate.power(numbers._1,numbers._2)
        println(s"Power of ${numbers} is "+result)
        //absolute
      case 6=>
        val number=readDouble()
        val result=calculate.absolute(number)
        println(s"Absolute of ${number} is "+result)
        //modulus
      case 7=>
        val numbers=inputNumbers
        val result=calculate.modulus(numbers._1,numbers._2)
        println(s"Modulus of ${numbers} is "+result)
        //maximum number
      case 8=>
        val numbers=inputNumbers
        val result=calculate.maximumOfTwo(numbers._1,numbers._2)
        println(s"Maximum of ${numbers} is "+result)
        //minimum number
      case 9=>
        val numbers=inputNumbers
        val result=calculate.minimumOfTwo(numbers._1,numbers._2)
        println(s"Minimum of ${numbers} is "+result)
      case _=>
        println("Invalid operation")
    }
  }
}

object StartCalculator{
  def main(args: Array[String]): Unit = {
    println("-----------------Calculator-----------------")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiplication")
    println("4. Division")
    println("5. Power")
    println("6. Absolute")
    println("7. Modulus")
    println("8. Maximum of Two")
    println("9. Minimum of Two")
    print("Select operation 1-9 : ")
    val operation=readInt()
    val calculate=new CalculatorImplementation
    calculate.performOperation(operation)
  }
}