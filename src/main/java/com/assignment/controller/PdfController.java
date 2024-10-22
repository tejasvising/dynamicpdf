package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.io.source.ByteArrayOutputStream;
import com.assignment.model.PdfGen;
import com.assignment.services.PdfGenService;


@RestController
public class PdfController {

    @Autowired
    PdfGenService pdfGeneratorService;

    @PostMapping("/pdf")
    public ResponseEntity<byte[]> generatePdf(@RequestBody PdfGen invoice) throws Exception {
    	
        if (invoice == null || invoice.getItems() == null)
            throw new Exception("Required request body is missing");
        
        ByteArrayOutputStream outputStream = pdfGeneratorService.generateByteArray(invoice);
        
        HttpHeaders headers = new HttpHeaders();
        
        headers.setContentType(MediaType.APPLICATION_PDF);
        
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename("invoice.pdf").build());
        
        return new ResponseEntity<>(outputStream.toByteArray(), headers, HttpStatus.OK);
    }

}

