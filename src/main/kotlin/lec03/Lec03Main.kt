package lec03

import com.lannstark.lec03.Person

fun main(){
    //1.기본타입
    val number1 = 3
    val number2: Long = number1.toLong()

    val num1: Int? = 3
    val num2: Long = num1?.toLong() ?: 0

    //4.String Interpolation, String indexing
    val person = Person("홍길동", 100)
    println("이름 : ${person.name}")
    val name = "seuri"
    println("이름 : $name")


    val lastname = "yoon"
    val str = """
        ABC
        EFG
        ${lastname}
    """.trimIndent()
    println(str)

    //특정 문자 가져오기
    val st = "ABS"
    println(st[0])
    println(st[1])
    println(st[2])

}
//2.타입 캐스팅
fun printAgeIfPerson(obj: Any) {
    if (obj is Person){
        val person = obj as Person
        println(person.age)
    }

    //instanceof와 반대되는 개념 => !is
//    if (obj !is Person){
//        val person = obj as Person
//        println(person.age)
//    }
}

//obj가 null이 올 수 있다면?
fun printAgeIfPerson1(obj: Any?){
    if (obj is Person){
        val person = obj as? Person
        println(person?.age)
    }
}