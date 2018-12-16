package deusvult.petrkamaev.homework_3

class RectangleCOOR(var x1: Int = 0, var y1: Int = 0, var x2: Int = 0, var y2: Int = 0){
    fun S(): Int = Math.abs(x1-x2)*Math.abs(y1-y2)
    fun P(): Int = (Math.abs(x1-x2) + Math.abs(y1-y2)) * 2
}