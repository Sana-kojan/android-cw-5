package com.example.hw2;

public class Classes {
    private String C_code;
    private String C_Name;
    private String C_Location;
    private String C_Instructor;
    private String C_Time;
    private String C_Days;
    private boolean isOpen;
    private int section_num;
    private int image;

    public Classes(String c_code, String c_Time, String c_Days, boolean isOpen, int section_num, int image) {
        C_code = c_code;
        C_Time = c_Time;
        C_Days = c_Days;
        this.isOpen = isOpen;
        this.section_num = section_num;
        this.image=image;
    }

    public String getC_code() {
        return C_code;
    }

    public void setC_code(String c_code) {
        C_code = c_code;
    }

    public String getC_Name() {
        return C_Name;
    }

    public void setC_Name(String c_Name) {
        C_Name = c_Name;
    }

    public String getC_Location() {
        return C_Location;
    }

    public void setC_Location(String c_Location) {
        C_Location = c_Location;
    }

    public String getC_Instructor() {
        return C_Instructor;
    }

    public void setC_Instructor(String c_Instructor) {
        C_Instructor = c_Instructor;
    }

    public String getC_Time() {
        return C_Time;
    }

    public void setC_Time(String c_Time) {
        C_Time = c_Time;
    }

    public String getC_Days() {
        return C_Days;
    }

    public void setC_Days(String c_Days) {
        C_Days = c_Days;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getSection_num() {
        return section_num;
    }

    public void setSection_num(int section_num) {
        this.section_num = section_num;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
