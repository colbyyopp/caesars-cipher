package Caesars.Cipher;

public class Main { 

	 

public static void main(String[] args) { 

 

String message = "how are you doing today"; // hard coding the input since we haven't coded a prompt for a user 

 

int offset = 12; 

 

CaesarsCipher caesarsCipher = new CaesarsCipher(); // importing the CaesarsCipher code from the CaesarsCipher.java file 

 

String cipheredMessage = caesarsCipher.cipher(message, offset); //storing ciphered message in a variable 

 

System.out.println("Original message: " + message); //basically console.log 

System.out.println("offset: " + offset); 

System.out.println("ciphered: " + cipheredMessage); 

} 

}