fun main() {
    val myTemp: Temperature = Temperature(Temperature.Unit.K)

    myTemp.setTemp(0.0)

    println("The temperature is ${myTemp.getTemp(Temperature.Unit.K)}")
}