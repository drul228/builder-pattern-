package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String location;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.location = address;
        return this;
    }

    public Person build() throws Exception {
        if (this.age < 0 || this.age > 100)
            throw new IllegalArgumentException("Введено некорректное значение -  " + this.age + " допустимый диапазон от 0 до 100");
        if (this.name == null ||this.surname == null)
            throw new IllegalStateException("Не все данные введены");
        return new Person(name, surname, age, location);
    }
}
