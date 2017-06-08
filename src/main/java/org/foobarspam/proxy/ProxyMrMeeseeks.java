package org.foobarspam.proxy;

import org.foobarspam.mrmeeseeks.MrMeeseeks;

import java.util.ArrayList;

/**
 * Created by Victor on 08/06/2017.
 */
public class ProxyMrMeeseeks extends MrMeeseeks{

    private MrMeeseeks mrMe;

    public void pushButton(ArrayList<MrMeeseeks> setMrMe) {
        createMrMeeseeks();
        mrMe.sayMessageOnCreate();
        setMrMe.add(mrMe);
    }

    public void createMrMeeseeks() {
        mrMe = new MrMeeseeks();
    }

    public MrMeeseeks getMrMe() {
        return mrMe;
    }
}
