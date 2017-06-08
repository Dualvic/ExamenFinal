package org.foobarspam.mrmeeseeks;

import org.foobarspam.interfaces.Doable;

/**
 * Created by Victor on 08/06/2017.
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private Integer id;
    private String[] messageOnRequest = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};

    public MrMeeseeks(){
        this.id = ID_GENERATOR.incrementAndGet();
    }

    // Getters

    public int getId() {
        return this.id;
    }


    // Metodos

    public void sayMessageOnCreate() {
        System.out.println("I'm Mr Meeseeks " + getId()+ " Look at meee!" );
    }

    public String generateMessageOnRequest() {
        int randomNumber = ThreadLocalRandom.current().nextInt(messageOnRequest.length);
        return messageOnRequest[randomNumber];
    }

    public void formulateRequest(String accion, String argumentos) {
        doRequest(accion,argumentos);
    }

    public void stopExisting() {
        System.out.println("All Done");
    }

    // implementacion

    public void doRequest(String accion, String argumentos) {
        System.out.println(accion + " " + argumentos);
    }
}
