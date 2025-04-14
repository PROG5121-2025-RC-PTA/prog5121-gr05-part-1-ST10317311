/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchat_v2;

import java.util.Scanner;

/**
 *
 * @author ST10317311_Pako_Tone
 */

// ---- This is the AI generated class for checking cell phone numbers in South Africa. ----
/* ---- Reference: When prompted with: "Create a cellphone number checker - in Java - that 
*    contains South Africa's international country code, followed by the number, which is no more than
*    ten digits long." The GhatGPT-geenrated text geenrated code that detected South aAfrican numbers
*    with the country code number (as seen below). (OpenAI , 2025)
*
*   OpenAI. (2024 - 2025). ChatGPT (May 13, 2024 version) [large language model]. https://chatgpt.com/
*/
public class SACellNumberChecker {
    
    public static boolean isValidSANumber(String phoneNumber) {
        // Check if number starts with +27 and is followed by exactly 9 digits
        return phoneNumber.matches("\\+27\\d{10}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter South African cellphone number (e.g., +27831234567): ");
        String inputNumber = scanner.nextLine();

        if (isValidSANumber(inputNumber)) {
            System.out.println("✅ Valid South African cellphone number.");
        } else {
            System.out.println("❌ Invalid cellphone number format.");
        }

        scanner.close();
    }
    
}
