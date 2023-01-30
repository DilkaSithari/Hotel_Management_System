package com.HotelManagementSystem.HotelManagementSystem.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name="hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Hotel Code")
    private Long hotelCode;
    @Column(name="Hotel Name")
    private String hotelName;
    @Column(name="Address")
    private String address;
    @Column(name="Postal Code")
    private String postCode;
    @Column(name = "City")
    private String city;
    @Column(name="Country")
    private String country;

    public Hotel() {
    }

    public Hotel(String hotelName, String address, String postCode, String city, String country) {
        super();
        this.hotelName = hotelName;
        this.address = address;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
    }

    public Long getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(Long hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
