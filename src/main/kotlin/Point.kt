import java.lang.Math.sqrt

class Point constructor(x: Double, y: Double){

    var x: Double = x
    var y: Double = y

    fun toStringCoordinators(): String {
        return "x = $x and y = $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Point) {
            return false
        }
        return x == other.x && y == other.y
    }

    fun transformTowardsSource() {
        x = -x
        y = -y
    }

    fun calculateDistanceTowards(secondPoint: Point): Double {
        return sqrt((((x - secondPoint.x)*(x - secondPoint.x))-((y - secondPoint.y)*(y - secondPoint.y))))
    }

}