/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchat_v2;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class SignUp {

    public static void signUp() {
        createUsername();
    }

    public static void createUsername() {
        System.out.println("NEW USERNAME.");
        System.out.println("->> Username must contain an underscore and is no more than five characters long.");
        System.out.println("Create a new username: ");

        Scanner username = new Scanner(System.in);
        String typedUsername = username.nextLine();
        checkUsername(typedUsername);
    }

    public static boolean checkUsername(String typedUsername) {
        char charUnderscore = '_';
        int typedUsernameLength = typedUsername.length();

        if (typedUsernameLength < 6 && typedUsername.contains(Character.toString(charUnderscore))) {
            System.out.println("--------------------------------");
            System.out.println("Username successfully captured.");
            System.out.println("--------------------------------");
            createPassword();
            return true;
        } else {
            System.out.println("--------------------------------");
            System.out.println("Username is not correctly formatted, \n please ensure that your username contains an underscore \n and is no more than five characters in length.");
            System.out.println("--------------------------------");
            signUp();
            return false;
        }
    }

    public static void createPassword() {
        System.out.println("NEW PASSWORD.");
        System.out.println("->> The password must be:");
        System.out.println("->> At least eight characters long.");
        System.out.println("->> Contain a capital letter.");
        System.out.println("->> Contain a number.");
        System.out.println("->> Contain a special character.");
        System.out.println("Create a new password:");

        Scanner newCreatedPassword = new Scanner(System.in);
        String newPassword = newCreatedPassword.nextLine();
        checkPasswordComplexity(newPassword);
    }
    
    //This method ensures that passwords meet the following password complexity rules.
    public static boolean checkPasswordComplexity(String newPassword){
        boolean isPasswordTheCorrectStringLength = stringLength(newPassword);
        boolean doesPasswordContainCapitalLetter = containCapitalLetter(newPassword);
        boolean doesPasswordContainNumber = containNumber(newPassword);
        boolean doesPasswordContainSpecialCharacter = containSpecialCharacter(newPassword);
        
        if (isPasswordTheCorrectStringLength == true && doesPasswordContainCapitalLetter == true && doesPasswordContainNumber == true && doesPasswordContainSpecialCharacter == true){
            System.out.println("--------------------------------");
            System.out.println("Password successfully captured.");
            System.out.println("--------------------------------");
            addNewCellphoneNumber();
            return true;
        } else {
            System.out.println("--------------------------------");
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            System.out.println("--------------------------------");
            createPassword();
            return false;
        }
    }
    
// ---- These are sub-methods that check password complexity into their own separate methods. ----
            public static boolean stringLength(String newPassword){
                if (newPassword.length() < 8 ){
                    return false;
                } else {
                    return true;
                }
            }
        
            public static boolean containCapitalLetter(String newPassword){
                if (newPassword.matches(".*[A-Z].*")){
                    return true;
                } else {
                    return false;  
                }
            }
            
            public static boolean containNumber(String newPassword){
                if (newPassword.matches(".*\\d.*")){
                    return true;
                } else {
                    return false;
                }
            }
            
            public static boolean containSpecialCharacter(String newPassword){
                String password = newPassword;
                int count = 0;
                
                for (int i = 0; i < password.length(); i++) {
                    if (!Character.isLetterOrDigit(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))){
                        count++;
                    }
                }
                
                if (count > 0) {
                    return true;
                } else {
                    return false; 
                }
            }
// ---- This is the end of the sub-methods for checkPasswordComplexity(). ----

// ---- This is the method attributed from the SACellNumberChecker class, generated with AI ----
    public static void addNewCellphoneNumber() {
        System.out.println("Please enter your South African cellphone number.");
        Scanner inputPhoneNumber = new Scanner(System.in);
        String checkCorrectPhoneNumberRSA = inputPhoneNumber.nextLine();
        SACellNumberChecker.isValidSANumber(checkCorrectPhoneNumberRSA) ;
    }
}
