package com.merchant.merchant.Transaction.mapper;

import com.merchant.merchant.Transaction.Transaction;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-28T14:28:08+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransDto toDto(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransDto transDto = new TransDto();

        transDto.setTransaction_id( transaction.getTransaction_id() );
        transDto.setTrans_num( transaction.getTrans_num() );
        transDto.setTrans_type( transaction.getTrans_type() );
        transDto.setTrans_url( transaction.getTrans_url() );
        transDto.setTrans_amount( transaction.getTrans_amount() );
        transDto.setTrans_date( transaction.getTrans_date() );
        transDto.setMerchant( transaction.getMerchant() );

        return transDto;
    }

    @Override
    public Transaction toEntity(TransDto transDto) {
        if ( transDto == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        transaction.setMerchant( transDto.getMerchant() );
        transaction.setTransaction_id( transDto.getTransaction_id() );
        transaction.setTrans_num( transDto.getTrans_num() );
        transaction.setTrans_type( transDto.getTrans_type() );
        transaction.setTrans_url( transDto.getTrans_url() );
        transaction.setTrans_amount( transDto.getTrans_amount() );
        transaction.setTrans_date( transDto.getTrans_date() );

        return transaction;
    }

    @Override
    public List<TransDto> toDtos(List<Transaction> transaction) {
        if ( transaction == null ) {
            return null;
        }

        List<TransDto> list = new ArrayList<TransDto>( transaction.size() );
        for ( Transaction transaction1 : transaction ) {
            list.add( toDto( transaction1 ) );
        }

        return list;
    }

    @Override
    public List<Transaction> toEntities(List<TransDto> transDto) {
        if ( transDto == null ) {
            return null;
        }

        List<Transaction> list = new ArrayList<Transaction>( transDto.size() );
        for ( TransDto transDto1 : transDto ) {
            list.add( toEntity( transDto1 ) );
        }

        return list;
    }
}
