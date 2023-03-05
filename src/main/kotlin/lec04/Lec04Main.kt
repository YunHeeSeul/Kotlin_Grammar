package lec04

import com.lannstark.lec04.JavaMoney

fun main() {
    //2. 비교연산자
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다")
    }

    //2. 동등성 동일성
    val m1 = JavaMoney(1_000L)
    val m2 = m1
    val m3 = JavaMoney(1_000L)
    println(m1===m3) //주소가 다르기 때문에 false 출력
    println(m1==m3) //값이 같기 때문에 true 출력


    //3. 코틀린에 있는 특이 연산자
    val str = "ABC"
    println(str[2]) //C


    //4.연산자 오버로딩
    val moneyA = Money(2_000L)
    val moneyB = Money(1_000L)
    println(moneyA + moneyB) // Money(amount=3000)
}