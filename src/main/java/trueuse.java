import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 19:06 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class trueuse {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        XmlToJson xij=new XmlToJson();
        try {
            // 实例化一个类用于添加xml文件
            List<contest> list = new ArrayList<contest>();

            SAXReader reader = new SAXReader();
            Document doc = reader.read(new File("test.xml"));
            // 读取指定标签
            Iterator<Element> eleit = doc.getRootElement().elementIterator("user");

            ArrayList newlist = new ArrayList();
            // 创建新集合
            while (eleit.hasNext()) {

                Element ele = eleit.next();
                contest con = new contest();
                con.setId(ele.attributeValue("id"));
                con.setName(ele.elementText("name"));
                con.setEmail(ele.elementText("email"));
                con.setQq(ele.elementText("qq"));
                con.setWife(ele.elementText("wife"));
                list.add(con);

                Iterator it = list.iterator(); // 通过老集合获取迭代器
                while (it.hasNext()) { // 遍历老集合
                    Object obj = it.next(); // 得到老集合的元素
                    if (!newlist.contains(obj)) {
                        newlist.add(obj);
                    }
                }

            }
            xij.convert(list);

            System.out.println(list.get(0));
            // System.out.println(" =======");
            System.out.println(list.get(1));
            // System.out.println(" =======");
            System.out.println(list.get(2));

        } catch (

                Exception e) {
            e.printStackTrace();
        }

    }

}
