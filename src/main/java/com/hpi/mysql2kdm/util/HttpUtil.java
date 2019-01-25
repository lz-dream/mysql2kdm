package com.hpi.mysql2kdm.util;

import com.google.gson.Gson;
import com.hpi.mysql2kdm.entity.BasicResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class HttpUtil {

    public static int doPost(String url,String requestJson){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("RTDataSets",requestJson);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String> > entity = new HttpEntity<>(map,headers);
        String result = restTemplate.postForObject(url, entity, String.class);
        Gson gson = new Gson();
        BasicResponses basicResponses = gson.fromJson(result, BasicResponses.class);
        return basicResponses.getBasicResponse().getSucceeded();
    }

}
