class Square(var x: Int, var y: Int, var size: Int) : Figure(0), Movable, Transforming {

    override fun area(): Float {
        return (size * size).toFloat()
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun resize(zoom: Int) {
        size *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val dx = x - centerX
        val dy = y - centerY

        when (direction) {
            RotateDirection.Clockwise -> {
                x = centerX + dy
                y = centerY - dx
            }
            RotateDirection.CounterClockwise -> {
                x = centerX - dy
                y = centerY + dx
            }
        }
    }

    override fun toString(): String {
        return "Square(x=$x, y=$y, size=$size, area=${area()})"
    }
}