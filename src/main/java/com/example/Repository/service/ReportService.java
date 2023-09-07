package com.example.Repository.service;

import com.example.Repository.entity.Employee;
import com.example.Repository.repository.EmployeeRepo;
import com.example.Repository.util.ReportUtil;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ReportService {

//    String path="F:\\Informatique\\JasperReportsTask";
//    @Autowired
//    private EmployeeRepo employeeRepo;
//
//
//    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
//      List<Employee> employees =employeeRepo.findAll();
//
//        File file= ResourceUtils.getFile("classpath:EnglishEmployees.jrxml");
//		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//        JRBeanCollectionDataSource dataSource=new JRBeanCollectionDataSource(employees);
//        Map<String,Object> parameters= new HashMap<>();
//        parameters.put("createdBy","Java Techie");
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,dataSource);
//        if (reportFormat.equalsIgnoreCase("html")){
//            JasperExportManager.exportReportToHtmlFile(jasperPrint,path+"\\employees.html");
//        }
//        if (reportFormat.equalsIgnoreCase("pdf")){
//            JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\employees.pdf");
//        }
//           return "file generated in path "+ path;
//    }
    @Autowired
    private ReportUtil reportUtil;
    public void getPdfReport(HttpServletResponse response) {
        Map<String, Object> params = new HashMap<>();
        reportUtil.generatePdfReport(response, null);
    }



}
