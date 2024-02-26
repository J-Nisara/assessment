package com.kbtg.bootcamp.posttest.user_ticket;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTicketRepository extends JpaRepository<UserTicket, Long> {
    Optional<UserTicket> findByUserId(String id);
}
