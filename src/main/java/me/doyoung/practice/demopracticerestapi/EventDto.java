package me.doyoung.practice.demopracticerestapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class EventDto {
    private String name;        // 경매 이름
    private String description; // 경매에 대한 설명
    private LocalDateTime beginEnrollmentDateTime;      // 경매 등록 날짜
    private LocalDateTime closeEnrollmentDateTime;      // 경매 종료 날짜
    private LocalDateTime beginEventDateTime;   // 경매 시작
    private LocalDateTime endEventDateTime;     // 경매 종료
    private String location;            // 경매 장소 (if location == null then (online))
    private int basePrice;              // 최소 가격
    private int maxPrice;               // 최대 가격 (경매가가 최대 가격과 같으면 바로 낙찰)
    private int limitOfEnrollment;      // 최대 등록 횟수
}
