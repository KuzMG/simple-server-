package ru.Kuznetsov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Kuznetsov.modelTask1.Stuff;

import java.util.UUID;
@Repository
public interface StuffR extends CrudRepository<Stuff, UUID> {
}
