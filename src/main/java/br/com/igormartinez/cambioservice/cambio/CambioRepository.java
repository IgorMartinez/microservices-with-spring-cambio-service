package br.com.igormartinez.cambioservice.cambio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CambioRepository extends JpaRepository<Cambio, Long> {
    
    Optional<Cambio> findByFromAndTo(String from, String to);
}
