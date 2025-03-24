package com.abhishek.samplekafkaconsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.elasticsearch.annotations.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(indexName = "wikimedia")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wikimedia {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("namespace")
    private int namespace;

    @JsonProperty("title")
    private String title;

    @JsonProperty("title_url")
    private String titleUrl;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("user")
    private String user;

    @JsonProperty("bot")
    private boolean bot;

    @JsonProperty("notify_url")
    private String notifyUrl;

    @JsonProperty("server_url")
    private String serverUrl;

    @JsonProperty("server_name")
    private String serverName;

    @JsonProperty("server_script_path")
    private String serverScriptPath;

    @JsonProperty("wiki")
    private String wiki;

    @JsonProperty("parsedcomment")
    private String parsedComment;

    @JsonProperty("meta")
    private Meta meta;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNamespace() {
        return namespace;
    }

    public void setNamespace(int namespace) {
        this.namespace = namespace;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerScriptPath() {
        return serverScriptPath;
    }

    public void setServerScriptPath(String serverScriptPath) {
        this.serverScriptPath = serverScriptPath;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String getParsedComment() {
        return parsedComment;
    }

    public void setParsedComment(String parsedComment) {
        this.parsedComment = parsedComment;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    // Inner class for Meta
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Meta {

        @JsonProperty("id")
        private String metaId;

        @JsonProperty("uri")
        private String uri;

        @JsonProperty("request_id")
        private String requestId;

        @JsonProperty("dt")
        private String dt;

        @JsonProperty("domain")
        private String domain;

        @JsonProperty("stream")
        private String stream;

        @JsonProperty("topic")
        private String topic;

        @JsonProperty("partition")
        private int partition;

        @JsonProperty("offset")
        private Long offset;

        // Getters and Setters
        public String getMetaId() {
            return metaId;
        }

        public void setMetaId(String metaId) {
            this.metaId = metaId;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getDt() {
            return dt;
        }

        public void setDt(String dt) {
            this.dt = dt;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getStream() {
            return stream;
        }

        public void setStream(String stream) {
            this.stream = stream;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public int getPartition() {
            return partition;
        }

        public void setPartition(int partition) {
            this.partition = partition;
        }

        public Long getOffset() {
            return offset;
        }

        public void setOffset(Long offset) {
            this.offset = offset;
        }
    }
}
