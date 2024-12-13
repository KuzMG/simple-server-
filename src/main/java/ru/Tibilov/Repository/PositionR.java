package ru.Tibilov.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Tibilov.modelTask1.Position;

import java.util.UUID;

@Repository
public interface PositionR extends CrudRepository<Position, UUID> {
}
