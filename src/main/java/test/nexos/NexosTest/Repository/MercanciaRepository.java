package test.nexos.NexosTest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.nexos.NexosTest.Model.Mercancia;

@Repository
public interface MercanciaRepository extends CrudRepository<Mercancia, Long>{

}
