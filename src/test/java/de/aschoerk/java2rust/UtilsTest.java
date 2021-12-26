package de.aschoerk.java2rust;

import org.junit.Test;

import static de.aschoerk.java2rust.Utils.camelToSnake;
import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void testCamelToSnake() {
        assertEq("hello_world", "HelloWorld");
        assertEq("hello_world", "helloWorld");
        assertEq("my_awesome_stub_resolver_facade_ejb", "MyAwesomeStubResolverFacadeEjb");
        assertEq("a_very_long_variable_name", "aVeryLongVariableName");
        assertEq("", "");
        assertEq("nothing", "nothing");
        assertEq("snake", "Snake");
    }

    private void assertEq(String expected, String actual) {
        assertEquals(expected, camelToSnake(actual));
    }
}
