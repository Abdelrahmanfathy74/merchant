package com.merchant.merchant.Transaction.mapper;

import com.merchant.merchant.Transaction.Transaction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    public TransDto toDto(Transaction transaction);
    public Transaction toEntity(TransDto transDto);
    public List<TransDto> toDtos(List<Transaction> transaction);
    public List<Transaction> toEntities(List<TransDto> transDto);

    ;
}
