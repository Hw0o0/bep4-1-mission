package com.back.boundedContext.payout.app;

import com.back.shared.market.dto.OrderDto;
import com.back.shared.member.dto.MemberDto;
import com.back.shared.payout.dto.PayoutMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PayoutFacade {
    private final com.back.boundedContext.payout.app.PayoutSyncMemberUseCase payoutSyncMemberUseCase;
    private final com.back.boundedContext.payout.app.PayoutCreatePayoutUseCase payoutCreatePayoutUseCase;
    private final com.back.boundedContext.payout.app.PayoutAddPayoutCandidateItemsUseCase payoutAddPayoutCandidateItemsUseCase;

    @Transactional
    public void syncMember(MemberDto member) {
        payoutSyncMemberUseCase.syncMember(member);
    }

    @Transactional
    public void createPayout(PayoutMemberDto payee) {
        payoutCreatePayoutUseCase.createPayout(payee);
    }

    @Transactional
    public void addPayoutCandidateItems(OrderDto order) {
        payoutAddPayoutCandidateItemsUseCase.addPayoutCandidateItems(order);
    }
}