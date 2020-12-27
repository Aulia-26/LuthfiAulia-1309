package inheritance

open class orang {
    var nik: String = ""
    var nama: String= ""
    var alamat: String=""
    var hobi : String=""
    var tempat : String=""
    var makanan : String=""
    var minuman : String=""
    var hewan : String=""
    var bunga : String=""

    fun perkenalan(){
        println("Hallo, nama saya $nama, alamat saya di $alamat")
    }

    open fun kesukaan(){
        println("Saya suka $hobi di $tempat")
    }

    fun makanan(){
        println("Saya sangat suka makan $makanan dan minum $minuman")
    }

    fun memelihara(){
        println("Saya memelihara 2 ekor $hewan dan menanam beberapa bunga $bunga")
    }

}
