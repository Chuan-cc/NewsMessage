package domain;

public class Comment {
    private Integer id=0;
    private Integer news_id;
    private String news_title;
    private String com;
    private Integer publisher_id;
    private String publisher;
    private String time;

    public Comment() {
    }

    public Comment(Integer id, Integer news_id, String news_title, String com, Integer publisher_id, String publisher, String time) {
        this.id = id;
        this.news_id = news_id;
        this.news_title = news_title;
        this.com = com;
        this.publisher_id = publisher_id;
        this.publisher = publisher;
        this.time = time;
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
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return news_id
     */
    public Integer getNews_id() {
        return news_id;
    }

    /**
     * 设置
     * @param news_id
     */
    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    /**
     * 获取
     * @return news_title
     */
    public String getNews_title() {
        return news_title;
    }

    /**
     * 设置
     * @param news_title
     */
    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    /**
     * 获取
     * @return com
     */
    public String getCom() {
        return com;
    }

    /**
     * 设置
     * @param com
     */
    public void setCom(String com) {
        this.com = com;
    }

    /**
     * 获取
     * @return publisher_id
     */
    public Integer getPublisher_id() {
        return publisher_id;
    }

    /**
     * 设置
     * @param publisher_id
     */
    public void setPublisher_id(Integer publisher_id) {
        this.publisher_id = publisher_id;
    }

    /**
     * 获取
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * 获取
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "Comment{id = " + id + ", news_id = " + news_id + ", news_title = " + news_title + ", com = " + com + ", publisher_id = " + publisher_id + ", publisher = " + publisher + ", time = " + time + "}";
    }
}
