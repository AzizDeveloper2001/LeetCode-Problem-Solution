import kotlin.math.abs

fun main() {

}

fun divide(dividend: Int, divisor: Int): Int {

    var newDividend = dividend
    var newDivisor = divisor
    var count = 0
    if((newDividend >0 && newDivisor >0) || (newDividend<0 && newDivisor<0)) {

    }
    while(newDividend>=newDivisor){
        newDividend-=newDivisor
        if(count== Int.MAX_VALUE){
            break
        }
        count++
    }

    if(divisor<0 && dividend<0){
        return count
    } else if(divisor<0 || dividend<0){
        return -count
    }
    return count
}
