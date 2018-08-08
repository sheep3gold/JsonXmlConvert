import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocument;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 19:27 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class XmlToJson {
    public void convert(List<contest> list){
        contest[]ct=new contest[3];
        for(int j=0;j<3;j++){
            ct[j]=new contest();
            ct[j]=list.get(j);
        }
//        contest ct=list.get(0);
        JsonObject object1=new JsonObject();
        JsonArray array=new JsonArray();

        JsonObject []lan=new JsonObject[3];
        for (int i=0;i<3;i++){
            lan[i]=new JsonObject();
            lan[i].addProperty("name",ct[i].getName());
            lan[i].addProperty("email",ct[i].getEmail());
            lan[i].addProperty("qq",ct[i].getQq());
            lan[i].addProperty("wife",ct[i].getWife());
            array.add(lan[i]);
        }
//        JsonObject lan1=new JsonObject();
//        lan1.addProperty("name",ct.getName());
//        lan1.addProperty("email",ct.getEmail());
//        lan1.addProperty("qq",ct.getQq());
//        lan1.addProperty("wife",ct.getWife());
//        array.add(lan1);
        object1.add("contestList",array);

        File file=new File("test.json");
        try {
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(object1.toString());
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
