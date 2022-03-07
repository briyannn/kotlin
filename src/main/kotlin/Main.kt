fun main(args: Array<String>) {

    val darat = Land_Transport ( 100f, "100 kg", 20.0f, "Truk Barang", "Truk")
    val udara = Air_Transport ( 20f, "20 kg", 100.2f, "Pesawat Kargo", "Garuda")

    darat.ship()
    darat.load()
    println(Transportation(darat))
    darat.unload()

    println("\n")

    udara.ship()
    udara.load()
    println(Transportation(udara))
    udara.unload()

}