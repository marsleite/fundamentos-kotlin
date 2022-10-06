package fundamentos

data class Pessoa(
  val nome: String,
  val idade: Int
) {
}

fun main() {
  var marcelo = Pessoa("Marcelo", 37)

  println(marcelo)
}