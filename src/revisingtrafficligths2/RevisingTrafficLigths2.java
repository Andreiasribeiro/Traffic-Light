/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisingtrafficligths2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andre
 */
public class RevisingTrafficLigths2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));

        boolean validcolour = false;
 
        do {
            System.out.println("What colout is the traffic light?");

            try {

                String usercolour = myKB.readLine();
                usercolour = usercolour.toUpperCase();//para poder digitar letras minúsculas

                switch (usercolour) {
                    case "RED"://"RED" em letras maiúsculas para
                        System.out.println("Stop!");
                        validcolour = true;
                        break;
                    case "ORANGE":
                        System.out.println("Slow down!");
                        validcolour = true;
                        break;
                    case "GREEN":
                        System.out.println("Keep going");
                        break;
                    default:
                        System.out.println("Error");
                        validcolour = false;
                }
            } catch (Exception e) {
                System.out.println("Error 2");
            }
        } while (!validcolour);

    }
}
