package domain;

public class Corporate {
    private Integer id=0;
    private String company_name;
    private String writename;
    private String phone_number;
    private String pswd;


    public Corporate() {
    }

    public Corporate( String company_name, String writename, String phone_number, String pswd) {
        this.company_name = company_name;
        this.writename = writename;
        this.phone_number = phone_number;
        this.pswd = pswd;
    }

    /**
     * 获取
     * @return company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * 设置
     * @param company_name
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return writename
     */
    public String getWritename() {
        return writename;
    }

    /**
     * 设置
     * @param writename
     */
    public void setWritename(String writename) {
        this.writename = writename;
    }

    /**
     * 获取
     * @return phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * 设置
     * @param phone_number
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * 获取
     * @return pswd
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * 设置
     * @param pswd
     */
    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String toString() {
        return "Corporate{id = " + id + ", company_name = " + company_name + ", writename = " + writename + ", phone_number = " + phone_number + ", pswd = " + pswd + "}";
    }
}
