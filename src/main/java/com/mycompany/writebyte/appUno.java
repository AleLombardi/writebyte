/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.writebyte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author posta
 */
public class appUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        newApp s = new newApp("ciao");
        FileOutputStream f = new FileOutputStream("frase.dat");
        ObjectOutputStream fOUT = new ObjectOutputStream(f);
        fOUT.writeObject(s);
        fOUT.flush();
        fOUT.close();
        System.out.println("scritto");
    }
    }
    

