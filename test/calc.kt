fun main() {
    println("Если ответ требуется с точкой, то пишите с число в виде \"123.0\".")
    print("Напиши свое первое число: ")
    var z = readln().toDouble()
    print("Напишите свое действие: ")
    var c = readln()
    print("Напиши свое второе число: ")
    var x = readln().toDouble()
    print("\n")
    if(c == "+") {
        var v = z + x
        println("Ваш ответ: $v")
    } else if(c == "-") {
        var v = z - x
        println("Ваш ответ: $v")
    } else if(c == "*") {
        var v = z * x
        println("Ваш ответ: $v")
    } else if(c == "/") {
        var v = z / x
        println("Ваш ответ: $v")
    } 
}