fun main(args: Array<String>) {

    // Task - 1

    var firstPoint = Point(x = 10.0, y = 20.0)
    println(firstPoint.toStringCoordinators())
    println("-----------------------")

    var secondPoint = Point(x = 10.0, y = 20.0)
    println(firstPoint==secondPoint)
    var thirdPoint = Point(x = 15.0, y = 20.0)
    println(firstPoint==thirdPoint)
    println("-----------------------")

    println(secondPoint.x)
    println(secondPoint.y)
    secondPoint.transformTowardsSource()
    println(secondPoint.x)
    println(secondPoint.y)
    println("-----------------------")

    println(firstPoint.calculateDistanceTowards(thirdPoint))
    println("-----------------------")

    // Task - 2

    var carObj = CarFactory().create("Maserati")
    carObj?.drive()
    println("-----------------------")

    var aircraftObj = AircraftFactory().create("Boeing777")
    aircraftObj?.fly()
    println("-----------------------")

    var abstractObj = AbstractFactory().create("Car", "Audi")
    if (abstractObj != null && abstractObj is Car) {
        abstractObj.drive()
    }
    println("-----------------------")

}
