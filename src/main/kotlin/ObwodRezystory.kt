interface ObwodRezystory {
    fun oblicz(): Double
    fun print()
}

class Rezystor(val opor: Double) : ObwodRezystory {
    override fun oblicz(): Double {
        return opor
    }

    override fun print() {
        println("opor wynosi: ${opor}")
    }

    fun dodajSzeregowo(R0: ObwodRezystory):Rezystor{

        val obwod = ObwodSzeregowy()
        obwod.dodajObwod(this)
        obwod.dodajObwod(R0)

        return Rezystor(obwod.oblicz())
    }

    fun dodajRownolegle(R0: ObwodRezystory):Rezystor{
        TODO("Funkcja nie została zaimpementowana")
    }

    operator fun minus(R0: ObwodRezystory):Rezystor{
        return dodajSzeregowo(R0)
    }
}

class ObwodSzeregowy: ObwodRezystory{
    val obwody: MutableList<ObwodRezystory> = mutableListOf()

    fun dodajObwod(obwod: ObwodRezystory) {
        obwody.add(obwod)
    }

    override fun oblicz(): Double {
        var sumaOporow = 0.0

        for (obwod in obwody)
            sumaOporow += obwod.oblicz()

        return sumaOporow
    }

    override fun print() {
        println("obwód: Szeregowy}")
        println("opór zastępczy: ${oblicz()}")
    }
}

class ObwodRownolegly: ObwodRezystory{
    val obwody: MutableList<ObwodRezystory> = mutableListOf()

    fun dodajObwod(obwod: ObwodRezystory) {
        obwody.add(obwod)
    }

    override fun oblicz(): Double {
        var sumaOdwrotnosci = 0.0

        for (obwod in obwody)
            sumaOdwrotnosci += 1.0 / obwod.oblicz()

        return 1 / sumaOdwrotnosci
    }

    override fun print() {
        println("obwód: Szeregowy}")
        println("opór zastępczy: ${oblicz()}")
    }
}

