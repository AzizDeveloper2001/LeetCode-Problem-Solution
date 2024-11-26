fun main() {

}

fun strStr(haystack: String, needle: String): Int {

    if(haystack.length<needle.length){
        return -1
    }

    for(i in 0 until  haystack.length-needle.length){
        if(haystack.substring(i, i+needle.length) == needle){
            return i
        }
    }
    return -1
}