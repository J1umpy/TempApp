abstract class Temperature(
    val unit: Unit,
    private var temp: Double = 0.0
) : ITemperature {

    init {
        // Temp is stored as Kelvin
        setTemp(unit, temp)
    }

    private fun setTemp(unit: Unit, temp: Double) {
        this.temp = when (unit) {
            Unit.C -> 273.15 + temp
            Unit.F -> ((temp - 32) * (5.0 / 9.0)) + 273.15
            else -> temp
        }
    }

    fun setTemp (temp: Double) {
        setTemp(unit, temp)
    }


    protected fun getTemp (newUnit: Unit = unit) = when (newUnit) {
        Unit.C -> temp - 273.15
        Unit.F -> ((temp - 273.15) * (9.0 / 5.0)) + 32
        else -> temp
    }

    enum class Unit {
        C, F, K
    }

}
class Kelvin(temp: Double) : Temperature(Unit.K, temp){
    override fun getTemp(): Double {
        return super.getTemp(Unit.K)
    }
    override fun getTempIn(unit: Unit): Double {
        TODO("Not yet implemented")
    }
}

class Celsius(temp: Double) : Temperature(Unit.C, temp){
    override fun getTemp(): Double{
        return super.getTemp(Unit.C)
    }
    override fun getTempIn(unit: Unit): Double {
        TODO("Not yet implemented")
    }
}

class Fahrenheit(temp: Double) : Temperature(Unit.F, temp){
    override fun getTemp(): Double {
        return super.getTemp(Unit.F)
    }
    override fun getTempIn(unit: Unit): Double {
        TODO("Not yet implemented")
    }
}
