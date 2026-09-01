//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val myTemp = Temperature(Temperature.Unit.K)

    myTemp.setTemp(0.0)

    println("The temperature is ${myTemp.getTemp()}")
}