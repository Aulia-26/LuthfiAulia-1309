fun main(){

    val fifi : Human_ = Human_("fifi")
    val nana : Human_ = Human_("nana")

    fifi.email = "fifi26@gmail.com"
    fifi.address = "Belitang, OKU Timur, SUMSEL"

    nana.email = "nana13@gmail.com"
    nana.address = "Belitang, OKU Timur, SUMSEL"

    fifi.talk()
    nana.talk()

    fifi.introduce()

    println(fifi.verify("fifi26@gmail.com"))

    println(Cia.name)

    val ciara : Cia = Cia
    println(ciara.nationality)

    println(fifi)
}