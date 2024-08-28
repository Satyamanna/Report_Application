package in.test.Runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import in.test.Repo.CitizenPlanRepo;
import in.test.entity.Citizenplan;

@Component
public class DataLoder implements ApplicationRunner {

    @Autowired
    private CitizenPlanRepo repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	repo.deleteAll();
        // CASE PLAN
        Citizenplan c1 = new Citizenplan();
        c1.setCitizenName("JOHAN");
        c1.setGender("Male");
        c1.setPlanName("Cash");  // Corrected typo
        c1.setPlanStatus("Approved");
        c1.setPlanStartDate(LocalDate.now());
        c1.setPlanEndDate(LocalDate.now().plusMonths(6));
        c1.setBenefitAmt(5000.00);

        Citizenplan c2 = new Citizenplan();
        c2.setCitizenName("Smith");
        c2.setGender("Male");
        c2.setPlanName("Cash");  // Corrected typo
        c2.setPlanStatus("Denied");
        c2.setPlanStartDate(LocalDate.now().minusMonths(4));
        c2.setPlanEndDate(LocalDate.now().plusMonths(6));
        c2.setDenialReason("Rental Income");

        Citizenplan c3 = new Citizenplan();
        c3.setCitizenName("Rani");
        c3.setGender("Fe_Male");
        c3.setPlanName("Cash");  // Corrected typo
        c3.setPlanStatus("Terminated");
        c3.setPlanStartDate(LocalDate.now().minusMonths(4));
        c3.setPlanEndDate(LocalDate.now().plusMonths(6));
        c3.setBenefitAmt(500.00);
        c3.setTerminateDate(LocalDate.now());
        c3.setTerminateReason("Employed");

        // FOOD PLAN DATA
        Citizenplan c4 = new Citizenplan();
        c4.setCitizenName("Rohan");
        c4.setGender("Male");
        c4.setPlanName("Food");  // Corrected typo
        c4.setPlanStatus("Approved");
        c4.setPlanStartDate(LocalDate.now());
        c4.setPlanEndDate(LocalDate.now().plusMonths(6));
        c4.setBenefitAmt(4000.00);

        Citizenplan c5 = new Citizenplan();
        c5.setCitizenName("Robert");
        c5.setGender("Male");
        c5.setPlanName("Food");  // Corrected typo
        c5.setPlanStatus("Denied");
        c5.setDenialReason("Property Income");

        Citizenplan c6 = new Citizenplan();
        c6.setCitizenName("David");
        c6.setGender("Male");
        c6.setPlanName("Food");  // Corrected typo
        c6.setPlanStatus("Terminated");
        c6.setPlanStartDate(LocalDate.now().minusMonths(4));
        c6.setPlanEndDate(LocalDate.now().plusMonths(6));
        c6.setBenefitAmt(500.00);
        c6.setTerminateDate(LocalDate.now());
        c6.setTerminateReason("Employed");

        // Medical Plan Data
        Citizenplan c7 = new Citizenplan();
        c7.setCitizenName("Raj");
        c7.setGender("Male");
        c7.setPlanName("Medical");  // Corrected typo
        c7.setPlanStatus("Approved");
        c7.setPlanStartDate(LocalDate.now());
        c7.setPlanEndDate(LocalDate.now().plusMonths(6));
        c7.setBenefitAmt(4000.00);

        Citizenplan c8 = new Citizenplan();
        c8.setCitizenName("Sanjay");
        c8.setGender("Male");
        c8.setPlanName("Medical");  // Corrected typo
        c8.setPlanStatus("Denied");
        c8.setDenialReason("Property Income");

        Citizenplan c9 = new Citizenplan();
        c9.setCitizenName("David");
        c9.setGender("Fe_Male");
        c9.setPlanName("Medical");  // Corrected typo
        c9.setPlanStatus("Terminated");
        c9.setPlanStartDate(LocalDate.now().minusMonths(4));
        c9.setPlanEndDate(LocalDate.now().plusMonths(6));
        c9.setBenefitAmt(500.00);
        c9.setTerminateDate(LocalDate.now());
        c9.setTerminateReason("Govt Employee");
        
        //EMPLOYEE PLAN
        Citizenplan c10= new Citizenplan();
        c10.setCitizenName("Rohan");
        c10.setGender("Male");
        c10.setPlanName("Employment");  // Corrected typo
        c10.setPlanStatus("Approved");
        c10.setPlanStartDate(LocalDate.now());
        c10.setPlanEndDate(LocalDate.now().plusMonths(6));
        c10.setBenefitAmt(4000.00);

        Citizenplan c11 = new Citizenplan();
        c11.setCitizenName("Moris");
        c11.setGender("Male");
        c11.setPlanName("Employment");  // Corrected typo
        c11.setPlanStatus("Denied");
        c11.setDenialReason("Property Income");

        Citizenplan c12 = new Citizenplan();
        c12.setCitizenName("johan");
        c12.setGender("Fe_Male");
        c12.setPlanName("Employment");  // Corrected typo
        c12.setPlanStatus("Terminated");
        c12.setPlanStartDate(LocalDate.now().minusMonths(4));
        c12.setPlanEndDate(LocalDate.now().plusMonths(6));
        c12.setBenefitAmt(500.00);
        c12.setTerminateDate(LocalDate.now());
        c12.setTerminateReason("Govt JOB");

        List<Citizenplan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9,c10,c11,c12);
        repo.saveAll(list);
    }
}
