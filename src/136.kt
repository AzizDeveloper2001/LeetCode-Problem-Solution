fun main() {

}

fun singleNumber(nums: IntArray): Int {

    var a=0
    for (num in nums) {
        a= a xor num
    }
    return a
}
