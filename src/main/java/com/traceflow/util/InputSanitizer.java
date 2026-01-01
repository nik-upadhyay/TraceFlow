package com.traceflow.util;
import com.traceflow.exception.InvalidInputException;

import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;

public class InputSanitizer {
    private InputSanitizer(){
    }

    public static String sanitizeAndValidate(String input, String fieldName){
        if(input == null) return null;
        String cleaned = Jsoup.clean(input, Safelist.none());

       if (!input.equals(cleaned)) {
            throw new InvalidInputException(
                fieldName + " contains invalid or unsafe content"
            );
        }
        return cleaned;
    }

}
