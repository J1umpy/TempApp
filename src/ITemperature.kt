interface ITemperature {
    fun getTemp() : Double // Return base temperature
    fun getTempIn(unit: Unit) : Double // Return converted temperature
}