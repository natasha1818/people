fun main() {
    var likes:Int = 17
    if(likes == 1){
        println("Понравилось $likes человеку")
    }else if (likes>1&& likes< 5){
        println("Понравилось $likes человекам")
    } else if (likes>5 && likes<= 20){
        println("Понравилось $likes людям")
    }else if (likes>20&& likes%10 == 1)(
            println("Понравилось $likes человеку")
    )else{
        println("Понравилось $likes людям")
    }

}