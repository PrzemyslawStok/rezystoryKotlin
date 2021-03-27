class Obwod(val typ: Typ) {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
    }

    val obwody: MutableList<Obwod> = mutableListOf()
    var oporPodstawowy = 0.0

    fun dodajObwod(obwod: Obwod) {
        obwody.add(obwod)
    }

    fun dodajObwod(opor: Double){
        oporPodstawowy = opor
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
        var sumaOdwrotnosci = 1/oporPodstawowy

        for (obwod in obwody)
            sumaOdwrotnosci += 1.0 / obwod.oblicz()

        return 1 / sumaOdwrotnosci
    }
}
