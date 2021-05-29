package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.repository.IUsuarioDAO;

@Service
public class IUsuarioServiceImp implements IUsuarioService{
	@Autowired
	IUsuarioDAO iUsuarioDAO;
	@Autowired

	@Override
	public void guardarUsu(Usuario usuario) {
		// TODO Auto-generated method stub
		iUsuarioDAO.save(usuario);
	}

	@Override
	public List<Usuario> listarUsu() {
		// TODO Auto-generated method stub
		return (List<Usuario>) iUsuarioDAO.findAll();
	}

	@Override
	public Usuario FindById(Long id) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.findById(id).orElse(null);
	}

	@Override
	public void eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		iUsuarioDAO.deleteById(id);
	}

	@Override
	public Usuario modUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		return iUsuarioDAO.save(usuario);
	}
	@Override
	public void crear(Usuario usuario) {
		iUsuarioDAO.save(usuario);
		
	}
	
	
}
