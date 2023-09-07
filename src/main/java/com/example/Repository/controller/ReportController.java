package com.example.Repository.controller;

import com.example.Repository.Mapper.EmployeeMapper;
import com.example.Repository.service.EmployeeService;
import com.example.Repository.service.ReportService;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;

@RestController
//@RequestMapping("/report")

public class ReportController {


    @Autowired
    private ReportService reportService;
    @GetMapping("/report")
    //@Operation(summary = "generate Word Report for all voter")
    @ResponseBody
    public void getPartyVoterReport(HttpServletResponse response) {
        reportService.getPdfReport(response);
    }

//    @GetMapping("/report/{format}")
//    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
//        return reportService.generatePdfReport();
//
//    }
}
