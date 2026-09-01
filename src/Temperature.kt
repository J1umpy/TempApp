abstract class Temperature (
    val unit: Unit,
    private var temp: Double = 0.0
) {

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

    //delete this??
    enum class Unit {
        C, F, K
    }

}


