package com.donniexyz.microservice.mb.account.lib.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MBAccountEntity implements Serializable {

    private UUID id;

    private String accountNo;
    private String accountName;
}
