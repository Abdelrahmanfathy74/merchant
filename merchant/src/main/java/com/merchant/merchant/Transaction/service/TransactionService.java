package com.merchant.merchant.Transaction.service;

import com.merchant.merchant.Transaction.Repo.TransactionRepo;
import com.merchant.merchant.Transaction.Transaction;
import com.merchant.merchant.Transaction.mapper.TransDto;
import com.merchant.merchant.Transaction.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;
    @Autowired
    private TransactionMapper transactionMapper;

    public List<TransDto> getalltrans(){

        return transactionMapper.toDtos(transactionRepo.findAll());
    }
    public TransDto getbyid(Integer id){
        Optional<Transaction> trans=transactionRepo.findById(id);
        return transactionMapper.toDto(trans.orElseThrow(()-> new RuntimeException("not found")));
    }
    public TransDto save(TransDto transaction){
        return transactionMapper.toDto(transactionRepo.save(transactionMapper.toEntity(transaction)));
    }
    public TransDto update(TransDto transaction){

        return transactionMapper.toDto(transactionRepo.save(transactionMapper.toEntity(transaction)));
    }
    public void deletebyid(Integer id){
        TransDto dto= transactionMapper.toDto(transactionRepo.findById(id).get());
        transactionRepo.deleteById(dto.getTransaction_id());
    }
}
