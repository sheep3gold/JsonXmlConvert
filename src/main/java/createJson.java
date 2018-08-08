import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 14:18 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class createJson {
    public static void main(String[] args) {
        JsonObject object1=new JsonObject();
        JsonArray array=new JsonArray();
        JsonObject lan1=new JsonObject();
        lan1.addProperty("1","Java");
        lan1.addProperty("2","C++");
        lan1.addProperty("3","Python");
        array.add(lan1);
        object1.add("IT",array);

        JsonObject math1=new JsonObject();
        math1.addProperty("1","线性代数");
        math1.addProperty("2","微积分");
        object1.add("Math",math1);

        JsonObject object2=new JsonObject();
        object2.add("subject",object1);

        System.out.println(object2.toString());

        File file=new File("create.json");
        try {
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(object2.toString());
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}