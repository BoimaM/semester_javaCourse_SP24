package chapter6_classes_and_objects;

public class TimeOfDay {

    // Instance variables:
    private int hour;
    private int minute;

    // Constructor type:
    TimeOfDay(int hour, int minute){
       setHour(hour);
       setMinute(minute);
    }

    // Setters:
   public void setHour(int hour){
       if(hour < 0 || hour > 23){
        this.hour = 0;
        System.out.println("Invalid hour. Setting the hour to " + this.hour);
    }else{
           this.hour = hour;
       }
    }

    public void setMinute(int minute){
           if (minute < 0 || minute > 60){
               this.minute = 0;
               System.out.println("Invalid minute. Setting minute to " + this.minute);
           }else{
               this.minute = minute;
           }
       }

    // Methods to add one hour
    public void addOneHour(){
       hour = (hour + 1) % 24;
    }

    // Method to add one minute
    public void addOneMinute(){
        minute = (minute + 1) % 60;
        if (minute == 0) {
            addOneHour();// Increment the hour only
        }
    }

    //Display method: Formatting was looked up via Google
    public String displayCurrentTime(){
        String formattedH = String.format("%02d",hour);
        String formattedM = String.format("%02d",minute);
        return formattedH + ":" + formattedM;
    }
}


