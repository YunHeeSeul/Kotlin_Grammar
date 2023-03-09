package lec05

//1.if문
fun validateScoreIsNotNegative(score: Int){
    if(score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

//2. Expression & Statement
fun getPassOrFail(score: Int): String{
    if(score >= 50){
        return "P"
    }else{
        return "F"
    }
}
fun getPassOrFail2(score: Int): String{
    return if(score >= 50){
        "P"
    }else{
        "F"
    }
}

fun getGrade(score: Int): String{
    return if (score >= 90){
        "A";
    } else if (score >= 80){
        "B";
    } else if (score >= 70){
        "C";
    } else {
       "D";
    }
}

//tip
fun validateScoreIsNotNegative1(score: Int){
    if(score !in 0..100){ //만약 score가 0과 100사이에 존재하지 않으면
        throw IllegalArgumentException("${score}는 0과 100 사이에 없습니다.")
    }
}

//switch문
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10){
        9->"A"
        8->"B"
        7->"C"
        else -> "D"
    }
}
fun getGradeWithSwitch1(score: Int): String{
    return when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}
fun startsWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}
fun judgeNumber(number: Int){
    when(number){
        1, 0, -1->"어디서 많이 본 숫자입니다."
        else->"1, 0, -1이 아닙니다"
    }
}
fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}


fun main(){

}