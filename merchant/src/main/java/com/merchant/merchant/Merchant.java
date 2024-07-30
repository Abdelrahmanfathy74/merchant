package com.merchant.merchant;

import com.merchant.merchant.Base.MerchantBase;
import com.merchant.merchant.Transaction.Transaction;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "merchants")
@Data
@Builder


@AllArgsConstructor
@NoArgsConstructor
public class Merchant extends MerchantBase {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Integer merchant_code;
   @NotBlank
   @Column
   private String firstname;
   @NotBlank
   @Column
   private String lastname;
   @NotNull
   @Column
    private String callback_url;
   @OneToMany(mappedBy = "merchant",cascade = CascadeType.ALL)
   private List<Transaction> transaction;

    public Merchant(String firstname, String lastname, String callback_url) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.callback_url = callback_url;
    }
    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }


}
