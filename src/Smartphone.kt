open class Smartphone(val brand: String,val model: String ) {


    fun makeCall(number: String) {
        println("Звонок c номера $number на телефон: $brand $model.")
    }


}