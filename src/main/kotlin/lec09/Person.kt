package lec09

fun main(){
    var person = Person("홍길동", 24)
    println(person.name)
}
//1.클래스와 프로퍼티
//class Person constructor(name: String, age: Int) {  //Person 클래스에 대한 생성자를 써 줄 땐 위에 써 줌
//    val name: String = name
//    var age: Int = age
//}
class Person(
    name: String = "ㅁㅎ", //커스텀 게터를 해줄 것이기 때문에 val 뺌
    var age: Int = 1
){
    val name = name //주생성자에서 받은 name ㅁㅎ를 바로 불변 프로퍼티 name에 대입
    get() = field.uppercase() //자기자신을 가리키는 field라는 예약어가 생김. 무한루프를 막기 위해 field 사용.
    //근데 거의 안씀. 그냥 this.name.uppercase()로 사용.

    //커스텀 세터
    //세터를 써야하니 VAR로 바꿔줌.
    //하지만 세터 자체를 사용하는 것을 지양하다보니 커스텀 세터 또한 잘 안 씀씀
   var name2 = name
    set(value) {
        field = value.uppercase()
    }

    //2. 생성자와 init
    init{   //코틀린에는 init이라는 특별한 블록이 존재
        //이 클래스가 초기화 되는 시점에 한 번 호출되는 블록
        //즉, init(초기화) 블록은 생성자가 호출되는 시점에 호출됨
        if(age <=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }
    constructor(name: String): this(name,1)

    //3. 커스텀 getter/setter
    //방법1: 함수처럼
    fun adult(): Boolean{
        return this.age >= 20
    }
    //방법2: 커스텀 getter : 마치 이 Person 클래스에 프로퍼티가 있는 것처럼 보여주는 것
    //val이 프로퍼티니까 괄호는 치지 않고 get 했을 때 어떤 로직을 실행할건지 적어줄 것
    val isAdult: Boolean
    get() = this.age>=20

    val isAdult1: Boolean
        get() {
            return this.age>=20
        }
}
