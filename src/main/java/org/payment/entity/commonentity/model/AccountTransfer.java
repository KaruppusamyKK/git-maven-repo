package org.payment.entity.commonentity.model;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AccountTransfer",uniqueConstraints = {
        @UniqueConstraint(columnNames = "txnId"),
        @UniqueConstraint(columnNames = "hostTxnId"),
        @UniqueConstraint(columnNames = "bankTxnId"),
})
public class AccountTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String merchantName;
    private BigInteger accountNo;
    private String txnId;
    private String hostTxnId;
    private String bankTxnId;
    private BigDecimal txnAmount;
    private String status;
    private String paymentMethod;
    private BigDecimal payHubFee;
    private BigDecimal HostAmount;
    private BigDecimal bankAmount;
    private String currency;
    private BigDecimal settlementAmount;
    private LocalDateTime txnDate;
    private LocalDateTime callbackTimestamp;

    @ManyToOne
    @JoinColumn(name = "merchant_fk",nullable = false)
    private Merchant merchant;


}
