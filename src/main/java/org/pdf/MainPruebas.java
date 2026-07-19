package org.pdf;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPruebas {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        // to see how IntelliJ IDEA suggests fixing it.


        Object [][] matriz = {{"hola","mundo"},{"zero","drako"}};

        List <Object[]> lista = new ArrayList<>(Arrays.asList(matriz));
        lista.add(new Object[]{"michi","gato"});
        System.out.println(lista.get(2)[1]);




      }


    }

