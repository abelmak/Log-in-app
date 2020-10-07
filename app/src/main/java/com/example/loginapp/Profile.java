package com.example.loginapp;

public class Profile {
    private Integer cGPA;
    private Integer pGPA;
    private Integer accCredits;
    private Integer semCredits;

    Profile(Integer cGPA, Integer pGPA, Integer accCredits, Integer semCredits){
        this.cGPA = cGPA;
        this.pGPA = pGPA;
        this.accCredits = accCredits;
        this.semCredits = semCredits;
    }

    public Integer getcGPA() {
        return cGPA;
    }

    public void setcGPA(Integer cGPA) {
        this.cGPA = cGPA;
    }

    public Integer getpGPA() {
        return pGPA;
    }

    public void setpGPA(Integer pGPA) {
        this.pGPA = pGPA;
    }

    public Integer getAccCredits() {
        return accCredits;
    }

    public void setAccCredits(Integer accCredits) {
        this.accCredits = accCredits;
    }

    public Integer getSemCredits() {
        return semCredits;
    }

    public void setSemCredits(Integer semCredits) {
        this.semCredits = semCredits;
    }
}
