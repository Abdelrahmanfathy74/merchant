package com.merchant.merchant.Transaction.mapper;

import com.merchant.merchant.Dto.MerchantDto;
import com.merchant.merchant.Merchant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransDto {
    Integer transaction_id;
    Integer trans_num;
    String trans_type;
    String trans_url;
    Double trans_amount;
    LocalDateTime trans_date;
    Merchant merchant;
}
