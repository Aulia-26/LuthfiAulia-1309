package Polymorphism

class Dosen : karyawan() {

    var prodi: String=""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi")
    }

    override fun perkenalan(){
        println("Perkenalkan nama saya $nama, alamat saya di $alamat")
    }

}