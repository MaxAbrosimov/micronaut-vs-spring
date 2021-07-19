package com.restexample.test;

import com.restexample.test.entity.Employee;
import com.restexample.test.entity.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/webhook/")
public class ControllerClass {

        @Autowired
        private ServiceClass serviceClass;

        @PostMapping("create")
        public EmployeeResponse createEmployee(@RequestBody Employee employee) throws IOException {
                return serviceClass.createEmployee(employee);
        }
}

