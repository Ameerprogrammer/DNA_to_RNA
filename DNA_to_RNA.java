//Ameer Ahmed

public class Transcription {
    public static String dnaToRna(String strand) {

        //edge case in an empty string
        if (strand.length() == 0) {
            return "The string is empty!";
        }
        // create to store the transcribed RNA sequence
        StringBuilder RNA = new StringBuilder();

        //loop through each character to check the DNA strand
        for(int i = 0; i < strand.length(); i++) {
            //variable to store the characters in the given input by the user to replace them later
            char holder = Character.toUpperCase(strand.charAt(i));
            if(holder == 'A') {
                RNA.append("U");
            } else if (holder == 'T') {
                RNA.append("A");
            } else if (holder == 'G') {
                RNA.append("C");
            } else if (holder == 'C') {
                RNA.append("G");
            }
        }
        //convert the StringBuilder class type back into a String
        return RNA.toString();
    }

    public static void main (String[] args) {
        System.out.println("Output: " + dnaToRna("ccga"));
        System.out.println("Output: " + dnaToRna("CGATATA"));
        System.out.println("Output: " + dnaToRna(""));
    }
}