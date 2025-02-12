package org.payment.entity.commonentity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AccountTransferHost",uniqueConstraints = {
        @UniqueConstraint(columnNames = "txnId"),
        @UniqueConstraint(columnNames = "bankTxnId"),
})
public class AccountTransferHost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String merchantName;
    private String txnId;
    private String bankTxnId;
    private BigDecimal hostAmount;
    private BigDecimal merchantAmount;
    private BigDecimal hostFee;
    private LocalDateTime timestamp;
    private LocalDateTime callBackDateTime;
    private String status;
    private String paymentMethod;


}
