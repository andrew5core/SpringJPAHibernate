package com.andy.spring.service;
 
import java.util.List;
 
import com.andy.spring.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}