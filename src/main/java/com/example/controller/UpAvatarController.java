package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping(value="/user")
public class UpAvatarController {
    @RequestMapping(value="/upA")
    public String upAvatar(@RequestPart(value="file")MultipartFile file) throws IOException {
//        BASE64Encoder encoder=new BASE64Encoder();
//        String imgData=encoder.encode(file.getBytes());
//        String
//        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\18209\\IdeaProjects\\springboot\\ZH3\\src\\main\\resources\\static\\"+file.getOriginalFilename());
//        outputStream.write(file.getBytes());
//        outputStream.close();
        System.out.println("进入了");
        String s=Base64.getEncoder().encodeToString(file.getBytes());
        System.out.println(s);
        return s;
    }
}
