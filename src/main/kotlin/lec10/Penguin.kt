package lec10
//Flyable과 Swimmable이라는 두 개 인터페이스가 존재
//이 두 인터페이스를 펭귄이 구현할 것

class Penguin (
    species: String
) : Animal(species, 2), Swimmable, Flyable{ //코틀린에서 인터페이스를 ㅜㄱ현할 때는 똑같이 : 사용

    private val wingCount: Int = 2

    override fun move(){
        println("펭귄이 움직인다")
    }

    //legCount를 get 하는 것을 가져오는 거니까 프로퍼티처럼 보여야하니
    // val legCount: Int가 됨
    override val legCount: Int
    //이 legCount를 누군가 get 했을 때 getter에 대한 새로운 정의를 내려야 하니 커스텀 getter를 만들어줌
    get() = super.legCount + this.wingCount


    //2.인터페이스
    override fun act() {
        //오버라이드할 때 자바와 달라진 점음 자바는 인터페이스 타입.super.메소드인데
        //코틀린은 super 뒤에 꺽새로 타입을 표현하고 그 다음 함수를 불러줌
        super<Swimmable>.act()
        super<Flyable>.act()
    }


    //인터페이스 구현도 :를 사용
    //중복되는 인터페이스를 사용할 때 super<타입>.함수 사용
    //자바와 코틀린 둘 다 인터페이스를 인스턴스화 할 순 없음
    //코틀린에서는 backing field가 없는 프로퍼티를 인터페이스에 만들 수 있다
    override val swimAbility: Int
    get() = 3
}