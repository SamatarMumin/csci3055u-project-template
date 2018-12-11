fun main(args: Array<String>) {
   val keyval = 8 //Getting the key
    val key = keyval % 26 // Taking mod 26 for the alphabet
    val encoded = encrypt("Brother please give me 100.", key) //Calling encrypyt functions
    println(encoded)
    val decoded = decrypt(encoded, keyval) //calling decrypt
    println(decoded)
}
//Encrypt function
    fun encrypt(s: String, keyval: Int): String {
        var character: Char
        val chars = CharArray(s.length)
        for ((index, c) in s.withIndex()) {

            if (c in 'A'..'Z') {
                character = c + keyval
                if (character > 'Z') character -= 26
            }

            else if (c in 'a'..'z') {
                character = c + keyval
                if (character > 'z') character -= 26
            }
            else
                character = c
            chars[index] = character

        }
        return chars.joinToString("")
    }
//Decrypt
    fun decrypt(s: String, keyval: Int): String {
    var character: Char
    val chars = CharArray(s.length)
    for ((index, c) in s.withIndex()) {

        if (c in 'A'..'Z') {
            character = c + (26-keyval)
            if (character > 'Z') character -= 26
        }

        else if (c in 'a'..'z') {
            character = c + (26-keyval)
            if (character > 'z') character -= 26
        }
        else
            character = c
        chars[index] = character

    }
    return chars.joinToString("")


    }

