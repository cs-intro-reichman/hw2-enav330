public class Cheers {
    public static void main(String[] args) {
        
        String cheerWord = args[0];
        int N = Integer.parseInt(args[1]);
        
        // 1. תיקון רשימת specialChars (הוספת U)
        // הרשימה המלאה של האותיות שדורשות "an"
        String specialChars = "AEFHILMNORSXU"; 
        
        cheerWord = cheerWord.toUpperCase(); 
        
        // 2. הלולאה הראשונה
        for (int i = 0; i < cheerWord.length(); i++) {
            
            char currentChar = cheerWord.charAt(i);
            String article; 
            
            // בדיקת "an"
            if (specialChars.indexOf(currentChar) != -1) {
                article = "an";
            } else {
                article = "a "; // <--- תיקון 1: הוספת רווח נוסף (a + רווח)
            }
            
            // הדפסה: "Give me [a/an] [רווח] [תו]: "
            // אם article = "a ", הרווח הכפול נוצר כעת באופן אוטומטי
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