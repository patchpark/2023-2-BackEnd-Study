package com.example.GDSC__4th_HW;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class D {
    private C c;

    public C getC() {
        return c;
    }
}
