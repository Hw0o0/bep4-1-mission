package com.back.shared.cash.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CashMemberDto {

    private final int id;
    private final LocalDateTime createDate;
    private final LocalDateTime modifyDate;
    private final String username;
    private final String nickname;
    private final int activityScore;
}