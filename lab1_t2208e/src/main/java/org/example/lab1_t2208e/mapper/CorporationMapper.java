package org.example.lab1_t2208e.mapper;

import org.example.lab1_t2208e.dto.CorporationDTO;
import org.example.lab1_t2208e.entity.Corporation;

public class CorporationMapper {
    public CorporationDTO toDTO(Corporation corporation) {
        return new CorporationDTO(corporation.getId(), corporation.getName());
    }

    public static Corporation toEntity(CorporationDTO corporationDTO) {
        return new Corporation(corporationDTO.getName());
    }
}
