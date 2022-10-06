package fundamentos

class Pessoa(
  val nome: String,
  val idade: Int
) {
  override fun toString(): String {
    return "Nome: ${nome} e idade: ${idade}"
  }
}

fun main() {
  var marcelo = Pessoa("Marcelo", 37)

  println(marcelo)
}