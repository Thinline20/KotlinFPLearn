import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test1 {
    @Test
    fun testAbs() {
        assertEquals(abs(4), 4)
        assertEquals(abs(-5), 5)
    }

    @Test
    fun testFactorial() {
        assertEquals(factorial(5), 120)
    }

    @Test
    fun testFactorial2() {
        assertEquals(factorial2(6), factorial(6))
    }

    @Test
    fun testFib() {
        assertEquals(fib(8), 21)
    }
}