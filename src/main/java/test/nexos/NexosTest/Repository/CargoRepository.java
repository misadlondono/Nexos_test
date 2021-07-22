package test.nexos.NexosTest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.nexos.NexosTest.Model.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long> {

}
