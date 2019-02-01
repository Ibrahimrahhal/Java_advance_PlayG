import java.net.*;
import java.io.*;

public class Main {


    public static void main(String[] argv){
        URL google = null;
        URLConnection getGoogle=null;
        String hldSTR;
        try {
             google = new URL("https://arabic-name-generator.herokuapp.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            getGoogle = google.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            InputStreamReader googlePage = new InputStreamReader( getGoogle.getInputStream());
            BufferedReader objReader = new BufferedReader(googlePage);
            while ((hldSTR = objReader.readLine()) != null) {
                System.out.println(hldSTR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
