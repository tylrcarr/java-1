import java.util.Map;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class foo {
    public static void main(String[] args) throws IOException {
        Map data = new Gson().fromJson(new FileReader(args[0]), Map.class);
        System.out.println(data.get("hp")); 
    }
}
