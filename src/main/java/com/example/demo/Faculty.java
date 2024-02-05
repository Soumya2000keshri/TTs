package com.example.demo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Details")
@SuppressWarnings("unused")
public class Faculty {

    @Id
    private String id;
    private String username;
    private String password;
    private String EmployeeFullName;
    private String EmployeeCode;
    private String ReportingManager;
    private String Designation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeFullName() {
        return EmployeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        EmployeeFullName = employeeFullName;
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getReportingManager() {
        return ReportingManager;
    }

    public void setReportingManager(String reportingManager) {
        ReportingManager = reportingManager;
    }

    // Constructors, getters, and setters


    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public Faculty(String id, String EmployeeCode, String EmployeeFullName, String ReportingManager, String Designation, String password, String username) {
        this.id = id;
        this.EmployeeCode = EmployeeCode;
        this.EmployeeFullName =EmployeeFullName;
        this.ReportingManager = ReportingManager;
        this.Designation = Designation;
        this.password = password;
        this.username = username;
    }

}