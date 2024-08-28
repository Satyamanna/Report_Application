package in.test.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CITIZEN_PLAN_INFO")
@SequenceGenerator(name = "citizen_seq", sequenceName = "citizen_seq", allocationSize = 1)
public class Citizenplan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citizen_seq")
    private Integer citizenId;
    private String citizenName;
    private String gender;
    private String planName;
    private String planStatus; 
    private LocalDate planStartDate;  
    private LocalDate planEndDate;  
    private Double benefitAmt;
    private String denialReason;
    private LocalDate terminateDate;
    private String terminateReason;
    
    
}
