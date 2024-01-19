public class Assignment1final {
    public static void main(String[] args) {

        // name of current user
        String username = System.getProperty("user.name");
        // output name of user
        System.out.println("Posted by: " + username + "\n");

        // content of message
        String content = "According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway. Because bees don’t care what humans think is impossible."; 
        // replacing ". " with ".\n" to start new line
        String message = content.replace(". ", ".\n");
        // output message
        System.out.println(message);

        // amount of milliseconds today
        long sinceMidnight = System.currentTimeMillis()%(1000*60*60*24)/1000;
        // amout of hours, minutes, seconds
        long hrs = sinceMidnight/(60*60) + 1; // add +1 for daylight savings
        long mins = sinceMidnight%(60*60)/60;
        long sec = sinceMidnight%60;
        // output hrs:mins:sec to the right with leading zeros if needed
        System.out.printf("\n%40s %02d:%02d:%02d\n\n", "Posted at:", hrs, mins, sec);
    }
}