package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    @DisplayName("1과 2를 더하면 3이 나온다")
    void t1(){

        //앱을 만들건데 plus라는 기능을 기져야하고, 결과도 잘 나와야한다고 가정
        App app = new App();
        int rst = app.plus(1,2);

        //rst가 3인지 자동으로 확인. 검증이 필요
        assertThat(rst).isEqualTo(3);
    }
}
