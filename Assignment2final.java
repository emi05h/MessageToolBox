public class Assignment2final {
    public static void main(String[] args) {

        long timeSent = 1699971603000L; //time in milliseconds
        String username = System.getProperty("user.name"); //person who logged into system 
        String usernamePosted = "david"; //person who sent message(Different usernames on different devices so they are all compared)

        String message = 
            "If UL has a million fans, I am one of them.\n" +
            "/If UL has one hundred fans, I am one of them.\n" +
            "If UL has one fan, I am that fan.\n" +
            "If UL has no fans, then I am no longer on this earth.\n" +
            "If the world is against UL, I am against the world.\n" +
            "Love UL till my last breath.";
        //Tried different length strings so to make sure part 3 & 4 worked together for every input

        //Part 1:Day Name Display
        int day,dayOfWeek;
        long sinceMidnight, hrs, mins, sec, past, pres;

        day =  1000*60*60*24;

        sinceMidnight = timeSent%(day)/1000;
        hrs = sinceMidnight/(60*60);
        mins = sinceMidnight%(60*60)/60;
        sec = sinceMidnight%60;

        final long now = System.currentTimeMillis();

        dayOfWeek = (int)(timeSent/day)%7;
        String[] weekDay = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        String nameOfDay = weekDay[dayOfWeek];

        past = timeSent/day;
        pres = now/day;

        String when = "";
        if (past < pres-7) {
            when = "Some time ago...";
        }
        else if (past <= pres-2) {
            when = nameOfDay;
        }
        else if (past < pres) {
            when = "Yesterday";
        }   
        //Inputted different time for timeSent to check for each vairable to check if each ouput printed
        int dist = (40-when.length())/2 + when.length();

        //Part 2:Message Case
        String FHalf,SHalf,FHalfS,SHalfS;
        int width,Half,chara;

        width = message.length();
        Half = (width/2);
        FHalf = SHalf = FHalfS = SHalfS = "";

        if(username.equals(usernamePosted)){ //Compares posted username and System-name
            for(chara=0; chara < Half; chara++){
                FHalfS = FHalf;//Variable to save last change
                FHalf = (message.charAt(chara) + "").toLowerCase(); //Gets character through iteration and converts to string and lowercase
                FHalf = FHalfS + FHalf;//adds character to string
            }
            for(chara=Half; chara < width; chara++){
                SHalfS = SHalf;
                SHalf = (message.charAt(chara) + "").toUpperCase();
                SHalf = SHalfS + SHalf;
            }
        }else{
            for(chara=0; chara < Half; chara++){
                FHalfS = FHalf;
                FHalf = (message.charAt(chara) + "").toUpperCase();
                FHalf = FHalfS + FHalf;
            }
            for(chara=Half; chara < width; chara++){
                SHalfS = SHalf;
                SHalf = (message.charAt(chara) + "").toLowerCase();
                SHalf = SHalfS + SHalf;
            }
        }

        //Concatenation of first and second half of message.
        String EditedMessage = FHalf + SHalf;

        //output name of user who sent message
        System.out.println("Posted by: " + usernamePosted + "\n");

        //Print day message sent 
        if (when != "") {
            System.out.printf("%"+dist+"s\n", when);
        } 
        //Put in so that a new line wouldnt be created for every time the code runs even when "when" was empty

        //Part 3:MessageAlignment
        if(width < 40) {
            System.out.printf("%40s\n\n", EditedMessage);
        } else {
            System.out.println(EditedMessage + "\n");
        }

        //Part 4:Time format, Print hrs:mins:sec leading zeros
        System.out.printf("Posted At: %02d:%02d:%02d\n", hrs, mins, sec);
    }
}