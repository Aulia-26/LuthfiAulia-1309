package Polymorphism

class Mahasiswa : orang() {

    var nim: String=""
    var prodi: String=""
    var organisasi : String=""
    var jabatan : String=""


    fun belajar(){
        println("Saya belajar di prodi $prodi")
    }

    fun organisasi(){
        println("Saya bergabung di organisasi $organisasi dengan jabatan sebagai $jabatan")
    }

    override fun perkenalan() {
        println("Kenalin dong, aku $nama dari $alamat")
    }

    override fun kesukaan() {
        println("aku sangat suka $hobi di $tempat dekat rumah")
    }
}