public class dnaToRna {

    public static String dnaToRna(String strand) {

        if(strand.length() == 0) {
            return "The string is empty!";
        }

        String result = "";

        for(int i = 0; i < strand.length(); i++) {
            char currentChar = strand.charAt(i);

             if(currentChar == 'A') {
                result = result + "U";
             }
            if(currentChar == 'T') {
                result = result + "A";
            }
            if(currentChar == 'G') {
                result = result + "C";
            }
            if(currentChar == 'C') {
                result = result  + "G";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + dnaToRna("ATTAGCGCGATATACGCGTAC"));
        System.out.println("Output: " + dnaToRna("CGATATA"));
        System.out.println("Output: " + dnaToRna("GTCATACGACGTA"));
    }
}