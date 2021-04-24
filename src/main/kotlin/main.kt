fun main() {
    val R0 = Rezystor(2.0)
    R0.print()

    val R1 = Rezystor(1.0)
    R1.print()


    val obwodR1 = ObwodRownolegly()

    obwodR1.dodajObwod(R0)
    obwodR1.dodajObwod(R1)

    obwodR1.print()

    val obwodS1 = ObwodSzeregowy()
    obwodS1.dodajObwod(R1)
    obwodS1.dodajObwod(obwodR1)
    
      //       --R0--
      //    --|     |--R1--
      //      --R1--

    obwodS1.print()

    val R2 = R1.dodajSzeregowo(Rezystor(10.0))
    val R3 = R1-R2-R1-R2-R1
    var R5 = (R0/R1)-R1

    R1.print()
    R2.print()
    R3.print()

    println("Rozwiązania zadań:\n")
    zad1()
    zad2()
}

fun zad1(){
    println("Zadanie 1")
    val R = Rezystor(1.0)

    val obwod2 = R/R
    val obwod1 = R/R/R/R
    val obwod0 = R/R/R/R/R/R

    val opor = (R/R/R/R/R/R)-(R/R/R/R)-(R/R)
    opor.print()
}

fun zad2(){
    println("Zadanie 2")
    val R = Rezystor(1.0)
    val opor = (R/R)-R-(R/R/R)

    opor.print()
}

fun staryObwod(){
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
}
