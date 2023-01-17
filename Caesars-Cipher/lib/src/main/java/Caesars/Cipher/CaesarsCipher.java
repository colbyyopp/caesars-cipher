package Caesars.Cipher; 

 

public class CaesarsCipher { 

private static final char LETTER_A = 'a'; 

private static final char LETTER_Z = 'z'; 

private static final int ALPHABET_SIZE = 26; 

 

public String cipher(String message, int offset) { 

offset %= ALPHABET_SIZE; // "%=" is a module; keeps it from going over 25 

 

char[] character = message.toCharArray(); // character array titled "character"; storing input characters into the array 

 

offsetBy(character, offset); // hover over "offsetBy' to create a method 

return new String(character); 

} 

 

 

private void offsetBy(char[] character, int offset) { //method created for offsetBy 

 

for (int i = 0; i < character.length; ++i) { // scanning through input characters stored in the array 

 

if (character[i] != ' ') { // ignoring spaces 

character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z); 

} 

} 

} 

 

private char offsetChar(char c, int offset, char letterA, char letterZ) { 

 

c += offset; 

 

if (c < letterA) { // shifting letter to the left 

return (char) (c + ALPHABET_SIZE); 

} 

if (c > letterZ) { // shifting letter to the right 

return (char) (c - ALPHABET_SIZE); 

} 

return c; 

} 

}