import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Nama : ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Silahkan Diisi terlebih Dahulu")
        main()
    }
    print("Kelas : ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Silahkan Diisi terlebih Dahulu")
        main()
    }
    print("Absen : ")
    val absen: String? = input.nextLine()
    if(absen.isNullOrEmpty()) {
        print("Silahkan Diisi terlebih Dahulu")
        main()
    }
    println("Menghitung Bangun Ruang")
    println("1. Volume Tabung")
    println("2. Volume Kerucut")
    print("Pilih : ")
    val choose: Int = input.nextInt()
    val choosen : String
    choosen = (if (choose == 1) {
        print("Masukkan jari-jari : ")
        val radA: Double = input.nextDouble()
        print("Masukkan tinggi : ")
        val heightA: Double = input.nextDouble()
        println("Maka volume tabung adalah ${cylinder_Vol(radA, heightA)}")
    } else if (choose == 2) {
        print("Masukkan jari-jari : ")
        val radB: Double = input.nextDouble()
        print("Masukkan tinggi : ")
        val heightB: Double = input.nextDouble()
        println("Maka volume kerucut adalah ${cone_Vol(radB, heightB)}")
    } else {

        "Tidak Tersedia"
    }).toString()
    print(choosen)
}

fun cylinder_Vol(radA : Double, heightA : Double): Double {
    val v = 3.14 * radA * radA * heightA
    return v.toDouble()
}

fun cone_Vol(radB : Double, heightB : Double): Double {
    val v = 3.14 * radB * radB * heightB / 3
    return v.toDouble()
}
