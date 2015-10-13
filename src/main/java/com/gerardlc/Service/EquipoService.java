package com.gerardlc.Service;

import com.gerardlc.Model.Equipo;
import com.gerardlc.Repository.EquipoRepository;
import com.gerardlc.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by gerard on 08/10/2015.
 */


@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipos(){
        Equipo equip= new Equipo();
        equip.setNombre("Valencia");
        equip.setLocalidad("Valencia");

        Calendar calendario= new GregorianCalendar(1984,2,29);
        equip.setFechaCreacion(calendario.getTime());
        equipoRepository.save(equip);




    }








}
