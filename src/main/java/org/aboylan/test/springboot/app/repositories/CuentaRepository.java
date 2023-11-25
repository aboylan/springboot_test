package org.aboylan.test.springboot.app.repositories;

import org.aboylan.test.springboot.app.models.Cuenta;

public interface CuentaRepository {
    List<Cuenta> findAll();

    Cuenta findById(Long id);

    void update(Cuenta cuenta);
}
