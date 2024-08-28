package in.test.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.test.entity.Citizenplan;

public interface CitizenPlanRepo extends JpaRepository<Citizenplan,Integer>{

	@Query("select distinct(planName) from  Citizenplan")
	List <String> getPlanName();
	
	@Query("select distinct(planStatus) from  Citizenplan")
	List <String> getPlanStatus();
}
