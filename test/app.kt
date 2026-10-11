const val pidor = "8=====D" /*  констата с неизменяемым значением которое
                                     выясняется еще на моменте компиляции */

fun main() {
    var melstroy: Int = 1488 // изменяемая перменная типа Int
    val gay: Int = 228 // неизменяемая переменная типа Int
    var a: Byte = 127 // изменяемая переменная типа Byte
    val b: Short = 45 // изменяемая переменная типа Short 
    val c: Int = -250 // изменяемая переменная типа Int
    val d: Long = 30000L // изменяемая переменная типа Long
    val e: ULong = 30000U
    val float: Double = 3.1415926535
    val double: Float = 1.946293F
    val q: Double = 72e6
    val f: Boolean = true
    val g: Boolean = false
    val m: Char = 'M'
    // я больше не буду их расписывать, они все обозначены

    println("Любимое число мелстроя это $melstroy") // вывод этой переменной вместе с текстом

    melstroy = 1337 // задаю другое число переменной

    println(melstroy);println(melstroy) // вывожу перемнную без текста
    println("pososi $pidor") // вывожу констату вместе с текстом
    println(gay) // вывожу неизменяемую перемнную
    println(a) // вывод переменной a типа Byte
    //я заебался писать коментарии к простым хуйням, поэтому теперь пояснения у сложного будет.
    println(b)
    println(c)
    println(d)
    println(e)
    println(float)
    println(double)
    println(q)
    println(m)
}