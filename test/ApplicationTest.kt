package shinobi9

import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*
import shinobi9.shinobi9.shuriken.module

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("HELLO WORLD!", response.content)
            }
        }
    }
}
