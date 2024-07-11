package org.example.lab1_t2208e.service;

import org.example.lab1_t2208e.dto.CorporationDTO;
import org.example.lab1_t2208e.dto.CorporationDetailDTO;
import java.util.List;

public interface CorporationService {
    CorporationDTO createCorporation(CorporationDTO corporationDTO);
    List<CorporationDTO> getAllCorporations();
    CorporationDetailDTO getCorporationDetail(Long corporationId);
}
