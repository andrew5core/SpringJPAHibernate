package com.andy.spring.dao;
 
import java.util.List;
 
import com.andy.spring.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}