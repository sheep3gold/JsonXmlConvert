import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:54 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class convertXML {
    List<String> tag=new ArrayList<String>();
    public static void main(String[] args) throws Exception {
        SAXReader reader=new SAXReader();
        Document doc=reader.read(new File("books.xml"));
        //获取文档根节点
        Element root = doc.getRootElement();
        //调用下面获取子节点的递归函数。
        List<String> taglist=getChildNodes(root);
        Iterator it=taglist.iterator();

        










    }
    /**
     * 循环遍历每一个节点
     * @param elem
     */
    private static List<String>  getChildNodes(Element elem){
        List<String> tag=new LinkedList<String>();
        System.out.println(elem.getName());
        tag.add(elem.getName());
        Iterator<Node> it=    elem.nodeIterator();
        while (it.hasNext()){
            Node node = it.next();
            if (node instanceof Element){
                Element e1 = (Element)node;
                getChildNodes(e1);
            }

        }
        return tag;
    }

}
