package test.nexos.NexosTest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import test.nexos.NexosTest.Model.Mercancia;
import test.nexos.NexosTest.Repository.MercanciaRepository;

@Service
public class MercanciaService {
	
	@Autowired
	MercanciaRepository mercanciaRepository;
	
	public List<Mercancia> findAll() {
		
		return (List<Mercancia>) mercanciaRepository.findAll();
	}
	
	public Mercancia save(Mercancia mercancia) {
		return mercanciaRepository.save(mercancia);
	}
	
	public void delete(Mercancia  mercancia) {
		mercanciaRepository.delete(mercancia);
	}
	
	public Optional<Mercancia> findbyid(Long id ){
		return mercanciaRepository.findById(id);		
	}

}
