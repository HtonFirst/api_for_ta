package com.alexkozlov.api_for_ta.controller;

import com.alexkozlov.api_for_ta.api.ResponseCharsMap;
import com.alexkozlov.api_for_ta.service.StringToMapService;
import com.alexkozlov.api_for_ta.service.StringToMapServiseImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Data
@RequiredArgsConstructor
@RestController
public class Controller {

    private final StringToMapService service = new StringToMapServiseImpl();



    @GetMapping("/{data}")
    public ResponseCharsMap stringToMap(@PathVariable String data) {

        return service.stringToMap(data);
    }


}
