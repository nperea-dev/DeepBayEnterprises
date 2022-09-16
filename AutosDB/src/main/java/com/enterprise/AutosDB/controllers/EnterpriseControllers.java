package com.enterprise.AutosDB.controllers;

import com.enterprise.AutosDB.entities.Enterprise;
import com.enterprise.AutosDB.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class EnterpriseControllers {

    private EnterpriseService service;

    public EnterpriseControllers(EnterpriseService service){
        this.service = service;
    }

    @GetMapping("/enterprises")
    public List<Enterprise> getEnterprises(){
        return this.service.getEnterprises();
    }

    @GetMapping("/enterprise/{id}")
    public Enterprise getEnterprise(@PathVariable("id") Long id){
        return this.service.getEnterprise(id);
    }

    @PostMapping(value="/enterprise/new")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return this.service.createEnterprise(enterprise);
    }

    @PutMapping("/enterprise/{id}")
    public Enterprise updateEnterprise(@PathVariable("id") Long id, @RequestBody Enterprise enterprise){
        return this.service.updateEnterprise(id, enterprise);
    }

    @DeleteMapping("/enterprise/{id}")
    public Boolean deleteEnterprise(@PathVariable("id") Long id){
        return this.service.deleteEnterprise(id);
    }
}
