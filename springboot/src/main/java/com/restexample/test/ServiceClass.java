package com.restexample.test;

import com.restexample.test.client.DummyClient;
import com.restexample.test.entity.Employee;
import com.restexample.test.entity.EmployeeResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ServiceClass {

    private DummyClient dummyClient;

    public ServiceClass(DummyClient dummyClient) {
        this.dummyClient = dummyClient;
    }

    public EmployeeResponse createEmployee(Employee employee) throws IOException {
        return dummyClient.createEmployee(employee);
    }

}
