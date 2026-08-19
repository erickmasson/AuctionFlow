package com.auction_flow.domain.repositories;

import com.auction_flow.domain.entities.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
