public class TestMessageToolBox {
    public static void main(String[] args) {
        // time message posted in MILLISECONDS
        long postTime = 1700752805111l;
        // current time in MILLISECONDS
        long timeNow = System.currentTimeMillis();
        // message text
        String messageText = "artificial intelligence and machine learning UL lm174 2023";
        String message2 = "Hello we are UL university students studying artificial intelligence and machine learning and we love CS4141";
        
        // 1. HH:MM:SS
        String currentTime = MessageToolBox.timeOfDayFormatted(timeNow);
        System.out.println("Posted at " + currentTime);
        // 2. DAY NAME
        String dayName = MessageToolBox.dayName(timeNow);
        System.out.println(dayName); 
        //4. CENTERING
        System.out.println(MessageToolBox.centre(messageText,88));
        //3. DAYS AGO
        int ageofpost = MessageToolBox.ageOfPost(postTime);
        System.out.printf("Age of post is %2d\n",ageofpost);
        //5. SERIES OF LINES
        MessageToolBox.display(message2,50);

    }
}