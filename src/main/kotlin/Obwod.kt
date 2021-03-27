class Obwod(val typ: Typ) {
    enum class Typ{
        SZEREGOWY, ROWNOLEGLY
    }

    fun print(){
        println("obwód: ${typ.name}")
    }
}
