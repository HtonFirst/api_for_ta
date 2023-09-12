package com.alexkozlov.api_for_ta.api;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
@Data
@RequiredArgsConstructor
public class ResponseCharsMap {
    private final Map<Character, Long> resultLinkedHashMap;
}
