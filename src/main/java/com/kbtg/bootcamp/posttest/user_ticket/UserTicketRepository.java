package com.kbtg.bootcamp.posttest.user_ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public interface UserTicketRepository extends JpaRepository<UserTicket, Long> {
//    Optional<UserTicket> findByUserId(String id);
}
