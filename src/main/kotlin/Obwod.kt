class Obwod(val typ: Typ) {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
    }

    val opory: MutableList<Double> = mutableListOf()

    fun dodajOpor(opor: Double) {
        opory.add(opor)
    }

    fun print() {
        println("obwód: ${typ.name}")
        println("opór zastępczy: ${oblicz()}")
    }

    fun oblicz(): Double {
        val opor = when (typ) {
            Typ.SZEREGOWY -> obliczSzeregowy()
            Typ.ROWNOLEGLY -> obliczRownolegly()
        }
        return opor
    }

    fun obliczSzeregowy(): Double {
        var sumaOporow = 0.0

        for(opor in opory)
            sumaOporow+=opor

        return sumaOporow
    }

    fun obliczRownolegly(): Double {
        val sumaOdwrotnosci = 1.0
        return 1 / sumaOdwrotnosci
    }
}
