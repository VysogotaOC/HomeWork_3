package deusvult.petrkamaev.homework_3

class CircleR(var Radius: Int = 0) {
    fun S(): Double = Math.PI*Radius*Radius
    fun P(): Double = 2*Math.PI*Radius
}