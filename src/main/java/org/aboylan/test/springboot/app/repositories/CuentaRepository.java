package org.aboylan.test.springboot.app.repositories;

import org.aboylan.test.springboot.app.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
//    List<Cuenta> findAll();

//    Cuenta findById(Long id);

//    void update(Cuenta cuenta);
}
