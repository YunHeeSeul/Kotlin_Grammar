package lec10

class Cat( //1.추상클래스
    species: String //주생성자
) : Animal(species,4){   //코드의 의미는 Cat 클래스를 만드는데 species라는 String을 받는 생성자가 같이 생기고
    //그 다음 Animal이라는 클래스를 상속받고 있는데 Cat 클래스를 만들어 줄 때
    //Animal 클래스의 생성자(constructor)를 불러주고 아까 받았던 species와 4라는 값을 넣어줌

    override fun move(){ //java에서는 Override라는 어노테이션을 썼지만 코틀린에서는 키워드 ovveride를 사용
        println("고양이가 사뿐 사뿐 걸어가~")
    }

    //정리
    //extends 키워드 사용하지 않고 :사용
    //어떤 클래스를 상속받을 대 무조건 상위 클래스의 생성자를 바로 호출해야함
    //그래서 Animal 클래스에 species와 4를 넣어주는 식으로 생성자를 바로 호출했음
    //override를 필수적으로 붙여줘야 함
}