package ru.Kuznetsov.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.Kuznetsov.DTO.NewOfferParameters;
import ru.Kuznetsov.DTO.OfferStatistic;
import ru.Kuznetsov.Service.MainService;
import ru.Kuznetsov.modelTask1.*;
import java.util.List;
import java.util.UUID;
@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/api/v1/stuff")
    private List<Stuff> getAllStuff(){
        return mainService.getAllStuff();
    }
    @GetMapping("/api/v1/stuff/{id}")
    private Stuff getStuffById(@PathVariable("id") UUID id){
        return mainService.getStuffById(id);
    }

    @GetMapping("/api/v1/client")
    private List<Client> getAllClient(){
        return mainService.getAllClient();
    }
    @GetMapping("/api/v1/client/{id}")
    private Client getClientById(@PathVariable("id") UUID id){
        return mainService.getClientById(id);
    }

    @GetMapping("/api/v1/office")
    private List<Office> getAllOffice(){
        return mainService.getAllOffice();
    }
    @GetMapping("/api/v1/office/{id}")
    private Office getOfficeById(@PathVariable("id") UUID id){
        return mainService.getOfficeById(id);
    }

    @GetMapping("/api/v1/offer")
    private List<Offer> getAllOffer(){
        return mainService.getAllOffer();
    }
    @GetMapping("/api/v1/offer/{id}")
    private Offer getOfferById(@PathVariable("id") UUID id){
        return mainService.getOfferById(id);
    }
    @PutMapping("/api/v1/offer")
    private Offer signNewOffer(@RequestBody NewOfferParameters offerParameters){
        return mainService.signNewOffer(offerParameters);
    }
    @GetMapping("/api/v1/offer/statistic")
    private OfferStatistic getStatistic(){
        return mainService.getStatistic();
    }

    @GetMapping("/api/v1/position")
    private List<Position> getAllPosition(){
        return mainService.getAllPosition();
    }
    @GetMapping("/api/v1/position/{id}")
    private Position getPositionById(@PathVariable("id") UUID id){
        return mainService.getPositionById(id);
    }
}
