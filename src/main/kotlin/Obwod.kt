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
            Typ.ROWNOLEGLY -> 0.0
        }
        return opor
    }

    fun obliczSzeregowy(): Double {
        return R1 + R2
    }
}
