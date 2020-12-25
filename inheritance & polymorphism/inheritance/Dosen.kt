package inheritance

class Dosen : karyawan() {

    var prodi: String=""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi")
    }

}