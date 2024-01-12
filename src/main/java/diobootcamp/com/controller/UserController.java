package diobootcamp.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import diobootcamp.com.entity.Usuario;
import diobootcamp.com.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	private List<Usuario> getUser(){
		return repository.findAll();
	}

	@PostMapping
    public void save(@RequestBody Usuario user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody Usuario user){
        repository.save(user);
    }
    
    @GetMapping("/{id}")
    public Usuario getId(@PathVariable("/id") Integer id) {
    	return repository.findById(id).get();
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
}
