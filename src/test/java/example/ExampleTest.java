package example;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class ExampleTest {
    @Test
    void java() throws Exception {
        Method deprecatedMethod = B.class.getMethod("a");
        boolean presentDepr = deprecatedMethod.isAnnotationPresent(Deprecated.class);
    }
}

