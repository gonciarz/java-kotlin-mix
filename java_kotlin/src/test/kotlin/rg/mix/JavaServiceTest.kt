package rg.mix

import org.junit.jupiter.api.Test

class JavaServiceTest {

    @Test
    fun shouldBar() {
        val service = JavaService()
        service.generate()
    }

}