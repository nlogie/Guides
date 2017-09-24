import java.util.*;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.scene.control.cell.*; 
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.util.Callback;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class MainMenu extends Application {

	public static class Call {

		public final SimpleStringProperty agency;
		public final SimpleStringProperty phoneNumber;
	
		public Call(String agen, String pNum) {
			this.agency = new SimpleStringProperty(agen);
			this.phoneNumber = new SimpleStringProperty(pNum);
			
		}

        public String getAgency() {
        	return agency.get();
        }
        public void setAgency(String agen) {
        	agency.set(agen);
        }
        public String getPhoneNumber() {
        	return phoneNumber.get();
        }
        public void setPhoneNumber(String pNum) {
        	phoneNumber.set(pNum);
        }
	}
	
		private TableView<Call> numbersList = new TableView<Call>();
		private final ObservableList<Call> numbers =
		        FXCollections.observableArrayList();
		        		
		        
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	//I FIGURED IT OUT
	public static Stage theStage = new Stage();
	public static Scene theMenu;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		theStage = primaryStage;
		primaryStage.setTitle("EOD Team Chief Guide");
		
		
		Scene menu, nuke, wmd, chem, aircraft, uxo, ied, phoneNumbers;
		
		// Nuke Nav
		Button menuButNuke = new Button("\u2B05 " + "Back to Main Menu");
		menuButNuke.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuButNuke.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuButNuke.setPadding(new Insets(10, 10, 10, 10));
		//WMD Nav
		Button menuButWMD = new Button("\u2B05 " + "Back to Main Menu");
		menuButWMD.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuButWMD.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuButWMD.setPadding(new Insets(10, 10, 10, 10));
		// Chem Nav
		Button menuButChem = new Button("\u2B05 " + "Back to Main Menu");
		menuButChem.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuButChem.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuButChem.setPadding(new Insets(10, 10, 10, 10));
		//UXO Nav
		Button menuButUXO = new Button("\u2B05 " + "Back to Main Menu");
		menuButUXO.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuButUXO.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuButUXO.setPadding(new Insets(10, 10, 10, 10));
		//Aircraft Nav
		Button menuButAircraft = new Button("\u2B05 " + "Back to Main Menu");
		menuButAircraft.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuButAircraft.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuButAircraft.setPadding(new Insets(10, 10, 10, 10));
		//IED Nav
		Button menuButIED = new Button("\u2B05 " + "Back to Main Menu");
		menuButIED.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuButIED.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuButIED.setPadding(new Insets(10, 10, 10, 10));
		//Nuke Button
		Button nukeBut = new Button("Nuclear");
		nukeBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #DC9656; -fx-text-fill: white");
		nukeBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		nukeBut.setPadding(new Insets(20, 25, 20, 25));
		//WMD Button
		Button wmdBut = new Button("WMD");
		wmdBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #BA8BAF; -fx-text-fill: white");
		wmdBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		wmdBut.setPadding(new Insets(20, 25, 20, 25));
		//Chem Button
		Button chemBut = new Button("Chemical");
		chemBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #A1B56C; -fx-text-fill: white");
		chemBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		chemBut.setPadding(new Insets(20, 25, 20, 25));
		//Aircraft Button
		Button aircraftBut = new Button("Aircraft");
		aircraftBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #7CAFC2; -fx-text-fill: white");
		aircraftBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		aircraftBut.setPadding(new Insets(20, 25, 20, 25));
		//UXO Button
		Button uxoBut = new Button("UXO");
		uxoBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #F7CA88; -fx-text-fill: white");
		uxoBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		uxoBut.setPadding(new Insets(20, 25, 20, 25));
		//IED Button
		Button iedBut = new Button("IED");
		iedBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #A16946; -fx-text-fill: white");
		iedBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		iedBut.setPadding(new Insets(20, 25, 20, 25));
		//Phone Numbers Button
		Button phoneNum = new Button("Phone Numbers");
		phoneNum.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #86C1B9; -fx-text-fill: white");
		phoneNum.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		phoneNum.setPadding(new Insets(10, 10, 10, 10));
		phoneNum.setAlignment(Pos.BASELINE_LEFT);
		
		//Add Phone Number Button
		Button addPhone = new Button("Add Contact");
		//Text Fields
		TextField contact = new TextField();
		contact.setPromptText("Add new contact...");
		TextField foneNumber = new TextField();
		foneNumber.setPromptText("Enter phone number...");
		
		//Label
		Label teamChiefGuide = new Label("EOD Team Chief Guide");
		teamChiefGuide.setTextFill(Color.GOLD);
		teamChiefGuide.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 40));
		teamChiefGuide.setAlignment(Pos.CENTER);
		Label phoneNUMBERS = new Label("Phone Numbers");
		phoneNUMBERS.setTextFill(Color.GOLD);
		phoneNUMBERS.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 40));
		phoneNUMBERS.setAlignment(Pos.CENTER);
		//Layouts
		BorderPane layoutMain = new BorderPane();
		BorderPane layoutNuke = new BorderPane();
		BorderPane layoutWMD = new BorderPane();
		BorderPane layoutChem = new BorderPane();
		BorderPane layoutAircraft = new BorderPane();
		BorderPane layoutUXO = new BorderPane();
		BorderPane layoutIED = new BorderPane();
		BorderPane layoutPhoneNumbers = new BorderPane();
		HBox navMain = new HBox(23);
		HBox navBotMain = new HBox();
		HBox navNuke = new HBox(100);
		HBox navWMD = new HBox(100);
		HBox navChem = new HBox(100);
		HBox navUXO = new HBox(100);
		HBox navAircraft = new HBox(100);
		HBox navIED = new HBox(100);
		HBox navPhone = new HBox(560);
		HBox addPhoneNumber = new HBox(10);
		VBox crabNlabel = new VBox(60);
		VBox phoneList = new VBox(5);
		VBox contactAndPhone = new VBox(5);
		
		// EOD CRAB
		Image crabEOD = new Image("file:/Users/KC/Desktop/EOD TEAM CHIEF GUIDE/crabEOD.png");
		ImageView viewCrabEOD = new ImageView(crabEOD);
		viewCrabEOD.setFitHeight(300);
		viewCrabEOD.setFitWidth(400);
		
		//TABLES
		TableColumn agencyCol = new TableColumn("Agency");
		agencyCol.setMinWidth(250);
		agencyCol.setCellValueFactory(new PropertyValueFactory<Call, String>("Agency"));

 
        TableColumn phoneNumCol = new TableColumn("Phone Number");
        phoneNumCol.setMinWidth(250);
        phoneNumCol.setCellValueFactory(new PropertyValueFactory<Call, String>("PhoneNumber"));
        
        numbersList.setItems(numbers);     
        numbersList.getColumns().addAll(agencyCol, phoneNumCol);
        numbersList.setEditable(true);
		
		//setting up layouts
		navMain.getChildren().addAll(nukeBut, wmdBut, chemBut, aircraftBut, uxoBut, iedBut, close());
		navMain.setAlignment(Pos.CENTER);
		navMain.setPadding(new Insets(10, 10, 0, 10));
		navBotMain.getChildren().add(phoneNum);
		navBotMain.setAlignment(Pos.CENTER_RIGHT);
		navBotMain.setPadding(new Insets(10, 10, 0, 10));
		crabNlabel.getChildren().addAll(teamChiefGuide, viewCrabEOD);
		crabNlabel.setAlignment(Pos.CENTER);
		navNuke.getChildren().addAll(menu(), combo(), close());
		navNuke.setAlignment(Pos.CENTER);
		navNuke.setPadding(new Insets(10, 10, 0, 10));
		navWMD.getChildren().addAll(menu(), combo(), close());
		navWMD.setAlignment(Pos.CENTER);
		navWMD.setPadding(new Insets(10, 10, 0, 10));
		navChem.getChildren().addAll(menu(), combo(), close());
		navChem.setAlignment(Pos.CENTER);
		navChem.setPadding(new Insets(10, 10, 0, 10));
		navUXO.getChildren().addAll(menu(), combo(), close());
		navUXO.setAlignment(Pos.CENTER);
		navUXO.setPadding(new Insets(10, 10, 0, 10));
		navAircraft.getChildren().addAll(menu(), combo(), close());
		navAircraft.setAlignment(Pos.CENTER);
		navAircraft.setPadding(new Insets(10, 10, 0, 10));
		navIED.getChildren().addAll(menu(), combo(), close());
		navIED.setAlignment(Pos.CENTER);
		navIED.setPadding(new Insets(10, 10, 0, 10));
		navPhone.getChildren().addAll(menu(), close());
		navPhone.setAlignment(Pos.CENTER);
		navPhone.setPadding(new Insets(10, 10, 10, 10));
		phoneList.getChildren().addAll(phoneNUMBERS, numbersList, addPhoneNumber);
		phoneList.setAlignment(Pos.CENTER);
		contactAndPhone.getChildren().addAll(contact, foneNumber);
		addPhoneNumber.getChildren().addAll(addPhone, contactAndPhone);	
		addPhoneNumber.setAlignment(Pos.CENTER);
		layoutMain.setTop(navMain);
		layoutMain.setCenter(crabNlabel);
		layoutMain.setBottom(navBotMain);
		layoutMain.setStyle("-fx-background-color: #181818");
		layoutNuke.setTop(navNuke);
		layoutNuke.setCenter(report());
		layoutNuke.setStyle("-fx-background-color: #181818");
		layoutWMD.setTop(navWMD);
		layoutWMD.setCenter(report());
		layoutWMD.setStyle("-fx-background-color: #181818");
		layoutChem.setTop(navChem);
		layoutChem.setCenter(report());
		layoutChem.setStyle("-fx-background-color: #181818");
		layoutUXO.setTop(navUXO);
		layoutUXO.setCenter(report());
		layoutUXO.setStyle("-fx-background-color: #181818");
		layoutAircraft.setTop(navAircraft);
		layoutAircraft.setCenter(report());
		layoutAircraft.setStyle("-fx-background-color: #181818");
		layoutIED.setTop(navIED);
		layoutIED.setCenter(report());
		layoutIED.setStyle("-fx-background-color: #181818");
		layoutPhoneNumbers.setCenter(phoneList);
		layoutPhoneNumbers.setTop(navPhone);
		layoutPhoneNumbers.setStyle("-fx-background-color: #181818");
		
		//Initialize Scenes and set up stage
		menu = new Scene(layoutMain, 800, 600);
		theMenu = menu;
		nuke = new Scene(layoutNuke, 800, 600);
		wmd = new Scene(layoutWMD, 800, 600);
		chem = new Scene(layoutChem, 800, 600);
		uxo = new Scene(layoutUXO, 800, 600);
		aircraft = new Scene(layoutAircraft, 800, 600);
		ied = new Scene(layoutIED, 800, 600);
		phoneNumbers = new Scene(layoutPhoneNumbers, 800, 600);
		primaryStage.setScene(menu);
		primaryStage.show();
		primaryStage.setResizable(false);
		
		
		// Set button Actions
		
		nukeBut.setOnAction(e -> primaryStage.setScene(nuke));
		
		wmdBut.setOnAction(e -> primaryStage.setScene(wmd));
		
		chemBut.setOnAction(e -> primaryStage.setScene(chem));
		
		uxoBut.setOnAction(e -> primaryStage.setScene(uxo));
		
		aircraftBut.setOnAction(e -> primaryStage.setScene(aircraft));
		
		iedBut.setOnAction(e -> primaryStage.setScene(ied));
		
		phoneNum.setOnAction(e -> primaryStage.setScene(phoneNumbers));
		
		addPhone.setOnAction(new EventHandler<ActionEvent>(){
			@Override public void handle(ActionEvent e) {
				numbers.add(new Call(contact.getText(), foneNumber.getText()));
				contact.clear();
				foneNumber.clear();
			}
			
		});
	
		
		
		
	}
	
	/*The plan for the combo box is to provide a drop down menu of past reports 
	 * and when selected from the menu, it will populate the text area below with 
	 * the report details
	 */
	private static ComboBox<String> combo(){
		
		ObservableList<String> list = FXCollections.observableArrayList();
		list.add("EOD report 1");
		list.add("EOD report 2");
		list.add("EOD report 3");
		ComboBox<String> comboB = new ComboBox<String>();
		comboB.setItems(list);
		comboB.setPrefSize(350, 10);
		
		
		return comboB;
	}
	
	
	private static TextArea report(){
		
		TextArea reportEOD = new TextArea();
		
		reportEOD.setPromptText("Enter report details here...");
		reportEOD.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 10));
		reportEOD.setWrapText(true);
		reportEOD.setMaxSize(750, 450);
		
		return reportEOD;
		
	}
	
	private static Button close(){
		
		Button closeBut = new Button("Close");
		closeBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		closeBut.setFont(Font.font("Avenir", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 14));
		closeBut.setPadding(new Insets(15, 15, 15, 15));
		closeBut.setOnAction(e -> theStage.close());
		return closeBut;
		
	}
	

	private static Button menu(){
		
		Button menuBut = new Button("\u2B05 " + "Back to Main Menu");
		menuBut.setStyle("-fx-background-radius: 15, 15, 15, 15; -fx-background-color: #AB4642; -fx-text-fill: white");
		menuBut.setFont(Font.font("Avenir", FontWeight.NORMAL, FontPosture.REGULAR, 14));
		menuBut.setPadding(new Insets(10, 10, 10, 10));
		menuBut.setOnAction(e -> theStage.setScene(theMenu));
		
		return menuBut;
	}
	

}
