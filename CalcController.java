package edu.ecu.cs.seng6285.restfulbots;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private static String logClass = "CalcController";
    private Logger logger = LoggerFactory.getLogger(logClass);

    @GetMapping("/add")
    public int add(int n, int m) {
        int result = n + m;
        return result;
    }

    @GetMapping("/subtract")
    public int subtract(int n, int m) {
        int result = n - m;
        return result;
    }

    @GetMapping("/times")
    public int times(int n, int m) {
        int result = n * m;
        return result;
    }

    @GetMapping("/div")
    public int div(int n, int m) {
        if (m == 0) {
            logger.error("Division by zero!");
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = n / m;
        return result;
    }

    @GetMapping("/neg")
    public int neg(int n) {
        int result = n * -1;
        return result;
    }
}
