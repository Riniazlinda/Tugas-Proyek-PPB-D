package cobanavigasi.com;

import java.io.Serializable;

public class Notes implements Serializable {
    private String headline;
    private String note;
    private String tag;

    public Notes(String headline, String note, String tag) {
        this.headline = headline;
        this.note = note;
        this.tag = tag;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public String getHeadline() {
        return headline;
    }

    public String getNote() {
        return note;
    }

    public String toString() {
        return " "+headline + "\n" + " " + note + "\n" + " " + tag;
    }
}
