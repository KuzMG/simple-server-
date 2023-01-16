package ru.Kuznetsov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Kuznetsov.modelTask1.Office;

import java.util.UUID;

@Repository
public interface OfficeR extends CrudRepository<Office, UUID> {
}
