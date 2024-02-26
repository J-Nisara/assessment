package com.kbtg.bootcamp.posttest.lottery;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class LotteryService {
//    private List<Lottery> ticketList = new ArrayList<>(
//            List.of(new Lottery("123456", 80, 2),
//                    new Lottery("123456", 80, 2),
//                    new Lottery("123456", 80, 2))
//    );

    private LotteryRepository lotteryRepository;

    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    public List<Lottery> getLottery(){
        List<Lottery> lotteries = lotteryRepository.findAll();
        return lotteries;
    }

    public Lottery createLottery(Lottery lottery){
        return lotteryRepository.save(lottery);
    }

    public Lottery updateLottery(Lottery lottery, String id) {
        return lotteryRepository.findById(Long.parseLong(id))
                .map(lotto -> {
                    lotto.setTicket_id(lottery.getTicket_id());
                    lotto.setPrice(lottery.getPrice());
                    lotto.setAmount(lottery.getAmount());
                    return lotteryRepository.save(lotto);
                })
                .orElseGet(() -> {
                    lottery.setTicket_id(id);
                    return lotteryRepository.save(lottery);
                });
    }

    public void deleteLottery(String id){
        lotteryRepository.deleteById(Long.parseLong(id));
    }
}
