import io.kotest.core.spec.style.FunSpec
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue


class HomeworkTest : FunSpec({
    test("This test checks if returnsFalse() returns false") {
        assertFalse {
            returnsFalse()
        }
    }
    test("This test checks if returnsTrue() returns true") {
        assertTrue {
            returnsTrue()
        }
    }

})
