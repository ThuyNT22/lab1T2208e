package org.example.lab1_t2208e.dto;

public class CorporationDetailDTO {
    private Long id;
    private String name;
    private Long numberOfCompanies;
    private Long numberOfDepartments;
    private Long numberOfEmployees;

    public CorporationDetailDTO() {}

    public CorporationDetailDTO(Long id, String name, Long numberOfCompanies, Long numberOfDepartments, Long numberOfEmployees) {
        this.id = id;
        this.name = name;
        this.numberOfCompanies = numberOfCompanies;
        this.numberOfDepartments = numberOfDepartments;
        this.numberOfEmployees = numberOfEmployees;
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

    public Long getNumberOfCompanies() {
        return numberOfCompanies;
    }

    public void setNumberOfCompanies(Long numberOfCompanies) {
        this.numberOfCompanies = numberOfCompanies;
    }

    public Long getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(Long numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public Long getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Long numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
