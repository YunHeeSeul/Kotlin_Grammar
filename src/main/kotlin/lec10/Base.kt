package lec10

//3. 주의할점
//둘 다 그냥 일반 클래스
//base클래스가 위에 있고 derived클래스가 아래에 있음. 즉 derived 클래스가 base 클래스를 상속받고 있음
//base 클래스를 다른 클래스가 상속받을 수 있도록 open으로 열어줌.
//number 라는 프로퍼티도 누군가 override 할 수 있게끔 open으로 열어줌

//상위 클래스를 설계할 떄 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 함
fun main(){
    Derived(300)
}
open class Base (
    open val number: Int = 100
){
    init {
        println("Base class")
        println(number)
    }

}

class Derived(
    override val number: Int
) : Base(number) {
    init{
        println("Derived class")
    }
}