package lec01

import com.lannstark.lec01.Person

fun main() {
    //1. 변수 선언 키워드
    var number1 = 10L //가변
    val number2 = 10L //불변

    var number3: Long = 10L //타입 작성

    //2. primitive type
    var num1 = 10L
    var num3 = 1_000L

    //3. nullable 변수
    var n1: Long? = 1_000L
    n1 = null

    //4. 객체 인스턴스화
    var person = Person("최태현")
}