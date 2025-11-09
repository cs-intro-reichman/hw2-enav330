public class TimeCalc {
    public static void main(String[] args) {
    String Time = args[0];
    int Hours = Integer.parseInt(Time.substring(0, 2));
     int Minutes = Integer.parseInt(Time.substring(3, 5));
    int minutesToAdd = Integer.parseInt(args[1]);
    int totalMinutes = (Hours * 60) + Minutes + minutesToAdd;
    int totalHours = totalMinutes / 60;
    int newHours = totalHours % 24;
    int newMinutes = totalMinutes - (totalHours * 60);
    String finalHours;
    String finalMinutes;
    if(newHours<10)
     { finalHours= "0" + newHours;   
    } else{
        finalHours = "" + newHours;
    }
 if(newMinutes < 10) {
            finalMinutes = "0" + newMinutes; 
        } else {
            finalMinutes = "" + newMinutes;
        }
   System.out.println(finalHours + ":" + finalMinutes);
}   
}

    

