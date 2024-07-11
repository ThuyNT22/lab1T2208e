package org.example.lab1_t2208e.mapper;

import org.example.lab1_t2208e.dto.CorporationDetailDTO;
import org.example.lab1_t2208e.entity.Corporation;

public class CorporationDetailMapper {
    public static CorporationDetailDTO toDTO(Corporation corporation, Long numberOfCompanies, Long numberOfDepartments, Long numberOfEmployees) {
        return new CorporationDetailDTO(
                corporation.getId(),
                corporation.getName(),
                numberOfCompanies,
                numberOfDepartments,
                numberOfEmployees
        );
    }
}
