import org.foobarspam.app.AppAlumnado;
import org.foobarspam.interfaces.DoSomethingSimple;
import org.foobarspam.interfaces.Doable;
import org.foobarspam.mrmeeseeks.MrMeeseeks;

import static org.hamcrest.CoreMatchers.*;

import org.foobarspam.proxy.ProxyMrMeeseeks;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Victor on 08/06/2017.
 */

public class MainTest {

    static MrMeeseeks mrMeeseeks = new MrMeeseeks();

    @Before
    public void MrMeeseekIDOnceTest() {
        int MrMeeseeksID = mrMeeseeks.getId();
        assertEquals(MrMeeseeksID, 1001);
    }

    @Before
    public void MrMeeseekIDTwiceTest() {
        MrMeeseeks mrMeeseeksTwice = new MrMeeseeks();
        int MrMeeseeksIDTwice = mrMeeseeksTwice.getId();
        assertEquals(MrMeeseeksIDTwice, 1005);
    }

    @Test
    public void MrMeeseekInstanceTest() {
        assertTrue(mrMeeseeks instanceof Doable);
        assertTrue(mrMeeseeks instanceof DoSomethingSimple);
    }


    @Test
    public void MrMeeseekAddTest() {
        ArrayList<MrMeeseeks> listTest = new ArrayList<MrMeeseeks>();
        ProxyMrMeeseeks box = new ProxyMrMeeseeks();

        box.pushButton(listTest);

        assertEquals(1,listTest.size());

    }

    @Test
    public void MrMeeseekRemoveTest() {
        ArrayList<MrMeeseeks> listTest = new ArrayList<MrMeeseeks>();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        MrMeeseeks mrMeesek1 = new MrMeeseeks();
        listTest.add(mrMeesek1);
        collectIdsTest(listTest,ids);

        for(Integer id : ids){
            explodeMrMeeseeksTest(listTest, id);
        }

        assertEquals(0, listTest.size());

    }


    // methods to test

    private static void explodeMrMeeseeksTest(ArrayList<MrMeeseeks> setMrMe, Integer id) {
        for (MrMeeseeks MrMe : setMrMe) {
            if(MrMe.getId()== id) {
                setMrMe.remove(MrMe);
                break;
            }

        }
    }

    private static void collectIdsTest(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids) {
        for (MrMeeseeks MrMe : setMrMe) {
            ids.add(MrMe.getId());
        }
    }

}
