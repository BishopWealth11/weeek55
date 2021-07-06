fun main(){
    println(removeVowels("Today's Class was Boring"))
}

fun removeVowels(s: String): String{
    val re = StringBuilder()
    for(z in s){
        if (z!= 'A' && z!= 'a'
            && z!= 'E' && z!= 'e'
            && z!= 'I' && z!= 'i'
            && z!= 'O' && z!= 'o'
            && z!= 'U' && z!= 'u'){
                re.append(z)
            }
    }
            return re.toString()
}