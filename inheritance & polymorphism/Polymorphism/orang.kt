package Polymorphism

open class orang {
    var nik: String = ""
    var nama: String= ""
    var alamat: String=""

    open fun perkenalan(){
        println("Hallo, nama saya $nama, alamat saya di $alamat")
    }
}