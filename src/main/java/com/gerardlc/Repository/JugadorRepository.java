package com.gerardlc.Repository;

 import com.gerardlc.Model.Jugador;
 import org.springframework.data.repository.PagingAndSortingRepository;

 import java.util.Date;
 import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{


 public List<Jugador> findByNombreContaining(String nombre);
 public List<Jugador> findByNumCanastasGreaterThanEqual(int numCanastas);
 public List<Jugador> findByNumAsistenciasBetween(int minAsistencias,int maxAsistencias);
 public List<Jugador> findByPosiCampoEquals(String posiCampo);
 public List<Jugador> findByFechaLessThan(Date fecha);
 public List<Jugador> findByNumCanastasGreaterThanEqualAndFechaLessThan(int numCanastas,Date fecha);




}
