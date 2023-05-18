package domain;

public class News {
    private Integer news_id;
    private Integer writer_id;
    private String title;
    private String type;
    private String context;
    private String publish_date;
    private Integer liked;

    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public News() {
    }

    public News(Integer news_id, Integer writer_id, String title, String type, String context, String publish_date) {
        this.news_id = news_id;
        this.writer_id = writer_id;
        this.title = title;
        this.type = type;
        this.context = context;
        this.publish_date = publish_date;
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
     * @return writer_id
     */
    public Integer getWriter_id() {
        return writer_id;
    }

    /**
     * 设置
     * @param writer_id
     */
    public void setWriter_id(Integer writer_id) {
        this.writer_id = writer_id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return context
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 获取
     * @return publish_date
     */
    public String getPublish_date() {
        return publish_date;
    }

    /**
     * 设置
     * @param publish_date
     */
    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    @Override
    public String toString() {
        return "News{" +
                "news_id=" + news_id +
                ", writer_id=" + writer_id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", context='" + context + '\'' +
                ", publish_date='" + publish_date + '\'' +
                ", liked=" + liked +
                '}';
    }
}
