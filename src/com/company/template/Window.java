package com.company.template;

public abstract class Window {

    protected abstract void executeBeforeClosing();

    protected abstract void executeAfterClosing();

    public void executeWindow() {
        executeBeforeClosing();
        close();
        executeAfterClosing();
    }

    protected void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        System.out.println("Removing the window from the screen");
        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }
}