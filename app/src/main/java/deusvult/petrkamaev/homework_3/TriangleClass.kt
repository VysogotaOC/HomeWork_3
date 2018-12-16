package deusvult.petrkamaev.homework_3

import kotlin.math.sqrt

class TriangleClass(var s1: Int = 0, var s2: Int = 0, var s3: Int = 0) {
    var p: Double = (s1.toDouble()+s2.toDouble()+s3.toDouble())/2
    fun S(): Double = sqrt(p*(p-s1)*(p-s2)*(p-s3))
    fun P(): Int = s1 + s2 + s3
}