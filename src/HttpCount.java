import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HttpCount {
    public static void main(String[] args) throws Exception {
        URL url=new URL("http://localhost:8080/hello-servlet");
        HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.getInputStream();
    }

}
