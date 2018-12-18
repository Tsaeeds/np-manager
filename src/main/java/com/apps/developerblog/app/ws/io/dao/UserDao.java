/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.developerblog.app.ws.io.dao;

import com.apps.developerblog.app.ws.shared.dto.UserDTO;

/**
 * Interface for User DAO
 * @author Bilal Siddiqui
 */
public interface UserDao {
    
    /**
     * Return users by requested username
     * @param String userName
     * @return UserDTO 
     */
    UserDTO getUserByName(String userName); 
    
    /**
     * Return all user in database
     * @return 
     */
    UserDTO getAllUsers(); 
    
    /**
     * Create new user
     * @return
     */
    UserDTO createUser(); 
}
