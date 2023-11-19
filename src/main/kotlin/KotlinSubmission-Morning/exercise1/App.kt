package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan : String = "Sugiarti"
    val namaBelakang : String = "Irmasari"
    val umur : Int = 20
    val isSingle : Boolean = true

    println("Nama Depan : $namaDepan")
    println("Nama Belakang : $namaBelakang")
    println("Umur saya : $umur")
    println("Status Single : $isSingle")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID : $groupId")
    println("Group Member : $groupMember")
    println("Session : $session")

    return Any()
    val id = "B Morning"
    val member = listOf("Irma", "Fakhri", "Aufal", "Ahmad", "Fadli", "Raka", "Dandi", "Alif", "Fikri", "farhan")
    val session = "Morning"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val Nawasena = listOf("Irma", "Fakhri", "Aufal", "Ahmad", "Fadli", "Raka", "Dandi", "Fikri", "ALif", "Farhan")
    return listOf(Nawasena)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Reza", "Kak Reynaldi", "Kak Megi", "Kak Raihan", "Kak Jovian")
    val countOfGroup = arrayOf("Irma", "Fakhri", "Aufal", "Ahmad", "Fadli", "Raka", "Dandi", "Fikri", "ALif", "Farhan")

    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    groupDetail("B Morning", listOf("Irma", "Fakhri", "Aufal", "Ahmad", "Fadli", "Raka", "Dandi", "Fikri", "ALif", "Farhan"), "Morning")

}