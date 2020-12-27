package Polymorphism

class Dosen : karyawan() {

    var prodi: String=""
    var matkul: String=""
    var kampus: String=""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi mata kuliah $matkul di universitas $kampus")
    }

    override fun perkenalan(){
        println("Perkenalkan nama saya $nama, alamat saya di $alamat")
    }

    override fun kesukaan() {
        println("Saya senang $hobi Mahasiswa di $tempat")
    }
}