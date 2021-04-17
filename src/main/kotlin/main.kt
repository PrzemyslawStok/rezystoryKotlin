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

    val R0 = Rezystor(1.0)
    R0.print()

    val R1 = Rezystor(1.0)
    R1.print()

    val obwodR1 = ObwodOgolny(ObwodRezystory.Typ.ROWNOLEGLY)
    obwodR1.dodajObwod(R0)
    obwodR1.dodajObwod(R1)

    obwodR1.print()

}
