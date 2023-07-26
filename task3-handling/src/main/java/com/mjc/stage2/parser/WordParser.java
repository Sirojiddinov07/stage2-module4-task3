package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;

public class WordParser {


    public void parse(AbstractTextComponent abstractTextComponent, String string) {

        String[] words = string.split("\\s+"); // Split the string into words using whitespace as the delimiter

        for (String word : words) {
            // Create a new TextComponent for each word and add it to the abstractTextComponent
            abstractTextComponent.addComponent(new TextComponent(word));
        }
    }
}
