package com.example.KotlinDemo

import io.mockk.*
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class KidsTest {

    @MockK
    lateinit var mother: Mother

    lateinit var kid: Kids

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        kid = Kids(mother)
    }

    @Test
    fun testWantMoney() {
        every { mother.giveMoney() } returns 30
        every { mother.infoMama() } returns ""
        kid.wantMoney()
        assertEquals(30, kid.money)
        verify { mother.infoMama() }
        var aa = "30".toUByte() + 1.toUByte()
        println(aa)
    }

    @Test
    fun `different apply and let`() {
        "xuda".apply {
            this.reversed()
            "aaa"
        }.let { println(it) }
        "xuda".let {
            it.reversed()
            "ba"
        }.let { println(it) }
    }
}