package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun main() {
    val Input = "Halo aku salah satu peserta MSIB di IL"

        try {
            val number = Input.toInt()
            println(" Hasil Konversi: $number")
        } catch (e: NumberFormatException) {
            println("gagal mengonversi input ke bilangan bulat: ${e.message}")
        }
}
