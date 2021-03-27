fun main() {
    val obwod1 = Obwod(Obwod.Typ.SZEREGOWY)

    obwod1.dodajObwod(Obwod(Obwod.Typ.SZEREGOWY))
    obwod1.dodajObwod(Obwod(Obwod.Typ.ROWNOLEGLY))
    obwod1.dodajObwod(1.0)
    obwod1.dodajObwod(1.0)
    obwod1.dodajObwod(1.0)

    obwod1.print()
}
