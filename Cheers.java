public class Cheers {
    public static void main(String[] args) {
        
        String cheerWord = args[0];
        int N = Integer.parseInt(args[1]);
        
        // 1. תיקון רשימת specialChars (הוספת O ו-U)
        String specialChars = "AEFHILMNORSXU"; 
        cheerWord = cheerWord.toUpperCase(); 
        
        // 2. הלולאה הראשונה
        for (int i = 0; i < cheerWord.length(); i++) {
            
            char currentChar = cheerWord.charAt(i);
            String article; 
            
            if (specialChars.indexOf(currentChar) != -1) {
                article = "an";
            } else {
                article = "a";
            }
            
            // תיקון הרווח: הוספת רווח לאחר article.
            // פורמט: "Give me [a/an] [רווח] [תו]: "
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