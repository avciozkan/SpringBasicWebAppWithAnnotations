package com.ozkan;

import com.avci.exception.ControllerAdviceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Service
public class DenemeController {
    @Autowired
    ControllerAdviceException controllerAdviceException;

    @RequestMapping(value = "/den/{val}", method = RequestMethod.GET)
    public String message(@PathVariable String val) throws Exception {
        if (val.equals("asd")) {
            throw new IOException("Message");
        }
        return "x";
        //return controllerAdviceException.error() + ", " + val;
    }
}
