fun main() {

    println(rot13("IBarman"))

}


fun rot13(key: String) : String {
    var enKey: String = ""

    for (i in key) {

        if (i >= 'a' && i <= 'm') {
            enKey += (i + 13).toString()
        } else if (i >= 'A' && i <= 'M') {
            enKey += (i + 13).toString()
        } else if (i >= 'n' && i <= 'z') {
            enKey += (i - 13).toString()
        } else if (i >= 'N' && i <= 'Z') {
            enKey += (i - 13).toString()
        }

    }

    return enKey
}