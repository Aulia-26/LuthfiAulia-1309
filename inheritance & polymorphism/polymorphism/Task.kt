package Polymorphism

fun main(){

    val afrig = Dosen()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "CondongCatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.matkul = "Bahasa Pemrograman"
    afrig.kampus = "Amikom Yogyakarta"
    afrig.mengajar()
    afrig.hobi = "mengajar"
    afrig.tempat = "kelas"
    afrig.kesukaan()

    val andika = Mahasiswa()
    andika.nama = "Andika Maharani"
    andika.alamat = "Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()
    andika.organisasi = "BEM"
    andika.jabatan = "Bendahara"
    andika.organisasi()
    andika.hobi = "bermain bola"
    andika.tempat = "lapangan"
    andika.kesukaan()

    val budi = Satpam()
    budi.nama = "Budi Satria"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "Barat"
    budi.menjaga()

    val ciara = orang()
    ciara.nama = "Ciara Amberlee"
    ciara.alamat = "Bandung"
    ciara.perkenalan()
    ciara.hobi = "membaca"
    ciara.tempat = "perpustakaan"
    ciara.kesukaan()
    ciara.makanan = "Nasi goreng"
    ciara.minuman = "susu coklat"
    ciara.makanan()
    ciara.hewan = "kucing"
    ciara.bunga = "anggrek"
    ciara.memelihara()
}