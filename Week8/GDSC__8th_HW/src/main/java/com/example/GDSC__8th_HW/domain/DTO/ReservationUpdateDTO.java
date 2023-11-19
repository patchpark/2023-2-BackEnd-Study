package com.example.GDSC__8th_HW.domain.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReservationUpdateDTO {

    private Long id;
    private String time;

    @Builder
    public ReservationUpdateDTO(Long id, String time){
        this.id = id;
        this.time = time;
    }
}
