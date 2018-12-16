package deusvult.petrkamaev.homework_3

import kotlin.math.sqrt

class TriangleClass(var s1: Double = 0.0, var s2: Double = 0.0, var s3: Double = 0.0) {
    var p = (s1+s2+s3)/2
    fun S(): Double = sqrt(p*(p-s1)*(p-s2)*(p-s3))
    fun P(): Double = s1 + s2 + s3
}