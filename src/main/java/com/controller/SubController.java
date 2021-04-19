package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {
    /*
    Subservice rest api adress :
    * https://subservice-env.eba-v4guz2jb.us-east-2.elasticbeanstalk.com/
    * */


    @RequestMapping(value = "/{num1}/{num2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int sub(@PathVariable int num1,
                   @PathVariable int num2) {

        return num1 - num2;
    }
}
