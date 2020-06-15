/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.writebyte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author posta
 */
public class appDue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f2 = new FileInputStream("frase.dat");
        ObjectInputStream fIN = new ObjectInputStream(f2);
                newApp s = (newApp) fIN.readObject();
                System.out.print("\nFrase: " + s.frase);
        }
    }
    

