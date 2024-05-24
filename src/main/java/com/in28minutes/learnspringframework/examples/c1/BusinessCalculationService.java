package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retreiveData()).max().orElse(0);
    }
}