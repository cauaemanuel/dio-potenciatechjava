package diobootcamp.com.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import diobootcamp.com.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {
	
}


