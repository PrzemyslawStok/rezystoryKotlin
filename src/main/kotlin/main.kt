fun main() {
    val obwod1 = Obwod(Obwod.Typ.SZEREGOWY,2.0)
    val obwod2 = Obwod(1.0)

    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod2)

    obwod1.print()

    //obwod2.print()
}
