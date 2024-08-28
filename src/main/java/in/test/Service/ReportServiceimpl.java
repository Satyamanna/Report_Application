package in.test.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import in.test.Repo.CitizenPlanRepo;
import in.test.Request.SearchRequest;
import in.test.entity.Citizenplan;

@Service
public class ReportServiceimpl implements ReportService {
	
	@Autowired
	private CitizenPlanRepo planRepo;

	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return planRepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return planRepo.getPlanStatus();
	}

	@Override
	public List<Citizenplan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		Citizenplan entity=new Citizenplan();
		if(null!=request.getPlanName()&&!"".equals(request.getPlanName()))
		{
			entity.setPlanName(request.getPlanName());
		}
		if(null!=request.getPlaneStatus()&&!"".equals(request.getPlaneStatus()))
		{
			entity.setPlanStatus(request.getPlaneStatus());
		}
		if(null!=request.getGender()&&!"".equals(request.getGender()))
		{
			entity.setGender(request.getGender());
		}
		if(null!=request.getStartDate()&&!"".equals(request.getStartDate()))
		{
			String startDate=request.getStartDate();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localDate=LocalDate.parse(startDate,formatter);
			entity.setPlanStartDate(localDate);
		}
		if(null!=request.getEndDate()&&!"".equals(request.getEndDate()))
		{
			String EndDate=request.getEndDate();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localDate1=LocalDate.parse(EndDate,formatter);
			entity.setPlanEndDate(localDate1);
		}
		return planRepo.findAll(Example.of(entity));
		
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportpdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
