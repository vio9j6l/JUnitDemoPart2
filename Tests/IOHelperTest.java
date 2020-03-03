import org.junit.Test;

import static org.junit.Assert.*;

public class IOHelperTest {
    /*
     * Experimentation for classroom
     */
    @Test
    public void demoPurposes() {
        // TODO 01: Demo Save vs Equals
        String expected = "Phil";
        String actual = "Phil";

        assertEquals(expected, actual);
        assertSame(expected, actual);

        assertEquals(2, 2);
        assertSame(2, 2);
    }

    /*
     * Tests for isValidYorN
     */
    @Test
    public void isValidYorN__Pass_Y__Returns_True() {
        assertTrue(IOHelper.isValidYorN("Y"));
    }

    @Test
    public void isValidYorN__Pass_N__Returns_True() {
        assertTrue(IOHelper.isValidYorN("Y"));
    }

    @Test
    public void isValidYorN__Pass_x__Returns_True() {
        assertFalse(IOHelper.isValidYorN("x"));
    }

    /*
     * Tests for fullName
     */
    // TODO 02: fullName test for "Homer J. Simpson"

    @Test
    public void fullName_Pass_Homer_First_Middle_Last__Returns_Homer_J_Simpson() {
        String firstName = "Homer";
        String middleName = "Jay";
        String lastName = "Simpson";

        String expected = "Homer J. Simpson";
        String actual = IOHelper.fullName(firstName, middleName, lastName);
        assertEquals(expected, actual);
    }

    // TODO 03: fullName test for "Marge Simpson"

    @Test
    public void fullName_Pass_Simpson_Names__Returns_Full_Name() {
        String firstName = "Homer";
        String middleName = "Jay";
        String lastName = "Simpson";

        String expected = "Homer J. Simpson";
        String actual = IOHelper.fullName(firstName, middleName, lastName);
        assertEquals(expected, actual);

        firstName = "Marge";
        middleName = "";
        lastName = "Simpson";

        expected = "Marge Simpson";
        actual = IOHelper.fullName(firstName, middleName, lastName);
        assertEquals(expected, actual);
    }


    /*
     * Tests for tryParseInt
     */

    // TODO: Come up with MANY tests















































}
