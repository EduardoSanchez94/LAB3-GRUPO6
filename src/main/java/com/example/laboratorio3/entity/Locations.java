package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationid;

    @Column(name = "street_address")
    private String streetaddress;

    @Column(name = "postal_code")
    private String postalcode;

    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "state_province")
    private String stateprovince;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private String country;
}
