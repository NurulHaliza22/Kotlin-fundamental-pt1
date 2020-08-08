fun main(){
    val kkm = 75
    val nilai = 80
    val hasil : String
    hasil = if (nilai >= kkm){
        "Nilai kamu $nilai, selamat ya!"
    } else {
        "Nilai kamu $nilai, silahkan ikuti remidial."
    }
    print(hasil)
}