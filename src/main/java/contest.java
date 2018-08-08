/**
 * @ Author     ：yx
 * @ Date       ：Created in 19:07 2018/8/8
 * @ Description：${description}
 * @ Modified By：
 */
public class contest {
    private String id;
    private String name;
    private String email;
    private String qq;
    private String wife;

    /**
     * @param id
     * @param name
     * @param email
     * @param qq
     * @param wife
     */
    public contest(String id, String name, String email, String qq, String wife) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.qq = qq;
        this.wife = wife;
    }


    public contest() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.email + "--" + this.id + "--" + this.name + "--" + this.qq + "--" + this.wife+"	";


    }

}
