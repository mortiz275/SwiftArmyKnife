public class Help{

    public Help(){
        printHelp();
    }

    public static void printHelp(){
        System.out.println("For the app to execute you must input one of the following commands:");
        System.out.println("-Help: Shows all the commands.");
        System.out.println("-HttpRequest[URL] reads an URL and prints its information");
        System.out.println("-HttpRequestIndex[URL] prints a JSON referenced to the URL and parses it");
    }
}