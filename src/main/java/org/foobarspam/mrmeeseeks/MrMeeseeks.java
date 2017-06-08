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
    private String messageOnDone = "All done!";
    private String messageOnExplode = "Pooooooof ";

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

    public void sayMessageOnRequest() {
        System.out.println(generateMessageOnRequest());
    }

    public void sayMessageOnExplode() {
        System.out.println(messageOnExplode + getId());
    }

    public String generateMessageOnRequest() {
        int randomNumber = ThreadLocalRandom.current().nextInt(messageOnRequest.length);

        return messageOnRequest[randomNumber];
    }

    public void formulateRequest(String accion, String argumentos) {
        sayMessageOnRequest();
        doRequest(accion,argumentos);
        stopExisting();
    }

    public void stopExisting() {
        System.out.println(messageOnDone);
    }

    // implementacion

    public void doRequest(String accion, String argumentos) {
        System.out.println(accion + " " + argumentos);
    }
}
