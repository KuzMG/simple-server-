package ru.Kuznetsov.modelTask1;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "stuff")
public class Stuff {
    @Id
    @Column(name = "id")
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
    @JsonProperty("salary_multiplier")
    @Column(name = "salary_multiplier")
    private Double salaryMultiplier;
    @OneToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;
    public Stuff() {
    }
    public Stuff(String surname, String name, String patronymic, Boolean sex, LocalDate birthDate, Double salaryMultiplier, Position position, UUID id) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.sex = sex;
        this.birthDate = birthDate;
        this.salaryMultiplier = salaryMultiplier;

        this.position = position;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Stuff{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDate +
                ", salaryMultiplier=" + salaryMultiplier +
               // ", passportSerial='" + passportSerial + '\'' +
                ", position=" + position +
                ", id=" + id +
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
    public Double getSalaryMultiplier() {
        return salaryMultiplier;
    }
    public void setSalaryMultiplier(Double salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
}
