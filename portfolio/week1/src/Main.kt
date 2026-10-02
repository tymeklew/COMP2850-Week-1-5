//  COMP2850 Portfolio: Week 1
// Program to compute area of a triangle


import kotlin.math.sqrt

import kotlin.system.exitProcess


fun herons(a : Float , b : Float , c : Float) : Float  {

    // Semi-perimiter

    val s = (a + b + c)/2

    return sqrt(s * (s-a) * (s-b) * (s-c))

}


fun main(args : Array<String>) {

    if (args.size != 3) {

        println("Error: values for a, b, c required on command line")

        exitProcess(1)

    }


    val (a, b, c) = args.toList().map( {it.toFloat()})


    val area = herons(a , b , c)

    println("Area = ${"%.5f".format(area)}")

}

