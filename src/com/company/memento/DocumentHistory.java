package com.company.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    private final List<DocumentState> documentStateList = new ArrayList<>();

    public void push(DocumentState documentState) {
        documentStateList.add(documentState);
    }

    public DocumentState pop() {
        return documentStateList.remove(documentStateList.size() - 1);
    }
}
