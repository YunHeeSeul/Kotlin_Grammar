package lec06

fun main(){
    //1.for-each
    val numbers = listOf(1L, 2L, 3L) //listOf: 리스트를 만들어주는 코드
    for (number in numbers){
        println(number)
    }

    //2.for
    for(i in 1..3){
        println(i)
    }
    //수를 내리는 경우
    for(i in 3 downTo 1) {
        println(i)
    }
    //2칸씩 올라가는 경우
    for(i in 1..5 step 2){
        println(i)
    }


    //4.while문
    var i = 1
    while (i <= 3){
        println(i)
        i++
    }
}