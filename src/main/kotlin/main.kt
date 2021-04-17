fun main() {
    val obwod1 = Obwod(Obwod.Typ.ROWNOLEGLY,1.0)
    val obwod2 = Obwod(1.0)
    val obwod3 = Obwod(2.0)

    val obwod4 = Obwod(0.0)
    val obwod5 = Obwod(5.0)

    obwod4.dodajObwod(obwod2)
    obwod4.dodajObwod(obwod3)

    obwod1.dodajObwod(obwod4)
    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod2)
    obwod1.dodajObwod(obwod5)

    obwod1.print()

    val rezystor0 = Rezystor(10.0)
    rezystor0.print()


    //obwod2.print()
}
