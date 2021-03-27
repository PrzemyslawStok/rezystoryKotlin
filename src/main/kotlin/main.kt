fun main() {
    val obwod1 = Obwod(Obwod.Typ.SZEREGOWY)
    obwod1.dodajOpor(2.0)
    obwod1.dodajOpor(5.0)
    obwod1.dodajOpor(1.0)

    obwod1.print()
}
