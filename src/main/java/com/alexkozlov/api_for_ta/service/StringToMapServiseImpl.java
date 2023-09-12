package com.alexkozlov.api_for_ta.service;

import com.alexkozlov.api_for_ta.api.ResponseCharsMap;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StringToMapServiseImpl implements StringToMapService {

    @Override
    public ResponseCharsMap stringToMap(String data) {

        Map<Character, Long> resultMap = new ConcurrentHashMap<>();
        for (char ch : data.toCharArray()) {
        long c =  data.chars()
                .filter(element -> element==ch)
                .count();
        resultMap.put(ch, c);
        }
        ResponseCharsMap responseCharsMap = new ResponseCharsMap(resultMap);
        return responseCharsMap;

    }
}
