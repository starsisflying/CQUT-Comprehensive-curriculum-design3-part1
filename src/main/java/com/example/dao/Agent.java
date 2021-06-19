package com.example.dao;

public class Agent {
    private String name;
    private String age;
    private String occupation;
    private String marriage;
    private String gender;
    private String race;
    private String nativePlace;
    private String education;
    private String department;
    private String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String educaton) {
        this.education = educaton;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", occupation='" + occupation + '\'' +
                ", marriage='" + marriage + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", education='" + education + '\'' +
                ", department='" + department + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
