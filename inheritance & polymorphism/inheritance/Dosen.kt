package inheritance

import Polymorphism.karyawan

class Dosen : karyawan() {

    var prodi: String=""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi")
    }

}