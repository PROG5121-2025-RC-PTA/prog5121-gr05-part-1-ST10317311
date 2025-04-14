/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchat_v2;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class QuickChat_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        introduction();
    }
    
    //This method introduces the user to QuickChat and asks the user to enter a value between 1 (for signup) and 2 (for login) using the terminal.
    public static void introduction(){
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Welcome to Quickchat!");
        System.out.println("Type 1 for Sign Up, 2 for Log In");
        int consumedNumber = inputNumber.nextInt();
        authenticationNumber(consumedNumber);
    }
    
    public static void authenticationNumber(int consumedNumber){
        if (consumedNumber == 1) {
            System.out.println("-------------------------------");
            System.out.println("You selected SIGN UP");
            System.out.println("-------------------------------");
            SignUp.signUp();
        } else if (consumedNumber == 2) {
            System.out.println("-------------------------------");
            System.out.println("You selected LOG IN");
            System.out.println("-------------------------------");
            LogIn.logIn();
        } else {
            System.out.println("-------------------------------");
            System.out.println("You chose an INCORRECT NUMBER. Restart application.");
            System.out.println("-----------------------------------------");
            introduction();
        }
    }
}
