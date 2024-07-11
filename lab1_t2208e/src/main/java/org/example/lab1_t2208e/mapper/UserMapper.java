package org.example.lab1_t2208e.mapper;

import org.example.lab1_t2208e.dto.UserDTO;
import org.example.lab1_t2208e.entity.User;
import org.example.lab1_t2208e.entity.Department;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getFirstname(),
                user.getLastname(),
                user.getAddress(),
                user.getDepartment().getId()
        );
    }

    public static User toEntity(UserDTO userDTO, Department department) {
        return new User(
                userDTO.getUsername(),
                userDTO.getFirstname(),
                userDTO.getLastname(),
                userDTO.getAddress(),
                department
        );
    }
}
