package com.company;

import com.company.memento.Document;
import com.company.memento.DocumentHistory;
import com.company.state.BicyclingMode;
import com.company.state.DirectionService;
import com.company.state.TransitMode;
import com.company.state.TravellingMode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Memento design pattern
        Document document = new Document("Jayanth", "test", 12);
        DocumentHistory documentHistory = new DocumentHistory();
        documentHistory.push(document.createState());
        document.setContent("Changed content");

        System.out.println("Changed content : " + document.getContent());

        document.restore(documentHistory.pop());

        System.out.println("Undone content : " + document.getContent());


        //State design pattern
        TravellingMode travellingMode = new BicyclingMode();
        DirectionService directionService = new DirectionService(travellingMode);
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());


        TravellingMode transitMode = new TransitMode();
        directionService.setTravellingMode(transitMode);
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }
}
