package oop.q3;

public class Student {
    public String name;
    public String surname;
    public String country;
    public String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return name.equals(s.name) && surname.equals(s.surname) && country.equals(s.country);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + country.hashCode();
    }
}
