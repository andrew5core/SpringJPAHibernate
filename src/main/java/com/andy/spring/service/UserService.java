package com.andy.spring.service;
 
import java.util.List;
 
import com.andy.spring.model.User;
 
 
public interface UserService {
     
    User findById(int id);
     
    User findBySSO(String sso);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserBySSO(String sso);
 
    List<User> findAllUsers(); 
     
    boolean isUserSSOUnique(Integer id, String sso);
 
}