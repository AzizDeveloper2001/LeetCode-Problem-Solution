fun main() {


}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    var magazinemap = HashMap<Char,Int>()
    magazine.forEach {
        var currentValue = magazinemap.getOrDefault(it,0)
        magazinemap.put(it,currentValue+1)
    }

    ransomNote.forEach {
        var currentValue = magazinemap.getOrDefault(it,0)

        if(currentValue == 0){
            return false
        }

        magazinemap.put(it,currentValue-1)
    }
    return true

}