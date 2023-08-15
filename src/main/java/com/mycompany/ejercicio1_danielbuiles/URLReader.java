/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1_danielbuiles;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author daniel.builes
 */
public class URLReader {

    public static void main(String[] args) {
        try {
            URL myURL = new URL("https://campusvirtual.escuelaing.edu.co/moodle/course/view.php?id=892");
            System.out.println("protocol: " + myURL.getProtocol());
            System.out.println("Authority: " + myURL.getAuthority());
            System.out.println("Host: " + myURL.getHost());
            System.out.println("Port: " + myURL.getPort());
            System.out.println("Path: " + myURL.getPath());
            System.out.println("Query: " + myURL.getQuery());
            System.out.println("File: " + myURL.getFile());
            System.out.println("Ref: " + myURL.getRef());
            
            } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
