package in.test.Service;

import java.util.List;

import in.test.Request.SearchRequest;
import in.test.entity.Citizenplan;

public interface ReportService {

	public List<String> getPlanNames();
	public List<String> getPlanStatus();
	public List<Citizenplan> search(SearchRequest request);
	public boolean exportExcel();
	public boolean exportpdf();
	
	
}
