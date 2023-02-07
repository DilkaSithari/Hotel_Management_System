package com.HotelManagementSystem.HotelManagementSystem;



import com.HotelManagementSystem.HotelManagementSystem.Entity.Hotel;
import com.HotelManagementSystem.HotelManagementSystem.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSystemApplication.class, args);
		System.out.println("**********Start*********");
	}
@Autowired
private HotelRepository hotelRepository;
	@Override
	public void run(String... args) throws Exception {
//		Hotel hotel1 = new Hotel("abc","ddedf","1546w","SriL","sdwef");
//		hotelRepository.save(hotel1);
//
//		Hotel hotel2 = new Hotel("xyz","xysb b","eafaef","fsfse","India");
//		hotelRepository.save(hotel2);
//
//		Hotel hotel3 = new Hotel("tdufy","xysb b","eafaef","fsfse","India");
//		hotelRepository.save(hotel3);




	}
}
