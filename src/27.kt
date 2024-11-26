fun main() {

}

fun removeElement(nums: IntArray, v: Int): Int {
    var c = if (nums.size > 0) 1 else 0
    for (i in nums.indices) {
        if (v == nums[i]) continue
        nums[c] = nums[i]
        c++

    }
    return c

}