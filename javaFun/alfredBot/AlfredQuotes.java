import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        String greeting = String.format("Good evening, %s. Lovely to see you %s", name, dayPeriod);
        return greeting;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Hello, The current date is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        int isAlexis = conversation.indexOf("Alexis");
        int isAlfred = conversation.indexOf("Alfred");
        if(isAlexis > -1) {
            return "Right away sir, she certainly isn't sophisticated enough for that";
        } else if (isAlfred > -1) {
            return "At your service. As you wish, naturally";
        } else {
            return "Right. And with that I shall retire";
        }
    }
}