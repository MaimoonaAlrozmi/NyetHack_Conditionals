fun main(){

    var healthPoints = 50

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    var playerState = when(karma){
        in 0..5 -> "Red"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        in 16..20 -> "Green"
        else->"  "

    }
    println(playerState)

}

