package org.javaboy.ioc;

public class WindosShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "dir";
    }
}
