package com.back.shared.market.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MarketMemberDto {

    private final int id;
    private final LocalDateTime createDate;
    private final LocalDateTime modifyDate;
    private final String username;
    private final String nickname;
    private final int activityScore;
}