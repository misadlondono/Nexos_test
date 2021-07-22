package test.nexos.NexosTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.nexos.NexosTest.Model.Cargo;
import test.nexos.NexosTest.Repository.CargoRepository;

@Service
public class CargoService {
	
	@Autowired 
	CargoRepository cargoRepository;
	
	public List<Cargo> findAll() {
		
		return (List<Cargo>) cargoRepository.findAll(); 
	}

}
