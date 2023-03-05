package lec02

import com.lannstark.lec02.Person

fun main() {
    //2. Safe Call
    val str: String?="ABC"
    println(str?.length)

    //2. Elvis
    println(str?.length ?: 0) //3

    val st: String?=null
    println(st?.length ?: 0) //0


    //4. 플랫폼 타입
    val person = Person("공부하는 개발자")
    startsWithA(person.name)
}
//4. 플랫폼 타입
fun startsWithA(str: String): Boolean{
    return str.startsWith("A")
}


//1. null 체크
fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//    return str.startsWith("A")
    //코드 정리
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    //코드 정리
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null){
//        return false
//    }
//    return str.startsWith("A")
    //코드 정리
    return str?.startsWith("A") ?: false
}