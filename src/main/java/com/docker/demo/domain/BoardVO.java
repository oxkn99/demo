package com.docker.demo.domain;

public class BoardVO {

    char deleteYn;
    String id,pid,title,userId,content,regDt,modDt;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public char getDeleteYn() {
        return deleteYn;
    }

    public void setDeleteYn(char deleteYn) {
        this.deleteYn = deleteYn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDt() {
        return regDt;
    }

    public void setRegDt(String regDt) {
        this.regDt = regDt;
    }

    public String getModDt() {
        return modDt;
    }

    public void setModDt(String modDt) {
        this.modDt = modDt;
    }

    @Override
    public String toString() {
        return "boardVO{" +
                "id=" + id +
                ", pid=" + pid +
                ", deleteYn=" + deleteYn +
                ", title='" + title + '\'' +
                ", userId='" + userId + '\'' +
                ", content='" + content + '\'' +
                ", regDt='" + regDt + '\'' +
                ", modDt='" + modDt + '\'' +
                '}';
    }
}
