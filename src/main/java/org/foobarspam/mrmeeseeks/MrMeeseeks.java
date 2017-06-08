package org.foobarspam.mrmeeseeks;

import org.foobarspam.interfaces.Doable;

/**
 * Created by Victor on 08/06/2017.
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class MrMeeseeks implements Doable {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private Integer id;
    private String[] messageOnRequest = {"Look at meeee!"};

    public MrMeeseeks(){
        this.id = ID_GENERATOR.incrementAndGet();
    }

    // Getters

    public int getId() {
        return this.id;
    }


    // Metodos

	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */

    public void sayMessageOnCreate() {
        System.out.println("I'm Mr Meeseeks" + getId() + generateMessageOnRequest() );
    }

    public String generateMessageOnRequest() {
        int randomNumber = ThreadLocalRandom.current().nextInt(messageOnRequest.length);
        return messageOnRequest[randomNumber];
    }

}
