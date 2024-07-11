package org.example.lab1_t2208e.service;

import org.example.lab1_t2208e.dto.CompanyDTO;
import java.util.List;

public interface CompanyService {
    CompanyDTO createCompany(CompanyDTO companyDTO);
    List<CompanyDTO> getAllCompanies();
    CompanyDTO getCompanyById(Long companyId);

    CompanyDTO updateCompany(Long id, CompanyDTO companyDTO);

    void deleteCompany(Long id);
}
