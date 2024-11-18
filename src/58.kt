fun main() {

    println(lengthOfLastWord("   fly me   to   the moon    "))
}

fun lengthOfLastWord(s: String): Int {
    var len = 0
   for(i in s.length-1 downTo 0){
       val ch = s[i]
       if(ch ==' ' && len>0){
           break
       } else if(ch!=' '){
           len++
       }
   }
    return len

}