package dev.chachy.data;

public abstract class Person {
    private String name;
    private String dateOfBirth;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
}
