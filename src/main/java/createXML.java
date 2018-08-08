import jdk.internal.util.xml.impl.XMLWriter;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocument;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:12 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class createXML {
    public static void main(String[] args) {
        Document dom=new DOMDocument();
        Element root=dom.addElement("subject");
        Element it=root.addElement("IT");
        Element math=root.addElement("Math");
        it.addAttribute("1","Java");
        it.addAttribute("2","C++");
        it.addAttribute("3","Python");
        math.addAttribute("1","线性代数");
        math.addAttribute("2","微积分");

        File file=new File("Xml.xml");
        try {
            FileOutputStream fos=new FileOutputStream(file);

            XMLWriter writer=new XMLWriter(fos,"test", Charset.defaultCharset());
            writer.write(String.valueOf(dom));
            fos.flush();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
