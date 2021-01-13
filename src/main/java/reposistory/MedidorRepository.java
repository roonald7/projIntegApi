package main.java.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.entity.Medidor;

public interface MedidorRepository extends JpaRepository<Medidor, Long>{
	Medidor findById(long id);
}
