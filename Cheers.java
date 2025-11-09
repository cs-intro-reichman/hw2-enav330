public class Cheers {
    public static void main(String[] args) {
        
        String cheerWord = args[0];
        int N = Integer.parseInt(args[1]);
        
        // 1. תיקון רשימת specialChars (התאמה לדרישת המבדק)
        // הרשימה הנכונה עבור "an"
        String specialChars = "AEFHILMNRO"; 
        
        cheerWord = cheerWord.toUpperCase(); 
        
        // 2. הלולאה הראשונה
        for (int i = 0; i < cheerWord.length(); i++) {
            
            char currentChar = cheerWord.charAt(i);
            String article; 
            
            if (specialChars.indexOf(currentChar) != -1) {
                article = "an";
            } else {
                // נדרש רווח נוסף עבור "a" כדי להתאים לפורמט
                article = "a "; 
            }
            
            // הדפסה: "Give me [a/an] [רווח] [תו]: "
            System.out.print("Give me " + article + " " + currentChar + ": "); 
            
            // הדפסת התו עם סימן הקריאה וירידת שורה
            System.out.println(currentChar + "!");
        }
        
        // 3. סיכום והדפסה חוזרת
        System.out.println("What does that spell?");
        
        for (int j = 0; j < N; j++) {
            System.out.println(cheerWord + "!!!");
        }
    }
}