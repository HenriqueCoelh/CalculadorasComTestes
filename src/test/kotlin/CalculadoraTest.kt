import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calculadora = Calculadora()


    @Test
    fun soma() {
        assertEquals(10, calculadora.soma(4, 6))
    }

    @Test
    fun subtracao() {
        assertEquals(7, calculadora.subtracao(15, 8))
    }

    @Test
    fun multiplicacao() {
        assertEquals(15, calculadora.multiplicacao(3, 5))
    }

    @Test
    fun divisao() {
        assertEquals(5, calculadora.divisao(40, 8))
    }

    @Test
    fun sqrt() {
        assertEquals(5.0, calculadora.sqrt(25.0))
    }
}