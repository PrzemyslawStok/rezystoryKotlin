class Obwod(val typ: Typ) {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
    }

    val obwody: MutableList<Obwod> = mutableListOf()

    fun dodajObwod(obwod: Obwod) {
        obwody.add(obwod)
    }

    fun dodajObwod(opor: Double){

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

        for (obwod in obwody)
            sumaOporow += obwod.oblicz()

        return sumaOporow
    }

    fun obliczRownolegly(): Double {
        var sumaOdwrotnosci = 0.0

        for (obwod in obwody)
            sumaOdwrotnosci += 1.0 / obwod.oblicz()

        return 1 / sumaOdwrotnosci
    }
}
