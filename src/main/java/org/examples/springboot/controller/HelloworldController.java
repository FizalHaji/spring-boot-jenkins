package org.examples.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloworldController {

    @GetMapping
    @RequestMapping(produces = "text/html")
    public String displayMessage() {
      String line1 =  "<b>Assalamu Alaikum Warahmathulaahi Wabarakatuhu</b>. This is a sample Http Response, Welcome to our Website ! \n";
      String line2 =  "<div style='color:green'>I Love Mohammed (Nabi) Sallalahu Alahi Salam</div>";
      return line1+line2;
    }
}
