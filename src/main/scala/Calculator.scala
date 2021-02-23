class Calculator {
  //function to perform addition
  def addition(number1:Int,number2:Int):Int=number1+number2
//function to perform subtraction
  def subtraction(number1:Int,number2:Int):Int=number1-number2
//function to perform multiplication
  def multiplication(number1:Double,number2:Double):Double=number1*number2
//function to perform division
  def division(number1:Double,number2:Double)={
    if(number2==0)
      "undefined! cannot divide by zero"
    else
      number1/number2
  }
//function to calculate power
  def power(number1: Int, number2: Int): Double = Math.pow(number1, number2)
//function to calculate absolute
  def absolute(number:Double):Double=Math.abs(number)
//function to calculate modulus
  def modulus(number1: Double, number2: Double)={
    if(number2==0)
      "undefined! cannot divide by zero"
    else
      number1%number2
  }
//function to check maximum
  def maximumOfTwo(number1: Int, number2: Int)={
    if(number1>number2)
      number1
    else if(number2>number1)
      number2
    else
      "not found! numbers are equal"
  }
//function to check minimum
  def minimumOfTwo(number1: Int, number2: Int)={
    if(number1<number2)
      number1
    else if(number2<number1)
      number2
    else
      "not found! numbers are equal"
  }
}