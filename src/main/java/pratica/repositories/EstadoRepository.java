package pratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import pratica.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {
	
}