package inheritance

import Polymorphism.karyawan

class Satpam : karyawan() {

    var pos: String=""

    fun menjaga(){
        println("Saya menjaga di pos $pos")
    }
}