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


fun main(){

}