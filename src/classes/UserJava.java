package classes;

public class UserJava {
    private static Integer currentId = 0;

    private String name;
    private String surName;
    private Boolean isOffline;
    private String nickName;

    private Integer userId = ++currentId;

    public UserJava(String name, String surName, String nickName){
        this.name = name;
        this.surName = surName;
        this.nickName = nickName;
        this.isOffline = true;
    }

    public UserJava(String name, String surName, String nickName, Boolean isOffline){
        this.name = name;
        this.surName = surName;
        this.nickName = nickName;
        this.isOffline = isOffline;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Boolean getOffline() {
        return isOffline;
    }

    public void setOffline(Boolean offline) {
        isOffline = offline;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString(){
        String str;
        if(isOffline)
            str = "sei offline";
        else
            str = "sei Online";

        return new StringBuilder()
                .append("Ciao ")
                .append(name)
                .append(surName)
                .append(" sei ")
                .append(str)
                .toString();

    }

    public Integer getUserId() {
        return userId;
    }
}