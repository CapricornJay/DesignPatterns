package com.company;

import com.company.memento.Document;
import com.company.memento.DocumentHistory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Document document = new Document("Jayanth", "test", 12);
        DocumentHistory documentHistory = new DocumentHistory();
        documentHistory.push(document.createState());
        document.setContent("Changed content");

        System.out.println("Changed content : " + document.getContent());

        document.restore(documentHistory.pop());

        System.out.println("Undone content : " + document.getContent());
    }
}
