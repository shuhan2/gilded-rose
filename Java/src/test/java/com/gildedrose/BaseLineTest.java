package com.gildedrose;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BaseLineTest {
    @Test
    void should_always_with_base_line() throws IOException {
        String outPut = TextTestFixture.getBaseLine();
        String baseLine = Files.asCharSource(new File("src/test/baseLine.txt"), UTF_8).read();

        assertEquals(baseLine, outPut);
    }
}
