package org.example.lab1_t2208e.controller;

import org.example.lab1_t2208e.dto.CorporationDTO;
import org.example.lab1_t2208e.dto.CorporationDetailDTO;
import org.example.lab1_t2208e.service.CorporationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corporations")
public class CorporationController {

    @Autowired
    private CorporationService corporationService;

    @PostMapping
    public ResponseEntity<CorporationDTO> createCorporation(@RequestBody CorporationDTO corporationDTO) {
        CorporationDTO newCorporation = corporationService.createCorporation(corporationDTO);
        return ResponseEntity.ok(newCorporation);
    }

    @GetMapping
    public ResponseEntity<List<CorporationDTO>> getAllCorporations() {
        List<CorporationDTO> corporations = corporationService.getAllCorporations();
        return ResponseEntity.ok(corporations);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<CorporationDetailDTO> getCorporationDetails(@PathVariable Long id) {
        CorporationDetailDTO corporationDetails = corporationService.getCorporationDetail(id);
        return ResponseEntity.ok(corporationDetails);
    }
}
