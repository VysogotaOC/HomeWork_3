package deusvult.petrkamaev.homework_3

class RectangleWL(var width: Int = 0, var length: Int = 0) {
    fun S(): Int = width * length
    fun P(): Int = (width + length) * 2
}