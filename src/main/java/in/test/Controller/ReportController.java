package in.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.test.Request.SearchRequest;
import in.test.Service.ReportService;
import in.test.entity.Citizenplan;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService  service;
	@PostMapping("/search")
	public String handelSearch(@ModelAttribute("search") SearchRequest request,Model model)
	{
		System.out.println(request);
		List<Citizenplan> plans=service.search(request);
		model.addAttribute("plans",plans);
		inti(model);
		return "index";
	}
	
	
	@GetMapping("/")
   public String indexPage(Model model)
   {
		SearchRequest searchObj=new SearchRequest();
		
		model.addAttribute("search",searchObj);
		inti(model);
	   return "index";
   }

	

	private void inti(Model model) {
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatus());
	}
	
}
