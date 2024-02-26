package com.kbtg.bootcamp.posttest.lottery;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/admin")
public class LotteryController {
    private LotteryService lotteryService;

    public LotteryController(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    @GetMapping("/lotteries")
    public List<Lottery> getTicketList(){
        return lotteryService.getLottery();
    }


    @PostMapping("/lotteries")
    public void createTicket(@RequestBody Lottery lottery){
        lotteryService.createLottery(lottery);
    }

    @PutMapping("/lotteries/{ticket_id}")
    public void updateTicket(@RequestBody  Lottery lottery, @PathVariable String ticket_id) {
        lotteryService.updateLottery(lottery, ticket_id);
    }

    @DeleteMapping("/lotteries/{ticket_id}")
    public void deleteLottery(@PathVariable String ticket_id){
        lotteryService.deleteLottery(ticket_id);
    }
}
