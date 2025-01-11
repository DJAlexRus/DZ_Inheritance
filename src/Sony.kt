class Sony(model:String):Smartphone("Sony", model) {
    private val oSystem: String ="Android"

    fun waterproof() {
        println("$brand $model работает под ОС:$oSystem, имеет функцию водонепроницаемости.")
    }



}