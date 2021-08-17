package com.company;

import com.company.iterator.Iterator;
import com.company.iterator.Product;
import com.company.iterator.ProductCollection;
import com.company.memento.Document;
import com.company.memento.DocumentHistory;
import com.company.state.BicyclingMode;
import com.company.state.DirectionService;
import com.company.state.TransitMode;
import com.company.state.TravellingMode;
import com.company.strategy.AESEncryptionAlgorithm;
import com.company.strategy.ChatClient;
import com.company.strategy.DESEncryptionAlgorithm;
import com.company.strategy.EncryptionAlgorithm;
import com.company.template.EditWindow;
import com.company.template.UpdateWindow;
import com.company.template.Window;

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


        //Iterator design pattern
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "test"));
        productCollection.add(new Product(2, "test"));

        Iterator iterator = productCollection.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }

        //Strategy design pattern
        EncryptionAlgorithm desEncryptionAlgorithm = new DESEncryptionAlgorithm();
        ChatClient chatClient = new ChatClient();
        chatClient.send(desEncryptionAlgorithm, "test");

        EncryptionAlgorithm aesEncryptionAlgorithm = new AESEncryptionAlgorithm();
        chatClient.send(aesEncryptionAlgorithm, "test");

        // Template design pattern
        Window window = new UpdateWindow();
        window.executeWindow();

        window = new EditWindow();
        window.executeWindow();
    }
}
