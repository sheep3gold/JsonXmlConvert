import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:41 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class copy {
    public static void main(String[] args) {
        try {
            //第一步：创建文档对象document
            Document document = DocumentHelper.createDocument();
            //第二步：由外到内添加子节点
            Element bookstore = document.addElement("bookstore");
            Element book1 = bookstore.addElement("book");
            Element book2 = bookstore.addElement("book");
            Element name1 = book1.addElement("name");
            Element price1 = book1.addElement("price");
            Element when1 = book1.addElement("when");
            Element name2 = book2.addElement("name");
            Element price2 = book2.addElement("price");
            Element when2 = book2.addElement("when");
            //第三步：设置节点的属性、内容
            book1.addAttribute("from", "China");
            book2.addAttribute("from", "America");
            name1.setText("三国演义");
            price1.setText("￥89");
            when1.setText("2017版");
            name2.setText("JavaScript高级程序设计");
            price2.setText("$18");
            when2.setText("2016");
            //设置输出格式
            OutputFormat format = OutputFormat.createPrettyPrint();
            //设置文件编码
            format.setEncoding("utf-8");
            //将写好的文档document输出到指定XML文件中并关闭XMLWriter对象
            XMLWriter xml = new XMLWriter(new FileOutputStream("books.xml"),format);
            //有时候我们的内容text中会有诸如/、>之类的，我们要告诉XML,不要转义这些字符
            xml.setEscapeText(false);
            xml.write(document);
            xml.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
