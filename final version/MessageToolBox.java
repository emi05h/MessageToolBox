public class MessageToolBox {

    // 1. return time in HH:MM:SS 
    public static String timeOfDayFormatted(long timeInMillis) {
        long sinceMidnight, day, hrs, mins, sec;

        day =  1000*60*60*24;
        sinceMidnight = timeInMillis%(day)/1000;
        hrs = sinceMidnight/(60*60);
        mins = sinceMidnight%(60*60)/60;
        sec = sinceMidnight%60;

        String timeOfDayFormatted = String.format("%02d:%02d:%02d", hrs, mins, sec);
        return timeOfDayFormatted;
    }
    // 2. return day NAME
    public static String dayName(long timeInMillis) {
        int day, dayOfWeek;

        day =  1000*60*60*24;
        dayOfWeek = (int)(timeInMillis/day)%7;

        String[] weekDay = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

        String dayName = weekDay[dayOfWeek];
        return dayName;
    }
    // 3. return AGE of post in DAYS 
    public static int ageOfPost(long postTime) {
        int day =  1000*60*60*24;
        long now = System.currentTimeMillis();

        int ageOfPost = (int)(now - postTime)/day;
        return ageOfPost;
    }
    // 4. Message text and width parameter 
    public static String centre(String messageText, int width){
        if(width <= 0){
            return "";
        }
        if(width < messageText.length()){
            return "";
        }
        if(messageText == ""){
            return messageText.format("%"+ width + "s", "");
        }

        int messageBuffer,messageBufferL;
        String messageTextCentreL,messageTextCentreR,messageTextCentre,messageTextBuffer;

        messageTextBuffer = "";
        messageBuffer = (width - messageText.length())/2;
        messageBufferL = messageBuffer + messageText.length();

        messageTextCentreL = String.format("%" +  messageBufferL + "s", messageText);
        messageTextCentreR = String.format("%" + messageBuffer + "s", messageTextBuffer);
        messageTextCentre = messageTextCentreL + messageTextCentreR;

        return messageTextCentre;
    }
    // 5. Message text as series of lines 
    public static void display(String messageText, int width){
        int min,max;
        min = 10;
        max = 80;
        if(messageText.length() == 0){
            return;
        }
        if(width < 10){
            width = min;
        }
        if(width > 80){
            width = max;
        }

        String messageTextTemp = "";
        int count,start,end;
        for(count = 1,start=0,end = width
        ;start < messageText.length()
        ;count++,start = end,end = count*width){
            if(end > messageText.length()){
                end = messageText.length();
            }
            messageTextTemp = messageText.substring(start,end);  
            System.out.println(messageTextTemp);
        }
    }
}