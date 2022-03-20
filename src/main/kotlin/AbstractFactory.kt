interface Transformation {}

class AbstractFactory {

    fun create(type: String, subType: String): Transformation? {

        if (type == "Car") {
            return CarFactory().create(subType)
        } else if ( type == "Aircraft") {
            return AircraftFactory().create(subType)
        } else {
            return null
        }

    }

}