class Land_Transport (
    override var berat : Float,
    override var kapasitas : String,
    override var kecepatan : Float,
    var moda_transportasi : String,
    var tipe_kendaraan: String) : Transport {

    override fun ship() {
        println("Pada transportasi darat, pengiriman dilakukan melalui truk")
    }

    override fun toString(): String {
        return "\n====Transportasi Darat====\n"+
                "Moda Transportasi : $moda_transportasi \n"+
                "Tipe Kendaraan: $tipe_kendaraan \n"+
                "Berat : $berat \n"+
                "Kapasitas :  $kapasitas \n"+
                "Kecepatan : $kecepatan km/h"
    }
}