package com.merchant.merchant;
import com.merchant.merchant.Dto.MerchantDto;
import com.merchant.merchant.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepo extends JpaRepository<Merchant,Integer> {
}
