package ru.Tibilov.modelTask1;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column
    private UUID id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "sex")
    private Boolean sex;
    @JsonProperty("birth_date")
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "inn")
    private String inn;
    @JsonProperty("passport_serial")
    @Column(name = "passport_serial")
    private String passportSerial;
    @Column(name = "phone")
    private String phone;
    public Client() {
    }
    public Client(UUID id, String surname, String name, String patronymic, Boolean sex, LocalDate birthDate, String inn, String passportSerial, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.sex = sex;
        this.birthDate = birthDate;
        this.inn = inn;
        this.passportSerial = passportSerial;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDate +
                ", inn='" + inn + '\'' +
                ", passportSerial='" + passportSerial + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public Boolean getSex() {
        return sex;
    }
    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getInn() {
        return inn;
    }
    public void setInn(String inn) {
        this.inn = inn;
    }
    public String getPassportSerial() {
        return passportSerial;
    }
    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
