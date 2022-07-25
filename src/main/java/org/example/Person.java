package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String location;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    protected Person(String name, String surname, int age, String location) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.location = location;
    }

    public boolean hasAge() {
        if (this.age == 0) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (this.location == null) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public String getAddress() {
        return this.location;
    }

    public void setAddress(String address) {
        this.location = address;

    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.location).setAge(this.age - 18);
    }

}
