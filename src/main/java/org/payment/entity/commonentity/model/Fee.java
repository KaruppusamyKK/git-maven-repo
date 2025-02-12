package org.payment.entity.commonentity.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "Fee",uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "phoneNo"),
})
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String merchantName;
    private BigDecimal merchantFee;
    private BigDecimal hostFee;
    private BigDecimal A2APayMinAmount;
    private LocalDateTime timeStamp;

    @ManyToOne
    @JoinColumn(name = "merchant_fk",nullable = false)
    private Merchant merchant;


}
