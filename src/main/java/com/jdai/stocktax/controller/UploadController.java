package com.jdai.stocktax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadController {


    @RequestMapping(value = "/api/uploadfile")
    public String uploadfile() {
        System.out.println(" hit server side........");

        return "uploadfile";
    }
}
