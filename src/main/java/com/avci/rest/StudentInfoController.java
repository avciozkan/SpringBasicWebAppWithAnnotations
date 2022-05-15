package com.avci.rest;

import com.avci.exception.ControllerAdviceException;
import com.avci.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class StudentInfoController {
    @Value("${asd.fes}")
    String asd;

    @Autowired
    ControllerAdviceException controllerAdviceException;

    @Autowired
    JSONUtil jsonUtil;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        StringBuilder stringBuilder = new StringBuilder("{ 'Name': 'Özkan'");
        stringBuilder.append(", 'Surname': 'AVCI' }");
        logger.info(Level.INFO + ", this message will be write");

        return jsonUtil.convertStringToJSONObject(stringBuilder.toString()) + asd;
    }

    @GetMapping(value = "/ex")
    public String exceptionHandling() {
        String x = "asd";
        if (x != "e") {
            logger.log(Level.SEVERE, controllerAdviceException.error());
        }
        return x;
    }
}
