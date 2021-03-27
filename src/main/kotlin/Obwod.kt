class Obwod(val typ: Typ, val R1: Double, val R2: Double) {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
    }

    fun print() {
        println("obwód: ${typ.name}")
        println("opór zastępczy: ${oblicz()}")
    }

    fun oblicz(): Double {
        return obliczSzeregowy()
    }

    fun obliczSzeregowy(): Double {
        return R1 + R2
    }
}
