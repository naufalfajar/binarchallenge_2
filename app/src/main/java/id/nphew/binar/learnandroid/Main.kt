package id.nphew.binar.learnandroid

open class Rectangle {
    open var width: Int = 0
    open var height: Int = 0
    open fun area(): Int {

        return width * height
    }
}

class Square : Rectangle() {

    override var width: Int
        get() = super.width
        set(width) {
            super.width = width
            super.height = width
        }
    override var height: Int
        get() = super.height

        set(height) {
            super.width = height
            super.height = height
        }
}

fun main() {

    val rectangleFirst: Rectangle = Rectangle()

    rectangleFirst.width = 2
    rectangleFirst.height = 3

    val rectangleFirstText = rectangleFirst.area().toString()
    println(rectangleFirstText)

    val rectangleSecond: Rectangle = Square()

    rectangleSecond.width = 2
    rectangleSecond.height = 3
    val rectangleSecondText = rectangleSecond.area().toString()

    println(rectangleSecondText)
}


