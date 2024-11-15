fun main() {
    println(runningSum(intArrayOf(1, 2, 3, 4)))
}
fun runningSum(nums: IntArray): IntArray {
    var sum= 0
    for (i in nums.indices) {
        sum += nums[i]
        nums[i] = sum
    }

    nums.contentToString().toString()
    return nums
}
