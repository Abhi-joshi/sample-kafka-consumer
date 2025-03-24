package com.abhishek.samplekafkaconsumer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(indexName = "wikimedia")
public class Wikimedia {

    @Id
    @JsonProperty("log_id")
    private Long logId;

    @JsonProperty("$schema")
    @Field(type = FieldType.Keyword)
    private String schema;

    @Field(type = FieldType.Nested)
    private Meta meta;

    @Field(type = FieldType.Keyword)
    private String type;

    @Field(type = FieldType.Integer)
    private int namespace;

    @Field(type = FieldType.Text)
    private String title;

    @JsonProperty("title_url")
    @Field(type = FieldType.Keyword)
    private String titleUrl;

    @Field(type = FieldType.Text)
    private String comment;

    @Field(type = FieldType.Long)
    private Long timestamp;

    @Field(type = FieldType.Keyword)
    private String user;

    @Field(type = FieldType.Boolean)
    private boolean bot;

    @JsonProperty("log_type")
    @Field(type = FieldType.Keyword)
    private String logType;

    @JsonProperty("log_action")
    @Field(type = FieldType.Keyword)
    private String logAction;

    @JsonProperty("log_params")
    @Field(type = FieldType.Object)
    private Object[] logParams;

    @JsonProperty("log_action_comment")
    @Field(type = FieldType.Text)
    private String logActionComment;

    @JsonProperty("server_url")
    @Field(type = FieldType.Keyword)
    private String serverUrl;

    @JsonProperty("server_name")
    @Field(type = FieldType.Keyword)
    private String serverName;

    @JsonProperty("server_script_path")
    @Field(type = FieldType.Keyword)
    private String serverScriptPath;

    @Field(type = FieldType.Keyword)
    private String wiki;

    @Field(type = FieldType.Text)
    private String parsedcomment;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
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

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogAction() {
        return logAction;
    }

    public void setLogAction(String logAction) {
        this.logAction = logAction;
    }

    public Object[] getLogParams() {
        return logParams;
    }

    public void setLogParams(Object[] logParams) {
        this.logParams = logParams;
    }

    public String getLogActionComment() {
        return logActionComment;
    }

    public void setLogActionComment(String logActionComment) {
        this.logActionComment = logActionComment;
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

    public String getParsedcomment() {
        return parsedcomment;
    }

    public void setParsedcomment(String parsedcomment) {
        this.parsedcomment = parsedcomment;
    }

    public static class Meta {

        @Field(type = FieldType.Keyword)
        private String uri;

        @JsonProperty("request_id")
        @Field(type = FieldType.Keyword)
        private String requestId;

        @Field(type = FieldType.Keyword)
        private String id;

        @Field(type = FieldType.Keyword)
        private String dt;

        @Field(type = FieldType.Keyword)
        private String domain;

        @Field(type = FieldType.Keyword)
        private String stream;

        @Field(type = FieldType.Keyword)
        private String topic;

        @Field(type = FieldType.Integer)
        private int partition;

        @Field(type = FieldType.Long)
        private long offset;

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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public long getOffset() {
            return offset;
        }

        public void setOffset(long offset) {
            this.offset = offset;
        }
    }
}
