package koapi

import koapi.tooling.formatString
import org.junit.jupiter.api.Test

@Test
fun foo() {
    val result = "{koapi.foo}".formatString(mapOf(
            "koapi.foo" to "bar"
    ))

    assert(result == "bar")

}