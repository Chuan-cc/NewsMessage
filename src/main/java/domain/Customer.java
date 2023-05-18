package domain;

public class Customer {
    private Integer id=0;
    private String usname;
    private String gender;
    private String birthday;
    private String phone_number;
    private String pswd;

    public Customer() {
    }

    public Customer(String usname, String gender, String birthday, String phone_number, String pswd) {
        this.usname = usname;
        this.gender = gender;
        this.birthday = birthday;
        this.phone_number = phone_number;
        this.pswd = pswd;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */

    /**
     * 获取
     * @return usname
     */
    public String getUsname() {
        return usname;
    }

    /**
     * 设置
     * @param usname
     */
    public void setUsname(String usname) {
        this.usname = usname;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
        return "Customer{id = " + id + ", usname = " + usname + ", gender = " + gender + ", birthday = " + birthday + ", phone_number = " + phone_number + ", pswd = " + pswd + "}";
    }
}
