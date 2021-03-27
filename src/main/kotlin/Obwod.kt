class Obwod(val typ: Typ, val R1: Double, val R2: Double) {
    enum class Typ{
        SZEREGOWY, ROWNOLEGLY
    }

    fun print(){
        println("obwód: ${typ.name}")
    }

    fun oblicz():Double{
        return obliczSzeregowy()
    }

    fun obliczSzeregowy():Double{
        return 0.0
    }
}
