package com.auction_flow.domain.entities;

import com.auction_flow.domain.enums.AuctionStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "auctions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Column(name = "starting_price", precision = 15, scale = 2)
    private BigDecimal startingPrice;

    @Column(name = "current_highest_price", precision = 15, scale = 2)
    private BigDecimal currentHighestPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "highest_bidder_id")
    private User highestBidder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private User creator;

    @Enumerated(EnumType.STRING)
    private AuctionStatus status;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;
}
