package in.insplan002.service;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.DocumentException;

import in.insplan002.request.SearchRequest;
import in.insplan002.response.SearchResponse;

public interface ReportService {
	
	public List<String> getUniquePlanNames();
	
	public List<String> getUniquePlanStatuses();
	
	public List<SearchResponse> search(SearchRequest request);
	
	public void generateExcel(HttpServletResponse response) throws IOException;
	
	public void generatePdf(HttpServletResponse response) throws DocumentException, IOException;
	
}
