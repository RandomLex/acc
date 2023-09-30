package com.barzykin.acc;

import com.barzykin.acc.endpoints.CalcEndpoint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AccApplicationTests {
    @Autowired
    private CalcEndpoint calcEndpoint;

    @Test
    void contextLoads() {
        assertNotNull(calcEndpoint);
    }

}
