package com.example.Repository.util;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
@Component
public class ReportUtil {

    @Autowired
    private DataSource dataSource;

    public void generatePdfReport(HttpServletResponse response, Map<String, Object> parameters) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            File jasper = new File(new File("EnglishEmployees" + ".jasper").getAbsolutePath());
            if (!jasper.exists()) {
                ClassPathResource classPathResource = new ClassPathResource("jasperReports/" + "EnglishEmployees" + ".jrxml");
                JasperReport jasperReport = JasperCompileManager.compileReport(classPathResource.getPath());
                JRSaver.saveObject(jasperReport, "EnglishEmployees" + ".jasper");
            }
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getAbsolutePath(),parameters, connection);
            JRDocxExporter exporter = new JRDocxExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(response.getOutputStream()));
            response.setHeader("Content-Disposition", "attachment;filename=" + "EnglishEmployees" + ".pdf");
            response.setContentType("application/octet-stream");
            exporter.exportReport();
            connection.close();
        } catch (IOException ioException){
            System.out.println("Report Exception");
        }catch (JRException jrException){
            System.out.println("Report Exception"+ jrException);
        }catch (Exception e) {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException ex) {
                System.out.println("Report Exception"+ ex);
            }
            System.out.println("Report Exception"+ e);
        }
    }
}
