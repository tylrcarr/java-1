import java.util.Map;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class foo {
    public static void main(String[] args) throws IOException {
        Map root = new Gson().fromJson(new FileReader("./json/bulbasaur.json"), Map.class);
        System.out.println(root.get("hp")); 
    }
}
