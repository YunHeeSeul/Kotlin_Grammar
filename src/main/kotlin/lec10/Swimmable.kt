package lec10

interface Swimmable {
    //코틀린에서는 backing field가 없는 프로퍼티를 인터페이스에 만들 수 있다
    //이 프로퍼티는 이 Swimmable에 필드가 있는게 아니라 사실은 getter에 대한 것을 아래에서(Penguin)에서 구현해주길 기대하는 것.
    val swimAbility: Int //수영능력치

    fun act(){
        println("어푸 어푸")
    }
}