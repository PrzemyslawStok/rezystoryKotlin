class Obwod(val typ: Typ, val R1: Double, val R2: Double) {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
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
        return R1 + R2
    }

    fun obliczRownolegly(): Double {
        val sumaOdwrotnosci = 1 / R1 + 1 / R2
        return 1 / sumaOdwrotnosci
    }
}
