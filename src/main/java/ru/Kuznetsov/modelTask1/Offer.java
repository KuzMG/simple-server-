package ru.Kuznetsov.modelTask1;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "offer")
public class Offer {
    @Id
    @Column
    private UUID id;
    @JsonProperty("serial_number")
    @Column(name = "serial_numbers")
    private String serialNumbers;
    @JsonProperty("sign_date")
    @Column(name = "sign_date")
    private LocalDate signDate;
    @JsonProperty("ending_date")
    @Column(name = "ending_date")
    private LocalDate  endingDate;
    @JsonProperty("start_date")
    @Column(name = "start_date")
    private LocalDate  startDate;
    @OneToOne
    @JoinColumn(name = "stuff_id", referencedColumnName = "id")
    private Stuff stuff;
    @OneToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;
    @OneToOne
    @JoinColumn(name = "office_id", referencedColumnName = "id")
    private Office office;
    public Offer() {
    }
    public Offer(UUID id, String serialNumbers, LocalDate signDate, LocalDate endingDate, LocalDate startDate, Stuff stuff, Client client, Office office) {
        this.id = id;
        this.serialNumbers = serialNumbers;
        this.signDate = signDate;
        this.endingDate = endingDate;
        this.startDate = startDate;
        this.stuff = stuff;
        this.client = client;
        this.office = office;
    }
    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", serialNumbers='" + serialNumbers + '\'' +
                ", signDate=" + signDate +
                ", endingDate=" + endingDate +
                ", startDate=" + startDate +
                ", stuff=" + stuff +
                ", client=" + client +
                ", office=" + office +
                '}';
    }
    public Stuff getStuff() {
        return stuff;
    }
    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Office getOffice() {
        return office;
    }
    public void setOffice(Office office) {
        this.office = office;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getSerialNumbers() {
        return serialNumbers;
    }
    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }
    public LocalDate getSignDate() {
        return signDate;
    }
    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }
    public LocalDate getEndingDate() {
        return endingDate;
    }
    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
