package ru.Kuznetsov.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Set;
public class OfferStatistic {
    @JsonProperty("stuff_statistics")
    private Map<String,Integer> stuffStatistic;
    @JsonProperty("client_statistics")
    private Map<String,Integer> clientStatistic;
    @JsonProperty("client_surnames")
    private Set<String> clientSurnames;
    public OfferStatistic() {
    }
    public OfferStatistic(Map<String, Integer> stuffStatistic, Map<String, Integer> clientStatistic, Set<String> clientSurnames) {
        this.stuffStatistic = stuffStatistic;
        this.clientStatistic = clientStatistic;
        this.clientSurnames = clientSurnames;
    }
    public Map<String, Integer> getStuffStatistic() {
        return stuffStatistic;
    }
    public void setStuffStatistic(Map<String, Integer> stuffStatistic) {
        this.stuffStatistic = stuffStatistic;
    }
    public Map<String, Integer> getClientStatistic() {
        return clientStatistic;
    }
    public void setClientStatistic(Map<String, Integer> clientStatistic) {
        this.clientStatistic = clientStatistic;
    }
    public Set<String> getClientSurnames() {
        return clientSurnames;
    }
    public void setClientSurnames(Set<String> clientSurnames) {
        this.clientSurnames = clientSurnames;
    }
}
