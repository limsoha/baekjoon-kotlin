package string

fun croatia(str: String): String {
    val changed = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    var result = str
    changed.forEach {
        result = result.replace(it, ".")
    }

    return result.count().toString()
}