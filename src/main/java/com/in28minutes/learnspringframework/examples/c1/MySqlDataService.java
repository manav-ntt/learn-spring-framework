package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySqlDataService implements DataService {
    public int[] retreiveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
