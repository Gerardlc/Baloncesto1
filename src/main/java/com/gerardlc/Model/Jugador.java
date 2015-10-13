package com.gerardlc.Model;


import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.Date;


@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column
    protected String nombre;

    @Column
    protected Date fecha;

    @Column
    protected int numCanastas;

    @Column
    protected int numAsistencias;

    @Column
    protected int numRebotes;

    @Column
    protected String posiCampo;



    public Jugador(){}

    public Jugador( String nombre, Date fecha, int numCanastas, int numAsistencias, int numRebotes, String posiCampo) {

        this.nombre = nombre;
        this.fecha = fecha;
        this.numCanastas = numCanastas;
        this.numAsistencias = numAsistencias;
        this.numRebotes = numRebotes;
        this.posiCampo = posiCampo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", numCanastas=" + numCanastas +
                ", numAsistencias=" + numAsistencias +
                ", numRebotes=" + numRebotes +
                ", posiCampo='" + posiCampo + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(int numCanastas) {
        this.numCanastas = numCanastas;
    }

    public int getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(int numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public int getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(int numRebotes) {
        this.numRebotes = numRebotes;
    }

    public String getPosiCampo() {
        return posiCampo;
    }

    public void setPosiCampo(String posiCampo) {
        this.posiCampo = posiCampo;
    }

}
