package com.example.dashboard.dashboard_demo.Controller.Rest;

import com.example.dashboard.dashboard_demo.Modal.Rest.FarmerPopulationModal;
import com.example.dashboard.dashboard_demo.Repositories.Rest.FarmerPopulationRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer_population_api")
public class FarmerPopulationController {

    @Autowired
    FarmerPopulationRepository farmerPopulationRepository;

    @GetMapping("/all")
    @CrossOrigin
    public List<FarmerPopulationModal>getPopulationData(){
        return (List<FarmerPopulationModal>)farmerPopulationRepository.findAll();
    }

    @GetMapping("/all/{id}")
    @CrossOrigin
    public FarmerPopulationModal getPopulationTown(@PathVariable(value = "id") Long farmPopId){
        return farmerPopulationRepository.findOne(farmPopId);
    }
}
