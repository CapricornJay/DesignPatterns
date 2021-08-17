package com.company.template;

public class EditWindow extends Window{
    @Override
    protected void executeBeforeClosing() {
        System.out.println("Editing window");
    }

    @Override
    protected void executeAfterClosing() {
        System.out.println("Done editing");
    }
}
