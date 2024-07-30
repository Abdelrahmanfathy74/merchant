package com.merchant.merchant.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantDto {
    private Integer merchant_code;
    private String firstname;
  private String lastname;
  private String callback_url;
}
