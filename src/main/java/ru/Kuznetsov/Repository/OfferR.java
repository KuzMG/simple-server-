package ru.Kuznetsov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Kuznetsov.modelTask1.Offer;

import java.util.UUID;

@Repository
public interface OfferR extends CrudRepository<Offer, UUID> {
}
