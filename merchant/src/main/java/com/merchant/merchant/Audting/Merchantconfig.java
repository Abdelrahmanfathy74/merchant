package com.merchant.merchant.Audting;

import com.merchant.merchant.Merchant;
import com.merchant.merchant.MerchantRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class Merchantconfig {
@Bean
    public AuditorAware<String> auditorAware(){
    return new AuditorAwareimple();
}

@Bean
CommandLineRunner commandLineRunner(MerchantRepo merchantRepo){
    return args -> {
      Merchant mer=  new Merchant("abdo", "fathy", "callback_url");

       Merchant mer1= new Merchant("asmaa", "fathy", "callback_url");
        merchantRepo.saveAll(List.of(mer,mer1));
    };
}
}
