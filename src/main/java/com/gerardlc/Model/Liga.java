package com.gerardlc.Model;

import javax.persistence.*;

/**
 * Created by gerard on 08/10/2015.
 */

@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;



}
