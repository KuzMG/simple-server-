package ru.Tibilov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Tibilov.modelTask1.Stuff;

import java.util.UUID;
@Repository
public interface StuffR extends CrudRepository<Stuff, UUID> {
}
