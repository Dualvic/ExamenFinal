package org.foobarspam.app;


import org.foobarspam.mrmeeseeks.MrMeeseeks;
import org.foobarspam.proxy.ProxyMrMeeseeks;

import java.util.ArrayList;

public class AppAlumnado {

    public static void main( String[] args ){

        // Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
        // Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados

        ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
        ArrayList<Integer> ids = new ArrayList<Integer>();

        ProxyMrMeeseeks box = new ProxyMrMeeseeks();

        box.pushButton(setMrMe);
        System.out.println("Open Jerry's stupid mayonnaise jar");
        box.getMrMe().formulateRequest("Open", "stupid jar");
        System.out.println();

        box.pushButton(setMrMe);
        System.out.println("I wanna be popular at school!");
        box.getMrMe().formulateRequest("Be", "popular at school");
        System.out.println();

        box.pushButton(setMrMe);
        System.out.println("I wanna be a more complete woman!");
        box.getMrMe().formulateRequest("Be", "a more complete woman");
        System.out.println();

        System.out.println("Estos son los Mr Meeseeks creados:");
        listMrMeeseeks(setMrMe);
        System.out.println();

        collectIds(setMrMe, ids);

        System.out.println("Adios, Mr Meeseeks...");
        for(Integer id : ids){
            explodeMrMeeseeks(setMrMe, id);

        }
    }

    private static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {
        for (MrMeeseeks MrMe : setMrMe) {
            System.out.println(MrMe.getId());
        }
    }

    private static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids) {
        for (MrMeeseeks MrMe : setMrMe) {
            ids.add(MrMe.getId());
        }
    }

    private static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, Integer id) {
        for (MrMeeseeks MrMe : setMrMe) {
            if(MrMe.getId()== id) {
                MrMe.sayMessageOnExplode();
                setMrMe.remove(MrMe);
                break;
            }

        }
    }

}