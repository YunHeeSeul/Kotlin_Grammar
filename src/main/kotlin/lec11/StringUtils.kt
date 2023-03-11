package lec11

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
){
    var price = _price //price에 접근하는 getter는 public
    private set //price에 접근하는 setter는 private
}