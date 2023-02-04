package org.examples.springboot.controller;

import org.examples.springboot.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/employee", method= RequestMethod.GET)
    public  Employee getEmployee(@RequestParam(value="name", defaultValue = "Employee") String name, @RequestParam String age, @RequestParam(defaultValue = "Developer") String destination) {
        return new Employee(78600, name, age, destination);
    }
}
