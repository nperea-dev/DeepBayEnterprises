package com.enterprise.AutosDB.services;

import com.enterprise.AutosDB.entities.Enterprise;
import com.enterprise.AutosDB.repositories.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    private EnterpriseRepository repository;

    public EnterpriseService(EnterpriseRepository repository){
        this.repository = repository;
    }

    public List<Enterprise> getEnterprises(){
        return this.repository.findAll();
    }

    public Enterprise getEnterprise(Long id){
        Optional<Enterprise> enterprise = this.repository.findById(id);
        return enterprise.orElse(null);
    }

    public Enterprise newEnterprise (Enterprise enterprise){
        return this.repository.save(enterprise);
    }

    public Enterprise updateEnterprise(Long id, Enterprise enterprise){
        Optional<Enterprise> dbData = this.repository.findById(id);

        if(dbData.isPresent()){
            Enterprise e = dbData.get();
            e.setName(enterprise.getName());
            e.setAddress(enterprise.getAddress());
            e.setDocument(enterprise.getDocument());
            this.repository.save(e);
            return e;
        }

        return null;
    }

    public Boolean deleteEnterprise(Long id){
        try{
            this.repository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
