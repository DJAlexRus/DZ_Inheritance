open class Iphone(model:String): Smartphone("Iphone", model) {
    private val oSystem: String ="iOS"

    fun shockproof() {
        println("$brand $model работает под ОС:$oSystem, является ударопрочным.")
    }
}