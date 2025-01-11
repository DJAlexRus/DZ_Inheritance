fun main() {
//Задание1
    val cat=Cat()
    cat.name = "Муся"
    cat.weight = 8
    cat.type = "Кошка"
    cat.toEating()
    println(cat.toString())
    println()
    val dog=Dog()
    dog.name = "Полкан"
    dog.weight = 22
    dog.type = "Собака"
    dog.toEating()
    println(dog.toString())
    println("--------------------------")
//Задание2
    println()
    val nokiaPhone = Nokia("808 PureView")
    val sonyPhone = Sony("Xperia")
    val iPhone =Iphone("13 Pro Max")
    println("Телефоны ${nokiaPhone.brand}:")
    nokiaPhone.dualSIM()
    nokiaPhone.makeCall("+7(912)3333333")
    println("Телефоны ${sonyPhone.brand}:")
    sonyPhone.makeCall("+7(912)2222222")
    sonyPhone.waterproof()
    println("Телефоны ${iPhone.brand}:")
    iPhone.makeCall("+7(912)1111111")
    iPhone.shockproof()
//Задание3
    println()
    val numberArr = arrayOf(3, 67, 1, 55, 65, 89, 23)
    print("Элементы массива которые делятся на 5: [")
    var j=0
    for (i in numberArr.indices){
        if (numberArr[i]%5==0) {
            if (j>0) print(", ")
            print(numberArr[i])
            j++
        }
    }
    print("]")
}
