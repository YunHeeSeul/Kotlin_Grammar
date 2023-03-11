package lec10

interface Flyable {
    fun act(){
        println("파닥 파닥")
    }
    //코틀린의 인터페이스는 default 메소드를 구현할 때 default 키워드 없이 메소드 구현이 가능하다

    //코틀린에서도 자바와 똑같이 추상 메소드 만들 수 있음
    //fun fly()
}