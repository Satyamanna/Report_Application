package in.test.Request;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String PlanName;
	private String PlaneStatus;
	private String gender;
	
	private String startDate;
	private String endDate;
	

}
