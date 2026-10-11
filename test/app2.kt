fun main() {
    var name: String = "Melstroy"
    println(name)
    name = "Xyesos"
    println(name)
    var text: String = "король жопа \nи хуесос \nи гандон дырявый \nкак гитлер"
    println(text)
    var firstName: String = "Mama"
    var lastName: String = "Ptica"
    println("Your name: $firstName $lastName") // знак $ позволяет вставлять переменную в вывод
    var age = 24
    var age1 = 34L
    println(age)
    age = age1.toInt()
    println(age)
    var any: Any = "TomPearl1488"
    println(any)
    any = 1337.toLong()
    println(any)
}