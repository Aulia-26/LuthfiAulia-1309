package inheritance

class Dosen : karyawan() {

    var prodi: String=""
    var matkul: String=""
    var kampus: String=""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi mata kuliah $matkul di universitas $kampus")
    }

}