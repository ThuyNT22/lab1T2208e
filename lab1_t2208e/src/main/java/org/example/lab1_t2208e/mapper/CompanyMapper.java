package org.example.lab1_t2208e.mapper;

import org.example.lab1_t2208e.dto.CompanyDTO;
import org.example.lab1_t2208e.entity.Company;
import org.example.lab1_t2208e.entity.Corporation;

public class CompanyMapper {
    public CompanyDTO toDTO(Company company) {
        return new CompanyDTO(company.getId(), company.getName(), company.getCorporation().getId());
    }

    public static Company toEntity(CompanyDTO companyDTO, Corporation corporation) {
        return new Company(companyDTO.getName(), corporation);
    }
}
