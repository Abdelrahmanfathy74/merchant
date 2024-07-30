package com.merchant.merchant.controller;

import com.merchant.merchant.Dto.MerchantDto;
import com.merchant.merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/merchant")
public class Mercontroller {
    @Autowired
    private MerchantService merchantService;
    @GetMapping("/getall")
    public List<MerchantDto> getall(){
        return merchantService.getallmer();
    }
    @GetMapping("/get{id}")
    public MerchantDto getmerbyid(@PathVariable Integer id){
        return merchantService.getmerid(id);
    }
    @PostMapping("/add")
    public MerchantDto save(@RequestBody MerchantDto merchant){
        return merchantService.save(merchant);
    }
    @PutMapping("/update")
    public MerchantDto updatemer(@RequestBody MerchantDto merchant){
       return merchantService.savemer(merchant);
    }
    @DeleteMapping("/delete{id}")
    public void deletemer(@PathVariable Integer id){
        merchantService.deletebyid(id);
    }
}
