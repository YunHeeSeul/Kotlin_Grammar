package lec08

fun main(){
    repeat("Hello World", 3, true)
    repeat1("Hello World")
    //3. named argument
    repeat1("Hello World", useNewLine=false)
    printNameAndGender("FEMALE","홍길동")
    //4. 같은 타입의 여러 파라미터 받기
    //,로 구분하는 경우
    printAll("A","B","C")
    //배열을 쓰는 경우
    val array = arrayOf("A","B","C")
    printAll(*array)
}
//1. 함수 선언 문법
fun max(a: Int, b: Int): Int{
    return if(a>b){
        a
    }else{
        b
    }
}

//=을 사용하는 경우에만 가능! a나 b를 반환하는데 모두 Int 타입임. 이걸 코틀린에서 자동 추론하기 때문에 반환 타입을 생략할 수 있음
//if-else를 밑으로 내리지 않고 위로 올려도 됨
fun max1(a: Int, b: Int) = if(a>b) a else b


//2. default parameter
fun repeat(str: String, num: Int, useNewLine: Boolean) {
    for (i in 1..num){
        if (useNewLine){
            println(str)
        }else{
            println(str)
        }
    }
}
fun repeat1(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num){
        if (useNewLine){
            println(str)
        }else{
            println(str)
        }
    }
}

//3. named argument
fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}


//4. 같은 타입의 여러 파라미터 받기
fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}

