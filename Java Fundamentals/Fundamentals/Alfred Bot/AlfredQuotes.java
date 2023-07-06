import java.util.Date;

public class AlfredQuotes {


    public String basicGreeting() {
        return "Hello, lovely to see you. Isn't it nice out today?";
    }

    public String guestGreeting(String name, String time) {
        return String.format("Good %s, %s. It is lovely to see you.", time, name);
    }

    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") > -1) {
            return "This is the all-knowing, How may I help you?";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "How may I help you?";
        }

        return "If that will be all, good night.";
    }
}