package Lesson2.Task5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FileManager {
    public String downloadDataFrom(URL url) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest httpReq = HttpRequest.newBuilder(url.toURI()).GET().build();
        HttpResponse<InputStream> response = client
                .send(httpReq, responseInfo ->
                        HttpResponse.BodySubscribers.ofInputStream());
        return new String(response.body().readAllBytes());
    }

    public Notebook[] deserializeJsonFile(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Notebook[].class);
    }
}
