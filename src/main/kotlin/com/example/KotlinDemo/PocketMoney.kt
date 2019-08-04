package com.example.KotlinDemo

class Kids(private val mother: Mother) {
    var money = 0
        private set

    fun wantMoney() {
        mother.infoMama()
        money = mother.giveMoney()
    }
}

class Mother {
    fun giveMoney(): Int {
        return 100;
    }

    fun infoMama():String{
        println("xuda")
        return ""
    }
}
