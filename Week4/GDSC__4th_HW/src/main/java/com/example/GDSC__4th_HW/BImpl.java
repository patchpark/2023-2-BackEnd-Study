package com.example.GDSC__4th_HW;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BImpl implements B {

    @Override
    public void funcB() {
        log.info("function B");
    }
}