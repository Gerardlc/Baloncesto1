package com.gerardlc.Service;

import com.gerardlc.Model.Equipo;
import com.gerardlc.Model.Jugador;
import com.gerardlc.Repository.EquipoRepository;
import com.gerardlc.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by jhipster on 6/10/15.
 */


@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador(){

        //Calendar calendario= GregorianCalendar.getInstance();


        Calendar calendario= new GregorianCalendar(1984,2,29);
        Jugador jugador1=new Jugador("pipi",calendario.getTime(),4,3,6,"pivot");

        List<Equipo> equipos = equipoRepository.findByNombreContaining("Valencia");

        Equipo equipo = equipos.get(0);

        jugador1.setEquipo(equipo);
        jugadorRepository.save(jugador1);


        //JUGADOR2

        calendario= new GregorianCalendar(1985,5,9);
        Jugador jugador2=new Jugador("pupins",calendario.getTime(),4,3,6,"base");

        equipos = equipoRepository.findByNombreContaining("Valencia");
        equipo = equipos.get(0);

        jugador2.setEquipo(equipo);
        jugadorRepository.save(jugador2);




        calendario= new GregorianCalendar(1980,2,9);
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(0, 80));
        System.out.println(jugadorRepository.findByNombreContaining("arc"));
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(1));
        System.out.println(jugadorRepository.findByPosiCampoEquals("base"));
        System.out.println(jugadorRepository.findByFechaLessThan(calendario.getTime()));
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqualAndFechaLessThan(5, calendario.getTime()));


    }



}
