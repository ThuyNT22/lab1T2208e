package org.example.lab1_t2208e.service.impl;

import org.example.lab1_t2208e.dto.CorporationDTO;
import org.example.lab1_t2208e.dto.CorporationDetailDTO;
import org.example.lab1_t2208e.entity.Corporation;
import org.example.lab1_t2208e.mapper.CorporationMapper;
import org.example.lab1_t2208e.repository.CorporationRepository;
import org.example.lab1_t2208e.service.CorporationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CorporationServiceImpl implements CorporationService {

    @Autowired
    private CorporationRepository corporationRepository;

    @Autowired
    private CorporationMapper corporationMapper;

    @Override
    public CorporationDTO createCorporation(CorporationDTO corporationDTO) {
        Corporation corporation = corporationMapper.toEntity(corporationDTO);
        corporation = corporationRepository.save(corporation);
        return corporationMapper.toDTO(corporation);
    }

    @Override
    public List<CorporationDTO> getAllCorporations() {
        return corporationRepository.findAll().stream()
                .map(corporationMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CorporationDetailDTO getCorporationDetail(Long corporationId) {
        Corporation corporation = corporationRepository.findById(corporationId)
                .orElseThrow(() -> new RuntimeException("Corporation not found"));
        // Example calculation for details, replace with actual logic
        Long numberOfCompanies = (long) corporation.getCompanies().size();
        Long numberOfDepartments = corporation.getCompanies().stream()
                .mapToLong(company -> company.getDepartments().size())
                .sum();
        Long numberOfEmployees = corporation.getCompanies().stream()
                .flatMap(company -> company.getDepartments().stream())
                .mapToLong(department -> department.getUsers().size())
                .sum();
        return new CorporationDetailDTO(corporationId, corporation.getName(), numberOfCompanies, numberOfDepartments, numberOfEmployees);
    }
}
