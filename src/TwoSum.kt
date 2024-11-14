

fun main(args: Array<String>) {
    println(twoSum(intArrayOf(4, 2, 5, 6, 7), 9).contentToString())
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    var map = HashMap<Int, Int>()
    nums.forEachIndexed{ index,value ->
        map[target-value]?.let { mapValue->
            return intArrayOf(mapValue,index) }
        map[value] = index
    }
    return intArrayOf()
}