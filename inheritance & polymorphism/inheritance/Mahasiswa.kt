package inheritance

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
}