package org.payment.entity.commonentity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Table(name = "MerchantID",uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "phoneNo"),
})
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MerchantID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String merchantName;
    private String directPayId; // DIRECT BANK TO BANK TRANSFER PAYMENT
    private String directScanId; // SCAN PAYMENT
    private String cardPayId;   // CARD PAYMENT
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "merchant_fk",nullable = false)
    private Merchant merchant;

}
