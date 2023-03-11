package lec12

import com.lannstark.lec12.Movable

fun main(){
    //2. 싱글톤
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    //3. 익명클래스
    //new Movable 대신 object : Movable 하고 중괄호 안에 구현
    moveSomething(object : Movable {
        override fun move() {
            println("무브무브")
        }

        override fun fly() {
            println("날아")
        }
    })
}
//3. 익명클래스
private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}


//1. static 변수와 함수
class Person private constructor(
    var name: String,
    var age: Int,
){
    companion object Factory : Log { //이름 붙일 수 있음
        private val MIN_AGE = 1
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory")
        }
    }
}


//2. 싱글톤
object Singleton{
    var a: Int = 0
}