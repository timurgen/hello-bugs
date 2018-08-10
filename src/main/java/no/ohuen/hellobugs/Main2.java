/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ohuen.hellobugs;

/**
 *
 * @author 100tsa
 */
public class Main2 {

    public static void main(String[] args) {
        try {
            try {
                throw new IllegalAccessException("message inner");
            } catch (Exception e) {
                System.out.println("Inner: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer: " + e.getMessage());
        }
    }
}
