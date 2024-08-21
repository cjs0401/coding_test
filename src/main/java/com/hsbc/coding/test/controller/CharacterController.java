package com.hsbc.coding.test.controller;

import com.hsbc.coding.test.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jsc
 * @version 1.0
 */

@RestController
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    //Case 1: For a given string that only contains alphabet characters a-z, if 3 or more consecutive characters are identical, remove them from the string. Repeat this process until there is no more than 3 identical characters sitting besides each other.
    @RequestMapping("/removeConsecutive")
    public String removeConsecutive() {
        return "removeConsecutiveCharacters : " + characterService.removeConsecutive("aabcccbbad");
    }


    //Case 2: Instead of removing the consecutively identical characters, replace them with a single character that comes before it alphabetically.
    @RequestMapping("/removeConsecutiveAndReplace")
    public String removeConsecutiveAndReplace() {
        return "removeConsecutiveAndReplaceCharacters : "  + characterService.removeConsecutiveAndReplace("abcccbad");
    }


}
