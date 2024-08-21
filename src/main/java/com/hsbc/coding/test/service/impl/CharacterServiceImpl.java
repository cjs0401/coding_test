package com.hsbc.coding.test.service.impl;

import com.hsbc.coding.test.service.CharacterService;
import org.springframework.stereotype.Service;


/**
 * @author jsc
 * @version 1.0
 */

@Service
public class CharacterServiceImpl implements CharacterService {

    @Override
    public String removeConsecutive(String str) {
        boolean changed;
        do {
            String newStr = str;
            changed = false;
            int len = str.length();
            for (int i = 2; i < len; i++) {
                if (str.charAt(i - 2) == str.charAt(i - 1) && str.charAt(i - 1) == str.charAt(i)) {
                    // Found a sequence of three or more identical characters
                    newStr = str.substring(0, i - 2) + str.substring(i + 1,len);
                    len = newStr.length(); // Update the length of the string
                    changed = true;
                    break; // Break the loop as the string has changed
                }
            }
            str = newStr;
        } while (changed); // Repeat until no changes are made

        return str;
    }

    @Override
    public String removeConsecutiveAndReplace(String str) {
        boolean changed;
        do {
            String newStr = str;
            changed = false;
            int len = str.length();

            for (int i = 2; i < len; i++) {
                if (str.charAt(i - 2) == str.charAt(i - 1) && str.charAt(i - 1) == str.charAt(i)) {
                    // Found a sequence of three or more identical characters and replace them with a single character that comes before it alphabetically.
                    char c = (char)((int)str.charAt(i) -1);
                    if (c < 'a' ) {
                        newStr = str.substring(0, i - 2) + str.substring(i + 1,len);
                    } else {
                        newStr = str.substring(0, i - 2) + ((char)((int)str.charAt(i) -1)) + str.substring(i + 1,len);
                    }
                    len = newStr.length(); // Update the length of the string
                    changed = true;
                    break; // Break the loop as the string has changed
                }
            }
            str = newStr;
        } while (changed); // Repeat until no changes are made

        return str;
    }
}
