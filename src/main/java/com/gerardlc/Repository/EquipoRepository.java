package com.gerardlc.Repository;

import com.gerardlc.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by gerard on 08/10/2015.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {

    List<Equipo> findByNombreContaining(String nombre);
}
