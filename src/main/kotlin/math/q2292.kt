package math

fun beeHouse(room: Int): String {

    var path = 1
    var sum = path

    if (room == path) {
        return path.toString()
    }

    while (sum < room) {
        sum += 6 * path
        path ++
    }
    return path.toString()
}