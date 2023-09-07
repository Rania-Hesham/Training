package com.example.Repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepositoryApplication {


//	@Autowired
//
//	private EmployeeRepo employeeRepo;
//	@Autowired
//	private ReportService service;
//
//	@GetMapping("/getEmployees")
//			public List<Employee> getEmployees() {
//
//			return employeeRepo.findAll();
//			}
//
//			@GetMapping("/report/{format}")
//			public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
//		    return service.exportReport(format);
//	}


	public static void main(String[] args) {
		SpringApplication.run(RepositoryApplication.class, args);
//		JasperReport jasperReport = JasperCompileManager.compileReport("path/to/your/reportTemplate.jrxml");
//		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(yourDataCollection));
//
//		JasperExportManager.exportReportToPdfFile(jasperPrint, "path/to/output/report.pdf");

	}

}
