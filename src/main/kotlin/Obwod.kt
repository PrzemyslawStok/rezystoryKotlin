class Obwod(var typ: Typ, var oporPodstawowy: Double = 0.0) {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
    }

    constructor(opor: Double) : this(Typ.SZEREGOWY, opor) {
    }

    val obwody: MutableList<Obwod> = mutableListOf()

    fun dodajObwod(obwod: Obwod) {
        obwody.add(obwod)
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
        var sumaOporow = oporPodstawowy

        for (obwod in obwody)
            sumaOporow += obwod.oblicz()

        return sumaOporow
    }

    fun obliczRownolegly(): Double {
        var sumaOdwrotnosci = 1 / oporPodstawowy

        for (obwod in obwody)
            sumaOdwrotnosci += 1.0 / obwod.oblicz()

        return 1 / sumaOdwrotnosci
    }
}
