package org.example.lab1_t2208e.service;

import org.example.lab1_t2208e.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long userId);

    UserDTO updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);
}
