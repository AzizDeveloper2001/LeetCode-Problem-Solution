fun main() {

removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4))

}

fun removeDuplicates(nums: IntArray): Int {
    var cnt = if (nums.size > 0) 1 else 0

    for (i in 1 until nums.size) {
        if (nums[i] == nums[i-1]) continue
        nums[cnt] = nums[i]

        println(nums.contentToString())
        cnt++
    }
    println(nums.contentToString())
    return cnt
}