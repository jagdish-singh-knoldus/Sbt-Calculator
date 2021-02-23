
# Calculator


## Introduction
 
This project is used to create a calculator in SBT using Scala programming Language.


## Technology

Calculator is implemented in Scala programming language. Scalatest was used for testing Calculator's implementation and SBT for project building.


## Requirements

* Java 11
* Scala 2.13.5
* sbt 1.4.7


## Commands

###clean

This command cleans the sbt project by deleting the target directory. The command output relevant messages.

 ```
 sbt clean 
 ```

###compile
This command compiles the scala source classes of the sbt project.

```
 sbt compile 
 ```
###Run
Enter the project folder and type:
```
 sbt run 
 ```


### Tests

Code is developed by applying [TDD](https://en.wikipedia.org/wiki/Test-driven_development) and tests are located in
folder **/src/test/scala-2.13**,  For running all tests enter the project folder and type:

 ```
 sbt test
 ```

## Library dependencies

* scalatest - test driven development
* scalastyle
* scoverage

More details about project libraraies (e.g. version etc..) can be found in file **build.sbt**




## Functionality


### Calculations


This functionality supports addition, subtraction, multiplication, division, power, Absolute and Modulus  on Double, Long and integer numbers.

e.g.

 ```
 2+5
 ```

A number of samples is given in test file **Calculatorimplementationspec** and **Calculatorspec**.


Source files that are implementing this functionality are:

* Calculator.scala
* CalculatorImplementation.scala
