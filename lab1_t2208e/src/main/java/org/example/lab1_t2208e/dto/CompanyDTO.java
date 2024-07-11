package org.example.lab1_t2208e.dto;

public class CompanyDTO {
    private Long id;
    private String name;
    private Long corporationId;

    public CompanyDTO() {}

    public CompanyDTO(Long id, String name, Long corporationId) {
        this.id = id;
        this.name = name;
        this.corporationId = corporationId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }
}
