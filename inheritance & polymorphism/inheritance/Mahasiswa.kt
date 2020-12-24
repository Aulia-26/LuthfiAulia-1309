package inheritance

class Mahasiswa : orang() {

    var nim: String=""
    var prodi: String=""


    fun belajar(){
        println("Saya belajar di prodi $prodi")
    }
}
