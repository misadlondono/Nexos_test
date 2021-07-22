package test.nexos.NexosTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.nexos.NexosTest.Model.Usuario;
import test.nexos.NexosTest.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> findAll(){
		
		
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
}
