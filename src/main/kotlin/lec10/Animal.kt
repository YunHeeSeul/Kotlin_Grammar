package lec10

abstract class Animal ( //1.추상클래스
    protected val species: String,
    protected open val legCount: Int    //코틀린에서는 자바와 달리 프로퍼티를 override 할 때 무조건 open을 붙여줘야만 함
){
    abstract fun move()
}

//정리
//추상프로퍼티가 아니라면 상속 받을 때 꼭 open을 붙여야 함
//추상클래스에서 자동으로 만들어진 getter를 override
//상위클래스에 접근하는 키워드는 자바와 마찬가지로 super임.
//자바와 코틀린 모두 추상 클래스는 인스턴스화 할 수 없음