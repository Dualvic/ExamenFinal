import org.foobarspam.interfaces.DoSomethingSimple;
import org.foobarspam.interfaces.Doable;
import org.foobarspam.mrmeeseeks.MrMeeseeks;

import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Victor on 08/06/2017.
 */

public class MainTest {

    static MrMeeseeks mrMeeseeks = new MrMeeseeks();

    @Test
    public void MrMeeseekInstanceTest() {
        assertTrue(mrMeeseeks instanceof Doable);
        assertTrue(mrMeeseeks instanceof DoSomethingSimple);
    }
    @Test
    public void MrMeeseekIDOnceTest() {
        int MrMeeseeksID = mrMeeseeks.getId();
        assertEquals(MrMeeseeksID, 1001);
    }

    @Test
    public void MrMeeseekIDTwiceTest() {
        MrMeeseeks mrMeeseeksTwice = new MrMeeseeks();
        int MrMeeseeksIDTwice = mrMeeseeksTwice.getId();
        assertEquals(MrMeeseeksIDTwice, 1002);
    }

    @Test
    public void MrMeeseekGenerateRequestTest() {
        String message = mrMeeseeks.generateMessageOnRequest().toString();
        assertThat(message, anyOf(is("Oooh yeah! Can do!"), is("Yes sireee!"), is( "Oh, yeah! Yes, ma'am!")));
    }
}
