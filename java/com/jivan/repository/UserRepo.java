package com.jivan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jivan.pojo.Users;
@Repository
public interface UserRepo extends JpaRepository<Users, Integer> 
{

Users findByUserName(String nameName);

}
