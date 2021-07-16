package com.restexample.test.client;

import com.google.gson.Gson;
import com.restexample.test.entity.Employee;
import com.restexample.test.entity.EmployeeResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class DummyClient {

/*
    public DummyClient(@Client("") RxHttpClient httpClient) {
        this.httpClient = httpClient;
    }*/

private Gson gson = new Gson();

    public EmployeeResponse createEmployee(Employee employee) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://dummy.restapiexample.com/api/v1/create");

        String json = gson.toJson(employee);
        StringEntity entity = new StringEntity(json);
        httpPost.setEntity(entity);

        CloseableHttpResponse response = client.execute(httpPost);
        return gson.fromJson(EntityUtils.toString(response.getEntity()), EmployeeResponse.class);
    }


    }

