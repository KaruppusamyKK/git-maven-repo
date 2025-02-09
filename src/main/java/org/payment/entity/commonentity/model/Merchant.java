package org.payment.entity.commonentity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
@Table(name = "Merchant",uniqueConstraints = {
@UniqueConstraint(columnNames = "username"),
@UniqueConstraint(columnNames = "email"),
@UniqueConstraint(columnNames = "phoneNo"),
})
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String shortName;
    private String email;
    private String phoneNo;
    private String businessType;
    private String address;
    private String city;
    private String country;
    private Long pinCode;
    private String status;
    private LocalDateTime registeredAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "merchant",cascade = CascadeType.ALL,orphanRemoval=true)
    private List<MerchantID> merchantID;

}
