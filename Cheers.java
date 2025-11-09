public class Cheers {
    public static void main(String[] args) {
        
        String cheerWord = args[0];
        int N = Integer.parseInt(args[1]);
        
        // 1. תיקון רשימת specialChars (הוצאת U ו-I כיוון שהמבדק דורש "a" עבורן)
        // רשימת האותיות שנשארו ודורשות "an":
        String specialChars = "AEFHMNRSX"; 
        
        cheerWord = cheerWord.toUpperCase(); 
        
        // 2. הלולאה הראשונה
        for (int i = 0; i < cheerWord.length(); i++) {
            
            char currentChar = cheerWord.charAt(i);
            String article; 
            
            // בדיקת "an"
            if (specialChars.indexOf(currentChar) != -1) {
                article = "an";
            } else {
                // תיקון סופי: הוספת רווח נוסף למילה 'a' 
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