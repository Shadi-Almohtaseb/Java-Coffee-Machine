/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import static com.mongodb.client.model.Filters.eq;
//import com.mongodb.client.model.Projections;
//import com.mongodb.client.model.Sorts;
//import com.mongodb.client.result.InsertOneResult;
//import org.bson.Document;
//import org.bson.conversions.Bson;


    //The code is working fine but on my cluster mongodb

public class DatabaseLogger implements Logger {
    
//    MongoClient client = MongoClients.create("mongodb+srv://shadi876543211:shade211125@cluster0.x4gtfqw.mongodb.net/?retryWrites=true&w=majority");
//
//    MongoDatabase db = client.getDatabase("CoffeeMachine");
//
//    MongoDatabase database = client.getDatabase("CoffeeMachine");
//    MongoCollection<Document> collection = database.getCollection("machineHisotry");

    @Override
    public void log(String message) {
//         InsertOneResult result = collection.insertOne(new Document()
//            .append("History", message));
    }
    
    public void getResult(){
        
    }

}
