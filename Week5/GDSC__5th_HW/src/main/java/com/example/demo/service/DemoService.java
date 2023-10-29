package com.example.demo.service;

import com.example.demo.Mapper.DemoEntity;
import com.example.demo.domain.DemoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {
    private final List<DemoEntity> demoEntities = new ArrayList<>(Arrays.asList(
            new DemoEntity(1L, "1번"),
            new DemoEntity(2L, "2번"),
            new DemoEntity(3L, "3번")
    ));

    public List<DemoDTO> getDemoEntities() {
        List<DemoDTO> demoDtos = new ArrayList<>();
        for (DemoEntity demoEntity : demoEntities) {
            demoDtos.add(new DemoDTO(demoEntity.getId(), demoEntity.getName()));
        }
        return demoDtos;
    }

    public void addDemoEntity(DemoDTO demoDto) {
        demoEntities.add(new DemoEntity(demoDto.getId(), demoDto.getName()));
    }

    public DemoEntity findDemoEntity(Long id){
        for(int i=0; i<demoEntities.size(); i++){
            if(demoEntities.get(i).getId() == id){
                DemoEntity de = demoEntities.get(i);
                return de;
            }
        }
        return null;
    }
}
