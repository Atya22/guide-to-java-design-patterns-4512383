package com.example;

public class RedUserInterface implements UserInterfaceFactory {
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new RedScrollBar();
    }
}
