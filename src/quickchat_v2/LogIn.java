/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchat_v2;

import java.util.Scanner;
import static quickchat_v2.SignUp.createPassword;
import static quickchat_v2.SignUp.signUp;

/**
 *
 * @author ST10317311_Pako_Tone
 */
public class LogIn {
    public static void logIn(){
        logInUsername();
    }
    
    public static void logInUsername(){
        System.out.println("CURRENT USERNAME.");
        System.out.println("Enter your current username: ");
        Scanner typedInUsername = new Scanner(System.in);
        String loggedInUsername = typedInUsername.nextLine();
        checkUsername(loggedInUsername);
    }
    
    public static boolean checkUsername(String loggedInUsername) {
        char charUnderscore = '_';
        int storedUsername = loggedInUsername.length();
        String userName = "kyl_1";
        String userFirstName = "Kyle";
        String userLastName = "Brofloski";
        
        if (storedUsername < 6 && loggedInUsername.contains(Character.toString(charUnderscore))) {
            System.out.println("--------------------------------");
            System.out.println("Welcome " + userFirstName + ", " + userLastName + " it is great to see you.");
            System.out.println("--------------------------------");
            logInPassword();
            return true;
        } else {
            System.out.println("--------------------------------");
            System.out.println("Username is not correctly formatted, \n please ensure that your username contains an underscore \n and is no more than five characters in length.");
            System.out.println("--------------------------------");
            signUp();
            return false;
        }
    }
    
    public static void logInPassword(){
        System.out.println("CURRENT PASSWORD.");
        System.out.println("Enter your current password: ");
        Scanner typedInPassword = new Scanner(System.in);
        String loggedinPassword = typedInPassword.nextLine();
    }
}
