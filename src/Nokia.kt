class Nokia(model:String):Smartphone("Nokia", model) {
    private val oSystem: String ="Symbian OS"

    fun dualSIM() {
        println("$brand $model работает под ОС:$oSystem, поддерживает две SIM-карты.")
    }
}