package com.example.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombokTest() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        // asertThat
        // asertj 라는 테스트 검증 라이브러리의 검증 메소드입니다.
        // 검증하고 싶은 대상을 메소드 인자로 받습니다.
        // 메소드 체이닝이 지원되어 isEqualTo 와같이 메소드를 이어서 사용할 수 있습니다.
        // isEqualTo
        // assertj 의 동등 비교 메소드입니다.
        // asertThat 에 있는 값과 isEqualTo 의 값을 비교해서 같을 때만 성공
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
