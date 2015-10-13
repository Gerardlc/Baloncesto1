package com.gerardlc.Service;

import com.gerardlc.Model.Jugador;
import com.gerardlc.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 6/10/15.
 */


@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;


    public void testJugador(){

        //JUGADOR1
        Calendar calendario= new GregorianCalendar(1984,2,29);
        Jugador jugador1=new Jugador("Pipi",calendario.getTime(),4,3,6,"pivot");
        jugadorRepository.save(jugador1);


        //JUGADOR2

        calendario= new GregorianCalendar(1995,5,9);
        Jugador jugador2=new Jugador("Pupins",calendario.getTime(),4,3,6,"base");
        jugadorRepository.save(jugador2);

        //JUGADOR3
        calendario= new GregorianCalendar(1994,9,2);
        Jugador jugador3=new Jugador("Sergio",calendario.getTime(),4,3,6,"pivot");
        jugadorRepository.save(jugador3);


        //JUGADOR4

        calendario= new GregorianCalendar(1988,6,21);
        Jugador jugador4=new Jugador("Chacho",calendario.getTime(),40,3,6,"base");
        jugadorRepository.save(jugador4);

        //JUGADOR5

        calendario= new GregorianCalendar(1992,1,19);
        Jugador jugador5=new Jugador("Alboroto",calendario.getTime(),4,3,6,"alero");
        jugadorRepository.save(jugador5);


        //selects
        calendario= new GregorianCalendar(1990,2,9);
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(0, 80));
        System.out.println(jugadorRepository.findByNombreContaining("arc"));
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(1));
        System.out.println(jugadorRepository.findByPosiCampoEquals("base"));
        System.out.println(jugadorRepository.findByFechaBefore(calendario.getTime()));
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqualAndFechaBefore(5, calendario.getTime()));


    }



}
