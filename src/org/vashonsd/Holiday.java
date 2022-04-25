package org.vashonsd;
import java.time.LocalDateTime;

public class Holiday {
    int month;
    String name;
    String desc;
    boolean recog;

    public Holiday(int month, String name, String desc, boolean recog) {
        this.month = month;
        this.name = name;
        this.desc = desc;
        this.recog = recog;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isRecog() {
        return recog;
    }

    public void setRecog(boolean recog) {
        this.recog = recog;
    }
    public void isToday(boolean today) {
        LocalDateTime now = LocalDateTime.now();
    }

}



