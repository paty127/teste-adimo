package com.Adimo.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocatarioRepositoty extends LocatarioRepository extends JpaRepository<Locatario, Integer>{
	

}
