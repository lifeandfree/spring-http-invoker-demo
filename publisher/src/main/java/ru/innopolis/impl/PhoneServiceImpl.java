package ru.innopolis.impl;

import ru.innopolis.api.Person;
import ru.innopolis.api.PhoneService;

public class PhoneServiceImpl implements PhoneService {
    public String getPhone() {
        return "2-12-85-00";
    }

    public Person getPerson() {
        Person person = new Person();
        person.setName("John");
        person.setAge(22);
        return person;
    }
}
