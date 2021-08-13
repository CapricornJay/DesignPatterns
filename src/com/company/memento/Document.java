package com.company.memento;

public class Document {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    private String fontName;
    private int fontSize;

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void restore(DocumentState documentState) {
        this.content = documentState.getContent();
        this.fontName = documentState.getFontName();
        this.fontSize = documentState.getFontSize();
    }

    public DocumentState createState() {
        return new DocumentState(this.content, this.fontName, this.fontSize);
    }
}
