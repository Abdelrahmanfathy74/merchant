package com.merchant.merchant.Dto;

import com.merchant.merchant.Dto.MerchantDto.MerchantDtoBuilder;
import com.merchant.merchant.Merchant;
import com.merchant.merchant.Merchant.MerchantBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-27T11:24:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class MerchantmapperImpl implements Merchantmapper {

    @Override
    public MerchantDto todto(Merchant merchant) {
        if ( merchant == null ) {
            return null;
        }

        MerchantDtoBuilder merchantDto = MerchantDto.builder();

        merchantDto.merchant_code( merchant.getMerchant_code() );
        merchantDto.firstname( merchant.getFirstname() );
        merchantDto.lastname( merchant.getLastname() );
        merchantDto.callback_url( merchant.getCallback_url() );

        return merchantDto.build();
    }

    @Override
    public Merchant toentity(MerchantDto merchantDto) {
        if ( merchantDto == null ) {
            return null;
        }

        MerchantBuilder merchant = Merchant.builder();

        merchant.merchant_code( merchantDto.getMerchant_code() );
        merchant.firstname( merchantDto.getFirstname() );
        merchant.lastname( merchantDto.getLastname() );
        merchant.callback_url( merchantDto.getCallback_url() );

        return merchant.build();
    }

    @Override
    public List<MerchantDto> todtos(List<Merchant> merchant) {
        if ( merchant == null ) {
            return null;
        }

        List<MerchantDto> list = new ArrayList<MerchantDto>( merchant.size() );
        for ( Merchant merchant1 : merchant ) {
            list.add( todto( merchant1 ) );
        }

        return list;
    }

    @Override
    public List<Merchant> toentities(List<MerchantDto> merchantDto) {
        if ( merchantDto == null ) {
            return null;
        }

        List<Merchant> list = new ArrayList<Merchant>( merchantDto.size() );
        for ( MerchantDto merchantDto1 : merchantDto ) {
            list.add( toentity( merchantDto1 ) );
        }

        return list;
    }
}
