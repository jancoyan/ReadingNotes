package com.jancoyan.readingnotes;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.jancoyan.readingnotes.mapper")
class ReadingnotesBootApplicationTests {

    @Test
    void contextLoads() {
    }

}
