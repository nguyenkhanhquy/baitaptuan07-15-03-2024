package hcmute.edu.vn.baitaptuan07_21110282_sqlite;

import java.io.Serializable;

public class NotesModel implements Serializable {
    private int IdNote;
    private String NameNote;

    public NotesModel(int idNote, String nameNote) {
        IdNote = idNote;
        NameNote = nameNote;
    }

    public int getIdNote() {
        return IdNote;
    }

    public void setIdNote(int idNote) {
        IdNote = idNote;
    }

    public String getNameNote() {
        return NameNote;
    }

    public void setNameNote(String nameNote) {
        NameNote = nameNote;
    }
}
