package ru.Kuznetsov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Kuznetsov.modelTask1.Position;

import java.util.UUID;

@Repository
public interface PositionR extends CrudRepository<Position, UUID> {
}
