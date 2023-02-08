package com.HotelManagementSystem.HotelManagementSystem.Repository;

import com.HotelManagementSystem.HotelManagementSystem.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    User findByuserName(String userName);

}
