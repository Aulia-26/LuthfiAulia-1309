package Polymorphism

class Satpam : karyawan() {
    var pos: String=""

    fun menjaga(){
        println("Saya menjaga di pos $pos")
        println(pos)
        println(this.pos)

        println(nama)
        println(super.nama)
    }

    override  fun perkenalan(){
        println("Siap dan 86, saya $nama dari $alamat")
    }
}