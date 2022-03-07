class Air_Transport(
    override var berat : Float,
    override var kapasitas : String,
    override var kecepatan : Float,
    var tipe_pesawat : String,
    var nama_maskapai : String) : Transport {

    override fun ship() {
        println("Pada transportasi udara, pengiriman dilakukan melalui kargo udara")
    }

    override fun toString(): String {
        return "\n====Transportasi Udara====\n"+
                "Tipe Pesawat : $tipe_pesawat \n"+
                "Nama Maskapai: $nama_maskapai \n"+
                "Berat : $berat \n"+
                "Kapasitas :  $kapasitas \n"+
                "Kecepatan : $kecepatan km/h"
    }
}