package org.payment.entity.commonentity.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Table(name = "AvailableBalance",uniqueConstraints = {
        @UniqueConstraint(columnNames = "merchantName"),
        @UniqueConstraint(columnNames = "merchantId"),
})
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class AvailableBalance {
    @Id
    private Long id;
    private String merchantName;
    private String merchantId;
    private BigDecimal availableBalance;

}
