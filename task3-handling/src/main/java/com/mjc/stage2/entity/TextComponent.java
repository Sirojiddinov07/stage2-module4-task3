package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    public TextComponent(String word) {
        super(TextComponentType.valueOf(word));
    }

    @Override
    public String operation() {
        return null;
    }

    @Override
    public void add(AbstractTextComponent textComponent) {

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void addComponent(TextComponent textComponent) {

    }
}