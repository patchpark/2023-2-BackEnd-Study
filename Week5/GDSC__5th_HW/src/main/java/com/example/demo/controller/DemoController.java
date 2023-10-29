package com.example.demo.controller;

import com.example.demo.Mapper.DemoEntity;
import com.example.demo.domain.DemoDTO;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/demoEntities")
    public ResponseEntity<List<DemoDTO>> getDemoEntities() {
        return ResponseEntity.ok().body(demoService.getDemoEntities());
    }

    @PostMapping("/demoEntities")
    public void addDemoEntities(@RequestBody DemoDTO demoDto) {
        demoService.addDemoEntity(demoDto);
    }

    @GetMapping("/demoEntitySearch")
    public DemoEntity searchDemoEntity(@RequestBody Long id){
        return demoService.findDemoEntity(id);
    }
}