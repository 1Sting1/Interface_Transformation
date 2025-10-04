fun main() {
    val rect = Rect(0, 0, 10, 5)
    val circle = Circle(20, 20, 5)
    val square = Square(40, 40, 8)

    println("Исходные фигуры")
    println(rect)
    println(circle)
    println(square)
    println()

    println("Тест перемещения (move)")
    rect.move(5, 3)
    circle.move(-10, 5)
    square.move(2, -2)
    println("После перемещения:")
    println(rect)
    println(circle)
    println(square)
    println()

    println("Тест масштабирования (resize)")
    rect.resize(2)
    circle.resize(3)
    square.resize(2)
    println("После увеличения:")
    println(rect)
    println(circle)
    println(square)
    println()

    println("Тест поворота по часовой стрелке")
    val centerX = 50
    val centerY = 50
    println("Центр поворота: ($centerX, $centerY)")

    val rect2 = Rect(50, 40, 10, 5)
    val circle2 = Circle(60, 50, 3)
    val square2 = Square(50, 60, 6)

    println("До поворота:")
    println(rect2)
    println(circle2)
    println(square2)

    rect2.rotate(RotateDirection.Clockwise, centerX, centerY)
    circle2.rotate(RotateDirection.Clockwise, centerX, centerY)
    square2.rotate(RotateDirection.Clockwise, centerX, centerY)

    println("\nПосле поворота по часовой стрелке:")
    println(rect2)
    println(circle2)
    println(square2)
    println()

    println("Тест поворота против часовой стрелки")
    rect2.rotate(RotateDirection.CounterClockwise, centerX, centerY)
    circle2.rotate(RotateDirection.CounterClockwise, centerX, centerY)
    square2.rotate(RotateDirection.CounterClockwise, centerX, centerY)

    println("После поворота против часовой стрелки (возврат):")
    println(rect2)
    println(circle2)
    println(square2)
    println()

    println("Работа с коллекциями")
    val figures: Array<Figure> = arrayOf(
        Rect(0, 0, 5, 3),
        Circle(10, 10, 4),
        Square(20, 20, 6)
    )

    println("Площади всех фигур:")
    figures.forEachIndexed { index, figure ->
        println("Фигура $index: площадь = ${figure.area()}")
    }

    println("\nОбщая площадь всех фигур: ${figures.sumOf { it.area().toDouble() }}")

    val movables: Array<Movable> = arrayOf(
        Rect(0, 0, 1, 1),
        Circle(5, 5, 2),
        Square(10, 10, 3)
    )

    println("\nМассовое перемещение фигур")
    movables.forEach { it.move(100, 100) }
    movables.forEach { println(it) }
}