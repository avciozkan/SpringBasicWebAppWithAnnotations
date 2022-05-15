package com.avci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@ControllerAdvice
public class ControllerAdviceException {

    @ExceptionHandler(HttpStatusCodeException.class)
    @ResponseBody
    public String error() {
        return HttpStatus.BAD_GATEWAY.toString();
    }

    @ExceptionHandler(IOException.class)
    public ModelAndView handleIndexOutOfBoundsException(HttpServletRequest req, Exception exception) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", exception);
        modelAndView.setViewName("15.exception.handling.annotationBased.view/indexOutOfBoundsException");
        return modelAndView;
    }
}
