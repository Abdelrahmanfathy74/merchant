package com.merchant.merchant.Transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.merchant.merchant.Merchant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer transaction_id;
    @NotNull
    private Integer trans_num;
    private String trans_type;
@NotNull
    private String trans_url;
    private Double trans_amount;
    private LocalDateTime trans_date;
    @ManyToOne
    @JoinColumn(name = "merchant_code")
    private Merchant merchant;

//    public Transaction(Integer trans_num, String trans_type, String trans_url, Double trans_amount, LocalDateTime trans_date) {
//        this.trans_num = trans_num;
//        this.trans_type = trans_type;
//        this.trans_url = trans_url;
//        this.trans_amount = trans_amount;
//        this.trans_date = trans_date;
//    }

    public Transaction(Integer trans_num, String trans_type, String trans_url, Double trans_amount, LocalDateTime trans_date, Merchant merchant) {
        this.trans_num = trans_num;
        this.trans_type = trans_type;
        this.trans_url = trans_url;
        this.trans_amount = trans_amount;
        this.trans_date = trans_date;
        this.merchant = merchant;
    }
    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
