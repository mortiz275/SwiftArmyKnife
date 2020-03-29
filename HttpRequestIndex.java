public class HttpRequestIndex extends HttpRequest{
    public Boolean parseIndex(){
        for(final String line:urlContent){
            parseLine(line);
        }
        return true;
    }

    private void parseLine(final String line){
        System.out.println("\nParsing: "+line);

        final String[] subString= line.split("\"");

        if(subString.length>0){
            int n=0;
            for(final String s:subString){
                System.out.println("Substring: "+n+"= "+s);
                n++;
            }
        }
        //Substring 11 is the Contact URL we want to do a HttpRequest
        if(subString.length>11){
            //Substring 9 is "ContactURL"
            if(subString[9].equals("ContactURL")){
                String contactURL = subString[11];

                System.out.println("\nHttpRequest at: "+contactURL);

                String URL= contactURL;
                HttpRequest request= new HttpRequest();
                if(request.readURL(URL)){
                    System.out.println(request);
                }
                
            }
        }
    }
}