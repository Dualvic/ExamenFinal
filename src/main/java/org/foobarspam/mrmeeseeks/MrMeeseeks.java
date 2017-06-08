package org.foobarspam.mrmeeseeks;

import org.foobarspam.interfaces.doSomethingSimple;
import org.foobarspam.interfaces.doable;

/**
 * Created by Victor on 08/06/2017.
 */
public abstract class MrMeeseeks implements doable,doSomethingSimple {

    private int id;
    private String[] messageOnRequest;
    private String messageOnDone;
    private String messageOnExplode;

    // Constructor


    public MrMeeseeks(int id, String[] messageOnRequest, String messageOnDone, String messageOnExplode) {
        this.id = id;
        this.messageOnRequest = messageOnRequest;
        this.messageOnDone = messageOnDone;
        this.messageOnExplode = messageOnExplode;
    }


}
