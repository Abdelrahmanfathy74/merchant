package com.merchant.merchant.Dto;

import com.merchant.merchant.Merchant;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Merchantmapper {
    MerchantDto todto(Merchant merchant);
Merchant toentity(MerchantDto merchantDto);

List<MerchantDto> todtos(List<Merchant> merchant);
List<Merchant> toentities(List<MerchantDto> merchantDto);

}
