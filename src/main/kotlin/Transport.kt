interface Transport {
    var berat : Float
    var kapasitas : String
    var kecepatan : Float

    fun load() {
        println("Barang berhasil dimuat")
    }
    fun unload() {
        println("Barang berhasil dibongkar ")
    }
    fun ship()
}