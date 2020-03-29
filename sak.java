public class sak{
    public static void main(String[] args){
        System.out.println("");
        if(args.length<1){
            //No input
            System.out.println("The app needs one command to execute. Use -Help to "
            +"see all the commands");
            System.out.println("");
            Help.printHelp();

        }else if(args[0].equalsIgnoreCase("-Help")){
            System.out.println("Executing Help...");
            Help.printHelp();

        }else if(args[0].equalsIgnoreCase("-HttpRequest")){
            System.out.println("Executing HttpRequest...");
            if(args.length<2){
                System.out.println("Invalid URL, please try again");
            }else{
                String URL= args[1];
                HttpRequest request= new HttpRequest();
                if(request.readURL(URL)){
                    System.out.println(request);
                }
            }
        }else if(args[0].equalsIgnoreCase("-HttpRequestIndex")){
            System.out.println("Executing HttpRequestIndex...");
            if(args.length!=2){
                System.out.print("Invalid command Syntax.");
                Help.printHelp();
            }else{
                String indexURL= args[1];
                HttpRequestIndex requestIndex= new HttpRequestIndex();
                if(requestIndex.readURL(indexURL)){
                    System.out.println(requestIndex);
                    requestIndex.parseIndex();
                }
            }
        }
    }
}