package task_02;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaPost {

    private final String copyright;
    private final String date;
    private final String explanation;
    private final String hdurl;
    private final String mediaType;
    private final String serviceVersion;
    private final String title;
    private final String url;


    public NasaPost(
            @JsonProperty("copyright") String copyright,
            @JsonProperty("date") String date,
            @JsonProperty("explanation") String explanation,
            @JsonProperty("hdurl") String hdurl,
            @JsonProperty("media_type") String mediaType,
            @JsonProperty("service_version") String serviceVersion,
            @JsonProperty("title") String title,
            @JsonProperty("url") String url
    ) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.mediaType = mediaType;
        this.serviceVersion = serviceVersion;
        this.title = title;
        this.url = url;
    }

    public String getHdurl() {
        return hdurl;
    }

    @Override
    public String toString() {
        return "Post:" +
                "\n copyright: " + copyright +
                "\n date: " + date +
                "\n explanation: " + explanation +
                "\n hdurl: " + hdurl +
                "\n media_type: " + mediaType +
                "\n service_version: " + serviceVersion +
                "\n title: " + title +
                "\n url: " + url;

    }
}
