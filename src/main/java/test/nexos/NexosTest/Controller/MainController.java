package test.nexos.NexosTest.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import test.nexos.NexosTest.Model.Cargo;
import test.nexos.NexosTest.Model.Mercancia;
import test.nexos.NexosTest.Model.Usuario;
import test.nexos.NexosTest.Service.CargoService;
import test.nexos.NexosTest.Service.MercanciaService;
import test.nexos.NexosTest.Service.UsuarioService;

@RestController
@CrossOrigin(value = "*", maxAge = 3600 )
public class MainController {
	
	@Autowired 
	CargoService cargoService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	MercanciaService mercanciaService;

	@GetMapping("/test")
	ResponseEntity<?> test() {
		
		Map<String, Object> response = new HashMap<>();

		// Listado de cargos
		List<Cargo> cargos = cargoService.findAll();
		response.put("cargos", cargos);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	
	 // Listado de usuarios	
	@GetMapping("/get-usuarios")
	ResponseEntity<?> getusuarios(){
		
		Map<String ,Object> response = new HashMap<>();
		
		List<Usuario> usuarios = usuarioService.findAll();
		response.put("usuarios", usuarios);
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	};

	
	
	// Listado de mercancias
	@GetMapping("/get-mercancias")
	ResponseEntity<?> getmercancias(){
		
		Map<String, Object> response = new HashMap<>();
		  
		List<Mercancia> mercancias = mercanciaService.findAll();
		response.put("mercancias", mercancias);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@PostMapping("/get-mercancias/{id}")
		 public String getPathVariable(@PathVariable("id") Mercancia newmercancia)
		 {
			return null;
		       //TODO implementation should goes here
		 }
	

	
	
	
	@DeleteMapping("/mercancias/delete/{id}")
	ResponseEntity<?> deleteMercancia(@PathVariable("id") Long id){
		
		Map<String, Object> response = new HashMap<>(); 
		
		try {
			
			Optional<Mercancia> mercancia = mercanciaService.findbyid(id);
			
			if(!mercancia.isPresent()) {
				response.put("message", "No se encontro la mercancia que desea borrar con el id "+ id);
				response.put("status", HttpStatus.NOT_FOUND);
				return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
			}
			
			mercanciaService.delete(mercancia.get());
			response.put("message", "Se ha eliminado el registro con id "+id);
			response.put("status", HttpStatus.OK);
			return new ResponseEntity<>(response, HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			response.put("message", "Se ha presentado un error al eliminar la mercancia");
		    response.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
		    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
	}
		
	
	
	
	
	
	
	
	
	
	
}
