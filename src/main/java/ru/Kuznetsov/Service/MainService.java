package ru.Kuznetsov.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Kuznetsov.DTO.NewOfferParameters;
import ru.Kuznetsov.DTO.OfferStatistic;
import ru.Kuznetsov.Repository.*;
import ru.Kuznetsov.modelTask1.*;
import java.time.LocalDate;
import java.util.*;
@Service
public class MainService {
    @Autowired
    private StuffR stuffR;
    @Autowired
    private ClientR clientR;
    @Autowired
    private OfferR offerR;
    @Autowired
    private OfficeR officeR;
    @Autowired
    private PositionR positionR;
    public List<Stuff> getAllStuff(){
        return (List<Stuff>) stuffR.findAll();
    }
    public Stuff getStuffById(UUID id){
        return stuffR.findById(id).get();
    }


    public List<Client> getAllClient(){
        return (List<Client>) clientR.findAll();
    }
    public Client getClientById(UUID id){
        return clientR.findById(id).get();
    }


    public List<Offer> getAllOffer(){
        return (List<Offer>) offerR.findAll();
    }
    public Offer getOfferById(UUID id){
        return offerR.findById(id).get();
    }

    public List<Office> getAllOffice(){
        return (List<Office>) officeR.findAll();
    }
    public Office getOfficeById(UUID id){
        return officeR.findById(id).get();
    }


    public List<Position> getAllPosition(){
        return (List<Position>) positionR.findAll();
    }
    public Position getPositionById(UUID id){
        return positionR.findById(id).get();
    }

    public Offer signNewOffer(NewOfferParameters offerParameters) {
        return new Offer(UUID.randomUUID(),
                "ssdsad",
                LocalDate.now(),
                offerParameters.getEndingDate(),
                offerParameters.getStartDate(),
                getStuffById(offerParameters.getStuffId()),
                getClientById(offerParameters.getClientId()),
                getOfficeById(UUID.fromString("00000000-0000-0000-0000-00000000000e")));
    }
    public OfferStatistic getStatistic(){
        Map<String,Integer> stuffStatistic = new HashMap();
        Map<String,Integer> clientStatistic = new HashMap();
        Set<String> clientSurnames = new HashSet();
        for (Stuff stuff: getAllStuff()){
            String fullName = stuff.getName()+ " " +stuff.getSurname()+ " " +stuff.getPatronymic();
            if(!stuffStatistic.containsKey(fullName))
                stuffStatistic.put(fullName, 1);
            else
                stuffStatistic.put(fullName, stuffStatistic.get(fullName)+1);
        }
        for (Client client: getAllClient()){
            String fullName = client.getName()+ " " +client.getSurname()+ " " +client.getPatronymic();
            if(!clientSurnames.equals(client.getSurname()))
                clientSurnames.add(client.getSurname());

            if(!clientStatistic.containsKey(fullName))
                clientStatistic.put(fullName, 1);
            else
                clientStatistic.put(fullName, clientStatistic.get(fullName)+1);
        }
        return new OfferStatistic(stuffStatistic,clientStatistic,clientSurnames);
    }

}
