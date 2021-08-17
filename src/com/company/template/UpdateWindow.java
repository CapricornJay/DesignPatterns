package com.company.template;

public class UpdateWindow extends Window{

    @Override
    protected void executeBeforeClosing() {
        System.out.println("Updating window");
    }

    @Override
    protected void executeAfterClosing() {
        System.out.println("Done updating");
    }
}
