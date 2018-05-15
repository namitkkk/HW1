
package hw1;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;            
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JFrame;

/**
 *
 * @author kumar
 */
public class StoreSystem extends Application 
{
    Label actionLabel = new Label ("Select Entity to Create ");
    private String [] actionClasses= {"Customers", "Products", "Stores", "Suppliers", "Technician", "Services"};
     TextArea Test = new TextArea();
        TextField personName = new TextField();
        TextField personPhone = new TextField();
        TextField personAddress = new TextField();
        TextField productName = new TextField();
        TextField productDescription = new TextField();
        TextField serviceName = new TextField();
        TextField serviceDescription = new TextField();
        TextField storeName = new TextField();
        TextField storeAddress = new TextField();
        TextField supplierName = new TextField();
        TextField supplierAddress = new TextField();
        
        
        
        Label editId = new Label ("Enter ID # of Entity to edit: ");
        TextField txtEdit = new TextField();
        RadioButton produceCat = new RadioButton ("Customer");
        RadioButton meatsCat = new RadioButton ("Technician");
       
       
        Button submit = new Button ("Submit");
        TextField editItem = new TextField();
        Label prsnType = new Label("Person Type: ");
        Label prsnName = new Label("Person Name: ");
        Label prsnAddress = new Label("Person Address: ");
        Label prsnPhone = new Label("Item Cost: ");
        Label sellingPrice = new Label ("Sell for cost: ");
        Label category = new Label ("Item Category: ");
        Label quantity = new Label("Item Quantity: ");
        TextArea editArea = new TextArea();
        String testInventory = "Milk, eggs, brownies, dough, bread";
      Button editDisplay = new Button("Display Inventory");
      Button editSubmit = new Button("Submit");
       RadioButton Produce = new RadioButton("Produce");
            RadioButton Meats_Dairy = new RadioButton("Meats/Dairy");
            RadioButton Canned = new RadioButton("Canned");
            RadioButton Boxed = new RadioButton("Boxed");
            RadioButton Bagged = new RadioButton("Bagged");
            
             private ComboBox<String> comboBox = new ComboBox<>();
    
    
    
    
    
    
    
    
    
    @Override
    public void start(Stage primaryStage) 
    {
       GridPane primaryPane = new GridPane();
        //primaryPane.setAlignment(Pos.CENTER);
        primaryPane.setVgap(20);
        primaryPane.setHgap(20);
        
        // Title
        Text sceneTitle = new Text("PG Bag It! Inventory System");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,28));
        sceneTitle.setFill(Color.BLUEVIOLET);
        primaryPane.add(sceneTitle, 1, 0, 2, 1);
        
        
//         Picture addition
        ImageView image = new ImageView("http://www.newlifehfs.com/grocery_cartoon_203x249.jpg");
        primaryPane.getChildren().add(image);
        image.setFitHeight(150);
        image.setFitWidth(150);
        primaryPane.setPadding(new Insets(5,5,5,5));
        primaryPane.setStyle("-fx-background-color: lightgrey;");
        
        
        // Combo Box
        primaryPane.add(actionLabel,0,1);
        primaryPane.add(comboBox, 1, 1);
        primaryPane.add(Test,0,2,4,4);
        
        
        
        comboBox.setPrefWidth(400);
        
        
        ObservableList<String> items = FXCollections.observableArrayList(actionClasses);
        comboBox.getItems().addAll(items);
        
        
        
        // Add scene
        Scene primaryScene = new Scene (primaryPane, 600, 500, Color.CADETBLUE);
        
        // Stage
        primaryStage.setScene (primaryScene);
        primaryStage.setTitle("Store System!");
        primaryStage.show();
        
        // Button Action
        comboBox.setOnAction(e -> setDisplay(items.indexOf(comboBox.getValue())));
//       
//        showInventory();
//        showInventory1();
//        showInventory2();
//        showInventory3();
//        showInventory4();
        
    }
    
    public void setDisplay(int index){
        
        
//        editAction();
        if (index == 4)
        {
            System.exit(0);
        }
        if (index == 0)
        {
            addActionWindow(index);
           
            
            
        }
        if (index == 1)
        {
             
            
//            editAction();
//          ListView<Item> lv = new ListView<>
//          (FXCollections.observableArrayList(invent));
//          lv.setPrefSize(800,800);
//          lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//          
//          BorderPane pane2 = new BorderPane();
//          pane2.setBottom(new ScrollPane(lv));
//          
//          lv.getSelectionModel().selectedItemProperty().addListener(ov -> 
//          {
//              
//              showInventory();
//              showInventory1();
//              showInventory2();
//              showInventory3();
//              showInventory4();
//              editAction();
//          });
//          
//          Scene scene2 = new Scene(pane2, 450, 170);
//          Stage stage3 = new Stage();
//          stage3.setTitle("Inventory ListView");
//          stage3.show();
            
//    
//            Label editId = new Label ("Enter ID Number of item to edit: ");
//            TextField txtEdit = new TextField()
        }
        if (index == 2) 
        {
//            printCatActionWindow(index);
            
        }  
        if (index == 3)
        {
//            Test.setText(invent.toString());
           
            
        }
            
        
        }
         
            
           
    
    public void addActionWindow(int index){
        Stage actionStage = new Stage();
        GridPane actionPane = new GridPane();
        actionPane.setAlignment(Pos.CENTER);
        actionPane.setVgap(20);
        actionPane.setHgap(20);
        actionPane.setStyle("-fx-background-color: lightgrey;");
//        ImageView image = new ImageView("http://www.newlifehfs.com/grocery_cartoon_203x249.jpg");
//        actionPane.getChildren().add(image);
//        image.setFitHeight(150);
//        image.setFitWidth(150);
        actionPane.setPadding(new Insets(5,5,5,5));
        
        // Nodes
        Text actionTitle = new Text ("Enter Item Details");
        actionTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle.setFill(Color.BLUEVIOLET);
        actionPane.add(actionTitle,1,0,2,1);
       
      
        
        
        
          
          
        // Toggle group for radiobuttons
        ToggleGroup group = new ToggleGroup();
        produceCat.setToggleGroup(group);
        meatsCat.setToggleGroup(group);
       
        
        
        // Add nodes to pane
           
        
        actionPane.add(prsnName,0, 1);
        actionPane.add(personName, 1, 1,2,1);
        
        actionPane.add(prsnPhone,0, 1);
        actionPane.add(personPhone,0,2);
        actionPane.add(personAddress,1,2,2,1);
        
        
        
        
        
        
        actionPane.add(prsnType,0,5);
        actionPane.add(produceCat,1,5);
        actionPane.add(meatsCat,1,6);
       
        
     
        
        actionPane.add(submit,3,10);
        
          
          
        
        // Action event for submit button
        submit.setOnAction(e -> {
            Stage submitStage = new Stage();
            GridPane submitPane = new GridPane();
            submitPane.setAlignment(Pos.CENTER);
            submitPane.setVgap(20);
            submitPane.setHgap(20);
            submitPane.setStyle("-fx-background-color: lightgrey;");
            String submitItem = personName.getText();
            Text submitText = new Text(submitItem + " has been added to the inventory!");
            
            submitPane.add(submitText,0,1);
//            addItem();
            
            
            Scene submitScene = new Scene(submitPane,250,100);
            submitStage.setScene(submitScene);
            submitStage.setTitle("Item Added Confirmation");
            submitStage.show();
            
            
            
           
            
            
            actionStage.hide();
            comboBox.valueProperty().set(null);
            

        });
        
        
        
        
        
        
        
        // Scene
        Scene actionScene = new Scene (actionPane, 600, 600);
        
        // Stage 
        actionStage.setScene(actionScene);
        actionStage.setTitle("Add Item");
        
        actionStage.show();
        
    }
  
    // Namit Kumar
      
//    public void addItem()
//    {
//        
//          Double iCost = Double.parseDouble(itmCost.getText());
//          Double rPrice = Double.parseDouble(sellPrice.getText());
//          Double iQuant = Double.parseDouble(quant.getText());
//          String sqlQuery = "";
//          String sqlQuery1 = "";
//          String sqlQuery2 = "";
//          String sqlQuery3 = "";
//          String sqlQuery4 = "";
//
//          
//          if (produceCat.isSelected())
//          {
//          
//          invent.add(new Produce(iCost,itmDesc.getText(), itmName.getText(),rPrice,iQuant));
//        
//          
//          sqlQuery = "insert into JAVAUSER.INVENTORY (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery += "\'" + itmName.getText() + "\',";
//          sqlQuery += rPrice + ",";
//          sqlQuery += iQuant + ","; 
//          sqlQuery += iCost + ","; 
//          sqlQuery += "\'" + itmDesc.getText() + "\',";
//          sqlQuery += "'Produce'" + ")";
//          
//          }
//          else if (meatsCat.isSelected())
//          {
//             
//          invent.add(new MeatsDairy(iCost,itmDesc.getText(), itmName.getText(),rPrice, iQuant));
//       
//          
//          sqlQuery1 = "insert into JAVAUSER.INVENTORY1 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery1 += "\'" + itmName.getText() + "\',";
//          sqlQuery1 += rPrice + ",";
//          sqlQuery1 += iQuant + ","; 
//          sqlQuery1 += iCost + ","; 
//          sqlQuery1 += "\'" + itmDesc.getText() + "\',";
//          sqlQuery1 += "'Meats/Dairy'" + ")";
//          
//          }
//          else if (canCat.isSelected())
//          {
//             
//          invent.add(new Canned(iCost,itmDesc.getText(), itmName.getText(),rPrice, iQuant));
//         
//          
//          sqlQuery2 = "insert into JAVAUSER.INVENTORY2 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//         sqlQuery2 += "\'" + itmName.getText() + "\',";
//          sqlQuery2 += rPrice + ",";
//          sqlQuery2 += iQuant + ","; 
//          sqlQuery2 += iCost + ","; 
//          sqlQuery2 += "\'" + itmDesc.getText() + "\',";
//          sqlQuery2 += "'Canned'" + ")";
//          
//          }
//          else if (boxCat.isSelected())
//          {
//           
//           
//          invent.add(new Boxed(iCost,itmDesc.getText(), itmName.getText(),rPrice, iQuant));
//          sqlQuery3 = "insert into JAVAUSER.INVENTORY3 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//           sqlQuery3 += "\'" + itmName.getText() + "\',";
//          sqlQuery3 += rPrice + ",";
//          sqlQuery3 += iQuant + ","; 
//          sqlQuery3 += iCost + ","; 
//          sqlQuery3 += "\'" + itmDesc.getText() + "\',";
//          sqlQuery3 += "'Boxed'" + ")";
//       
//          }
//          else if (bagCat.isSelected())
//          {
//             
//          invent.add(new Bagged(iCost,itmDesc.getText(), itmName.getText(),rPrice, iQuant));
//         
//         sqlQuery4 = "insert into JAVAUSER.INVENTORY4 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery4 += "\'" + itmName.getText() + "\',";
//          sqlQuery4 += rPrice + ",";
//          sqlQuery4 += iQuant + ","; 
//          sqlQuery4 += iCost + ","; 
//          sqlQuery4 += "\'" + itmDesc.getText() + "\',";
//          sqlQuery4 += "'Bagged'" + ")";
//          
//          }
//        
//          String temp = "";
//          for (int i = 0; i < invent.size(); i++)
//          {
//               temp += invent.get(i).toString() + "";  
//          }
//          
//          Test.setText(temp);
////          
////        sendDBCommand(sqlQuery); 
////        sendDBCommand1(sqlQuery1); 
////        sendDBCommand2(sqlQuery2); 
////        sendDBCommand3(sqlQuery3); 
////        sendDBCommand4(sqlQuery4); 
//        
//       
//    }
//    
//    
//    
//    public void editItem()
//    {
//        
//        
//         String temp = "";
//         Double iCost = Double.parseDouble(itmCost.getText());
//         Double rPrice = Double.parseDouble(sellPrice.getText());
//         Double iQuant = Double.parseDouble(quant.getText());
//         String iDesc = itmDesc.getText();
//         String iName = itmName.getText();
//         int newEdit = Integer.parseInt(editItem.getText());
//        String sqlQuery = "";
//         String sqlQuery1 = "";
//          String sqlQuery2 = "";
//          String sqlQuery3 = "";
//          String sqlQuery4 = "";
//         
//         
//        
//        for (int i = 0; i < invent.size(); i++)
//        {
//          if (produceCat.isSelected())
//          {
//       
//         invent.get(newEdit).itemCost = iCost;
//         invent.get(newEdit).itemDescription = iDesc;
//         invent.get(newEdit).itemName = iName;
//         invent.get(newEdit).itemRetail = rPrice;
//         invent.get(newEdit).itemQty = iQuant;
//         invent.get(newEdit).category = 1;
//         invent.get(newEdit).cat = "Produce";
//         
//         //update inventory set itemname = whatever, itemsell = whateverr, 
//       
//          sqlQuery = "insert into JAVAUSER.INVENTORY (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery += "\'" + iName + "\',";
//          sqlQuery += rPrice + ",";
//          sqlQuery += iQuant + ","; 
//          sqlQuery += iCost + ","; 
//          sqlQuery += "\'" + iDesc + "\',";
//          sqlQuery += "'Produce'" + ")";
//          }
//          else if (meatsCat.isSelected())
//          {
//         invent.get(newEdit).itemCost = iCost;
//         invent.get(newEdit).itemDescription = iDesc;
//         invent.get(newEdit).itemName = iName;
//         invent.get(newEdit).itemRetail = rPrice;
//         invent.get(newEdit).itemQty = iQuant;
//         invent.get(newEdit).category = 2;
//         invent.get(newEdit).cat = "Meats/Dairy";
//            sqlQuery1 = "insert into JAVAUSER.INVENTORY1 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery1 += "\'" + iName + "\',";
//          sqlQuery1 += rPrice + ",";
//          sqlQuery1 += iQuant + ","; 
//          sqlQuery1 += iCost + ","; 
//          sqlQuery1 += "\'" + iDesc + "\',";
//          sqlQuery1 += "'Meats/Dairy'" + ")";
//          }
//          else if (canCat.isSelected())
//          {
//         invent.get(newEdit).itemCost = iCost;
//         invent.get(newEdit).itemDescription = iDesc;
//         invent.get(newEdit).itemName = iName;
//         invent.get(newEdit).itemRetail = rPrice;
//         invent.get(newEdit).itemQty = iQuant;
//         invent.get(newEdit).category = 3;
//          invent.get(newEdit).cat = "Canned";
//          sqlQuery2 = "insert into JAVAUSER.INVENTORY2 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery2 += "\'" + iName + "\',";
//          sqlQuery2 += rPrice + ","; 
//          sqlQuery2 += iQuant + ","; 
//          sqlQuery2 += iCost + ","; 
//          sqlQuery2 += "\'" + iDesc + "\',";
//          sqlQuery2 += "'Canned'" + ")";
//          }
//          else if (boxCat.isSelected())
//          {
//         invent.get(newEdit).itemCost = iCost;
//         invent.get(newEdit).itemDescription = iDesc;
//         invent.get(newEdit).itemName = iName;
//         invent.get(newEdit).itemRetail = rPrice;
//         invent.get(newEdit).itemQty = iQuant;
//         invent.get(newEdit).category = 4;
//         invent.get(newEdit).cat = "Boxed";
//         sqlQuery3 = "insert into JAVAUSER.INVENTORY3 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery3 += "\'" + iName + "\',";
//          sqlQuery3 += rPrice + ",";
//          sqlQuery3 += iQuant + ","; 
//          sqlQuery3 += iCost + ","; 
//          sqlQuery3 += "\'" + iDesc + "\',";
//          sqlQuery3 += "'Boxed'" + ")";
//          
//          }
//          else if (bagCat.isSelected())
//          {
//         invent.get(newEdit).itemCost = iCost;
//         invent.get(newEdit).itemDescription = iDesc;
//         invent.get(newEdit).itemName = iName;
//         invent.get(newEdit).itemRetail = rPrice;
//         invent.get(newEdit).itemQty = iQuant;
//         invent.get(newEdit).category = 5;
//          invent.get(newEdit).cat = "Bagged";
//          sqlQuery4 = "insert into JAVAUSER.INVENTORY4 (ITEMNAME, ITEMSELL, ITEMQTY, ITEMCOST,ITEMDESCRIPTION, ITEMCATEGORY) VALUES (";
//          sqlQuery4 += "\'" + iName + "\',";
//          sqlQuery4 += rPrice + ",";
//          sqlQuery4 += iQuant + ","; 
//          sqlQuery4 += iCost + ","; 
//          sqlQuery4 += "\'" + iDesc + "\',";
//          sqlQuery4 += "'Bagged'" + ")";
//          }
//           
//          
//            for (int j = 0; j < invent.size(); j++)
//          {
//             
//              temp += invent.get(i).toString() + "";  
//          }
//        }
//            Test.setText(temp);
////            
////            sendDBCommand(sqlQuery); 
////        sendDBCommand1(sqlQuery1); 
////        sendDBCommand2(sqlQuery2); 
////        sendDBCommand3(sqlQuery3); 
////        sendDBCommand4(sqlQuery4); 
//            
//   

            
    
//    public void editAction (){
//      Stage editStage = new Stage();
//      GridPane editPane = new GridPane();
//      editPane.setAlignment(Pos.CENTER);
//      editPane.setVgap(20);
//      editPane.setHgap(20);
//      editPane.setStyle("-fx-background-color: lightgrey;");
////      ImageView image = new ImageView("grocery.jpg");
////      editPane.getChildren().add(image);
////      image.setFitHeight(150);
////      image.setFitWidth(150);
//      editPane.setPadding(new Insets(5,5,5,5));
//      
//      // Nodes
//      Text editTitle = new Text("Edit Items");
//      editTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
//      28));
//      editTitle.setFill(Color.BLUEVIOLET);
//      editPane.add(editTitle,1,0,2,1);
//      
//      ToggleGroup group = new ToggleGroup();
//        produceCat.setToggleGroup(group);
//        meatsCat.setToggleGroup(group);
//        canCat.setToggleGroup(group);
//        boxCat.setToggleGroup(group);
//        bagCat.setToggleGroup(group);
//        
//        
//        // Add nodes to pane
//        editPane.add(editChoice,0,1);
//        editPane.add(editItem,1,1,4,1);
//        
//        editPane.add(itemName,0, 2);
//        editPane.add(itmName, 1, 2,4,1);
//        
//        editPane.add(itemDesc,0,3);
//        editPane.add(itmDesc,1,3,4,1);
//        
//        editPane.add(itemCost,0,4);
//        editPane.add(itmCost,1,4,4,1);
//        
//        editPane.add(sellingPrice,0,5);
//        editPane.add(sellPrice,1,5,4,1);
//        
//        editPane.add(category,0,6);
//        editPane.add(produceCat,1,6);
//        editPane.add(meatsCat,2,6);
//        editPane.add(canCat,3,6);
//        editPane.add(boxCat,4,6);
//        editPane.add(bagCat,5,6);
//        editPane.add(editArea,0,7,6,4);
//        editPane.add(editDisplay, 0, 12);
//        editPane.add(quantity,0,11);
//        editPane.add(quant,1,11,4,1);
//        editPane.add(editSubmit,5,12);
//        
//        
//        
//        // Action
//        /*
//        SUBSTITUTE THE PRINT ALL ITEMS IN AN INVENTORY METHOD INTO THIS ACTION EVENT
//        */
//        editDisplay.setOnAction(e -> {
//            editArea.setText(invent.toString());
//        });
//        editSubmit.setOnAction(e -> {
//         Stage submitStage = new Stage();
//            GridPane submitPane = new GridPane();
//            submitPane.setAlignment(Pos.CENTER);
//            submitPane.setVgap(20);
//            submitPane.setHgap(20);
//            submitPane.setStyle("-fx-background-color: lightgrey;");
//            String submitItem = itmName.getText();
//            Text submitText = new Text(submitItem + " has been added to the inventory!");
//             submitPane.add(submitText,0,1);
////            clearEntries();
//             editItem();
////             showInventory();
////             showInventory1();
////             showInventory2();
////             showInventory3();
////             showInventory4();
//
//            
//        });
//         
     
        // Scene
//        Scene editScene = new Scene (editPane, 600, 600);
//        
//        // Stage 
//        editStage.setScene(editScene);
//        editStage.setTitle("Edit Item");
//        
//        editStage.show();
//        
//        
//        
//       
//        
//      
//  }
// Namit Kumar
//      public void printCategory()
//      {
//           
//          String temp = "";
//          for (int i = 0; i < invent.size(); i++)
//          {
//          if (invent.get(i).category == 1 && Produce.isSelected())
//           {
//               temp += "Produce Inventory" + "\n" + invent.get(i).toString();     
//           }
//          if (invent.get(i).category == 2 && Meats_Dairy.isSelected())
//          {
//             temp += "Meats/Dairy Inventory" + "\n" + invent.get(i).toString();
//          }
//          if (invent.get(i).category == 3 && Canned.isSelected())
//          {
//              temp += "Canned Inventory" + "\n" + invent.get(i).toString();
//          }
//          if (invent.get(i).category == 4 && Boxed.isSelected())
//          {
//              temp += "Boxed Inventory" + "\n" + invent.get(i).toString();
//          }
//          if (invent.get(i).category == 5 && Bagged.isSelected())
//          {
//              temp += "Bagged Inventory" + "\n" + invent.get(i).toString();
//          }
//          
//          
//           }
//          
//          Test.setText(temp);
//          
//      }
//      
//      
//      public void printCatActionWindow(int index)
//    {
//        //Test.setText("hello world");
//        Stage stage2 = new Stage();
//        stage2.setTitle("Category Popup Window!");
//        GridPane pane = new GridPane();
//        pane.setAlignment(Pos.CENTER);
//        pane.setVgap(20);  pane.setHgap(20);
//           
//        // Toggle group for radiobuttons
//        ToggleGroup catGroup = new ToggleGroup();
//        Produce.setToggleGroup(catGroup);
//        Meats_Dairy.setToggleGroup(catGroup);
//        Canned.setToggleGroup(catGroup);
//        Boxed.setToggleGroup(catGroup);
//        Bagged.setToggleGroup(catGroup);
//           
//        pane.add(Produce, 0, 0);
//        pane.add(Meats_Dairy, 0,1);
//        pane.add(Canned, 0, 2);
//        pane.add(Boxed,0,3);
//        pane.add(Bagged, 0, 4);        
//        stage2.setScene(new Scene(pane, 300, 350));
//        stage2.show();
//            
//        Produce.setOnAction( e-> {
//            Test.setText("Produce Category");
//            printCategory();
//            //String sqlQuery = "SELECT * FROM MHUMPH.PRODUCE WHERE CATEGORY = 'PRODUCE'";
//            //sendDBCommand(sqlQuery);
//            System.out.println(invent);
//        });
//        Meats_Dairy.setOnAction( e-> {
//            Test.setText("Meats/Dairy Category");
//            printCategory();
//        });
//        Canned.setOnAction( e-> {
//            Test.setText("Canned Category");
//            printCategory();
//        });
//        Boxed.setOnAction( e-> {
//            Test.setText("Boxed Category");
//            printCategory();
//        });
//        Bagged.setOnAction( e-> {
//            Test.setText("Bagged Category");
//            printCategory();
//        });
//            
//            
//    }
//  

//    }

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        launch(args);
    }

}