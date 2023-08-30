package in.insplan002.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.insplan002.request.SearchRequest;
import in.insplan002.response.SearchResponse;
import in.insplan002.service.ReportService;

@RestController
public class ReportsController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/plan")
	public ResponseEntity<List<String>> getPlanName(){
		List<String> planNames = reportService.getUniquePlanNames();
		return new ResponseEntity<List<String>> (planNames,HttpStatus.OK);
	}
	
	@GetMapping("/status")
	public ResponseEntity<List<String>> getPlanStatus(){
		List<String> planStatuses = reportService.getUniquePlanStatuses();
		return new ResponseEntity<List<String>> (planStatuses,HttpStatus.OK);
	}
	
	@PostMapping("/search")
	public ResponseEntity<List<SearchResponse>> search(@RequestBody SearchRequest request){
		List<SearchResponse> search = reportService.search(request);
		return new ResponseEntity<List<SearchResponse>> (search, HttpStatus.OK);
	}
	
	@GetMapping("/excel")
	public void generateExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename = data.xls";
		response.setHeader(headerKey, headerValue);
		
		reportService.generateExcel(response);
	}
	
	@GetMapping("/pdf")
	public void generatePdf(HttpServletResponse response) throws IOException {
		response.setContentType("application/pdf");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename = data.pdf";
		response.setHeader(headerKey, headerValue);
		
		reportService.generatePdf(response);
	}
}
