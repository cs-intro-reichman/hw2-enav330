
public class Cheers {
  public static void main(String[] args) {
        String cheerWord = args[0];
        int N = Integer.parseInt(args[1]);
        cheerWord = cheerWord.toUpperCase(); 
        String specialChars = "AEFHILMNROSX"; 
        for (int i = 0; i < cheerWord.length(); i++) {
            char currentChar = cheerWord.charAt(i);
            String article; 
            if (specialChars.indexOf(currentChar) != -1) {
                article = "an";
            } else {
                article = "a";
            }
            
            System.out.println("Give me " + article + "  " + currentChar + ": " + currentChar + "!");
        }
        
        System.out.println("What does that spell?");
        
        for (int j = 0; j < N; j++) {
            System.out.println(cheerWord + "!!!");
        }
    }
}