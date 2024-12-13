package ru.Tibilov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Tibilov.modelTask1.Client;

import java.util.UUID;

@Repository
public interface ClientR extends CrudRepository<Client, UUID> {
}
