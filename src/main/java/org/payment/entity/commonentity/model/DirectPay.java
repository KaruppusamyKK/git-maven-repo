package org.payment.entity.commonentity.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DirectPay",uniqueConstraints = {
        @UniqueConstraint(columnNames = "txnId"),
        @UniqueConstraint(columnNames = "hostTxnId"),
        @UniqueConstraint(columnNames = "bankTxnId"),
})
public class DirectPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String merchantName;
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
