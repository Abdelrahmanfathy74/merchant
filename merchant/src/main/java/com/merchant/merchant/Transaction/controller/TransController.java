package com.merchant.merchant.Transaction.controller;

import com.merchant.merchant.Transaction.mapper.TransDto;
import com.merchant.merchant.Transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trans")
public class TransController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/")
    public List<TransDto> getall(){
        return transactionService.getalltrans();
    }
    @GetMapping("/get{id}")
    public TransDto getbyid(@PathVariable Integer id){
        return transactionService.getbyid(id);
    }
    @PostMapping("/add")
    public TransDto savetrans(@RequestBody TransDto transDto){
        return transactionService.save(transDto);
    }
    @PutMapping("/update")
    public TransDto updatetarns(@RequestBody TransDto transDto){
        return transactionService.update(transDto);
    }
    @DeleteMapping("/delete{id}")
    public void deleteterans(@PathVariable Integer id){
        transactionService.deletebyid(id);
    }
}
