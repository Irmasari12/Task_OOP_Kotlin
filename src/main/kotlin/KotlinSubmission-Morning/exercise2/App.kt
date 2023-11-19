package id.infinitelearning.KotlinSubmission.exercise2

fun bilangan() {
    val Numbers = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            Numbers.add(i)
        }
    }
    println("Bilangan genap dari 1 hingga 100 : ")
    println(Numbers)
}

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */



    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini

    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */

    fun bulanlahir() {
            val Bulan = mapOf(
                "Jan" to "January",
                "Feb" to "February",
                "Mar" to "March",
                "Apr" to "April",
                "Mei" to "Mei",
                "Jun" to "June",
                "Jul" to "Juli",
                "Agust" to "Agustus",
                "Sep" to "September",
                "Oct" to "October",
                "Nov" to "November",
                "Des" to "Desember"
            )
            println("Daftar nama bulan :")
            Bulan.forEach { (key, value) ->
                println("$key -> $value")
            }
            val monthNow = "Nov"
            val birthMonth = "Mar"

            println("It's $monthNow now, I was born in $birthMonth")

    }

fun main() {
    bilangan()
    bulanlahir()
}

