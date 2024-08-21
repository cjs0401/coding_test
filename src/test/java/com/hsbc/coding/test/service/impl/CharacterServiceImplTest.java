package com.hsbc.coding.test.service.impl;

import com.hsbc.coding.test.service.CharacterService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jsc
 * @version 1.0
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class CharacterServiceImplTest {

    @Autowired
    private CharacterService characterService;

    @Test
    void removeConsecutive() {
        String str = characterService.removeConsecutive("aabcccbbad");
        Assert.assertEquals("d",str);
    }

    @Test
    void removeConsecutiveAndReplace() {
        String str = characterService.removeConsecutiveAndReplace("abcccbad");
        Assert.assertEquals("d",str);
    }
}