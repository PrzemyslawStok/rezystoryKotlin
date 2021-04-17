interface ObwodRezystory {
    enum class Typ {
        SZEREGOWY, ROWNOLEGLY
    }
    fun oblicz(): Double
    fun print()
}

class Rezystor(val opor: Double) : ObwodRezystory{
    override fun oblicz(): Double {
        return opor
    }

    override fun print() {
        print("opor wynosi: ${opor}")
    }

}

class ObowodOgolny : ObwodRezystory{
    override fun oblicz(): Double {
        TODO("Not yet implemented")
    }

    override fun print() {
        TODO("Not yet implemented")
    }

}
