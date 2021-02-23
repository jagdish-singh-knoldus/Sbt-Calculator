import org.scalatest.flatspec.AnyFlatSpec
class CalculatorSpec extends AnyFlatSpec{
  val calculator=new Calculator

  "number " should " not divide by zero"in{
    val res=calculator.division(1,0)
    assert(res=="undefined! cannot divide by zero")
  }
  "division " should " number 2 is not zero"in{
    val res=calculator.division(50,10)
    assert(res==5)
  }

  "number " should " not calculate modulus if denominator is zero"in{
    val res=calculator.modulus(1,0)
    assert(res=="undefined! cannot divide by zero")
  }
  "modulus " should " be calculated if denominator is not zero"in{
    val res=calculator.modulus(15,3)
    assert(res==0)
  }
  "addition " should " be performed for two numbers"in{
    val res=calculator.addition(1,9)
    assert(res==10)
  }
  "subtraction " should " be performed for two numbers"in{
    val res=calculator.subtraction(12,9)
    assert(res==3)
  }
  "multiplication " should " be performed for two numbers"in{
    val res=calculator.multiplication(12,9)
    assert(res==108)
  }
  "number 1 " should "be returned maximum is number 1"in{
    val res=calculator.maximumOfTwo(12,9)
    assert(res==12)
  }
  "number 2 " should "be returned maximum is number 2" in{
    val res=calculator.maximumOfTwo(12,91)
    assert(res==91)
  }
  "number 1 " should "be returned minimum is number 1"in{
    val res=calculator.minimumOfTwo(12,91)
    assert(res==12)
  }
  "number 2 " should "be returned minimum is number 2"in{
    val res=calculator.minimumOfTwo(12,9)
    assert(res==9)
  }
  "minimum of two" should "return equal for equal numbers"in{
    val res=calculator.minimumOfTwo(12,12)
    assert(res=="not found! numbers are equal")
  }
  "maxiimum of two" should "return equal for equal numbers"in{
    val res=calculator.maximumOfTwo(12,12)
    assert(res=="not found! numbers are equal")
  }
  "power" should "be calculated for two numbers"in{
    val res=calculator.power(3,2)
    assert(res==9.0)
  }
  "absoulte" should "be calculated for number"in{
    val res=calculator.absolute(3)
    assert(res==3.0)
  }
}
