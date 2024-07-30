package com.merchant.merchant.Base;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public abstract class MerchantBase {
@CreatedBy
    private String Createdby;
@CreatedDate
    private LocalDateTime Createdate;
@LastModifiedBy
    private String Modifiedby;
@LastModifiedDate
    private LocalDateTime Modifieddate;
}
