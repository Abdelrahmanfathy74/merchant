package com.merchant.merchant.service;

import com.merchant.merchant.Dto.MerchantDto;
import com.merchant.merchant.Dto.Merchantmapper;
import com.merchant.merchant.MerchantRepo;
import com.merchant.merchant.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MerchantService {
    @Autowired
    private Merchantmapper merchantmapper;
    @Autowired
    private MerchantRepo merchantRepo;
    public MerchantDto getmerid(Integer id){
       Optional<Merchant> mer= merchantRepo.findById(id);
        return merchantmapper.todto(mer.orElseThrow(()->new RuntimeException("id not found")));
    }
    public List<MerchantDto> getallmer(){
       return merchantmapper.todtos(merchantRepo.findAll());
    }
    public MerchantDto save(MerchantDto dto){
       return merchantmapper.todto(merchantRepo.save(merchantmapper.toentity(dto)));
    }
    public MerchantDto savemer(MerchantDto DTO){
        return merchantmapper.todto(merchantRepo.save(merchantmapper.toentity(DTO)));
    }
    public void deletebyid(Integer id){
       MerchantDto merchantDto=merchantmapper.todto(merchantRepo.findById(id).get());
        merchantRepo.deleteById(merchantDto.getMerchant_code());
    }
}
