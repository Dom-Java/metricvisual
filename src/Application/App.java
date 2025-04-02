package Application;
import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.*;



public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("C:\\Users\\dbhol\\Downloads\\metricvisual\\src\\Application\\metercon.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
        metricMethod(); //Initiates the start menu.
        mainBody(); //This method provides the functionality behind the start menu.

        //The code below handles errors in the program and ensures that the main menu is triggered if an invalid input is recognized.
        while (((desired_con != 'A') && (desired_con != 'B') && (desired_con != 'C') && (desired_con != 'E'))) {
            System.out.println("invalid argument. Try again");
            metricMethod(); 
            mainBody();
        }
    }

    public static int selection;
    public static char desired_con; //conversion option input, accepts A, B, or C.
    public static double mi_to_nmi; //conversion option variable for miles to nautical miles.
    public static double in_to_cm; //conversion option variable for inches to cenitmeters.
    public static double ft_to_dm; //conversion option variable for feet to decimeters.
    public static double yd_to_in; //conversion option variable for yards to inches.
    public static double nmi_to_mi; //conversion option variable for nautical miles to miles.
    public static double cm_to_in; //conversion option variable for centimeters to inches.
    public static double dm_to_ft; //conversion option variable for decimeters to feet
    public static double in_to_yd; //conversion option variable for yards to inches.
    public static Scanner scanner = new Scanner(System.in); //defines the scanner variable for the java utility package.
    
    

    
    
    //Below is the main class for the program, it runs the methods needed to intiate the main menu.

        //This is a method that prints the main menu for the program, as well as initiating the first scanner input.
    static void metricMethod() {
        
        System.out.println("---------------------------------");
        System.out.println("Options(type the desired letter for the following): ");
        System.out.println("A: for converstions including miles");
        System.out.println("B: for converstions including inches");
        System.out.println("C: for converstions including feet");
        System.out.println("E: Exit");
        System.out.println("---------------------------------");
        System.out.print("Type the letter for your desired converstion: ");
        desired_con = scanner.next().charAt(0); //Tells the program to read the first index of the main menu input (desired_con).
    }

    //This method defines the functionality of the miles option in the main menu.
    static void milesMethod() {
        
        if ((selection == 1) || (selection == 2)) {
            //if the input is both 1 and A, the following code will execute.
            if (selection == 1 && desired_con == 'A') {
                System.out.println("you picked miles to nautical miles(enter # of nautical miles):");
                double miles = scanner.nextDouble();
                mi_to_nmi = miles * .86897624;
                System.out.println("Nautical Miles: " + mi_to_nmi);
                
                
                
            }
            //if the input is both 2 and A, the following code will execute.
            if (selection == 2 && desired_con == 'A') {
                System.out.println("You picked nautical miles to miles(enter # of nautical miles):");
                double nauticalMiles = scanner.nextDouble();
                nmi_to_mi = nauticalMiles * 1.15077945;
                System.out.println("Miles: " + nmi_to_mi);
                
                
                
            }
           
        } 
        else {
            System.out.println("Invalid Input");
        }
        metricMethod();
    }
    //This method provides the functionality to all conversions related to inches.
    static void inchesMethod() {
        if ((selection == 1) || (selection == 2) || (selection == 3) || (selection == 4)) {

            //if the input is both 1 and B, the following code will execute.
            if (selection == 1 && desired_con == 'B') {
                System.out.println("You picked inches to centimeters (enter the # of inches):");
                double inches = scanner.nextDouble();
                in_to_cm = inches * 2.54;
                System.out.println("centimeters: " + in_to_cm);
                

            }
            //if the input is both 2 and B, the following code will execute.
            if (selection == 2 && desired_con == 'B') {
                System.out.println("You picked centimeters to inches (enter the # of centimeters):");
                double centimeters = scanner.nextDouble();
                cm_to_in = centimeters * .39370079;
                System.out.println("Inches: " + cm_to_in);
                
            }
            //if the input is both 3 and B, the following code will execute.
            if (selection == 3 && desired_con == 'B') {
                System.out.println("You picked inches to yards(enter the # of inches):");
                double inches = scanner.nextDouble();
                in_to_yd = inches * .02777778;
                System.out.println("Yards: " + in_to_yd);
                
            }
            //if the input is both 4 and B, the following code will execute.
            if (selection == 4 && desired_con == 'B') {
                System.out.println("You picked yards to inches (enter the # of centimeters:)");
                double yards = scanner.nextDouble();
                yd_to_in = yards * 36;
                System.out.println("Inches: " + yd_to_in);
                
            }
        } 
        //error notification. 
        else {
            System.out.println("Invalid Input.");
            
        }
        //returns the user to the main selection menu
        metricMethod();
    }
    //This method provides functionality to all conversions relating to feet
    static void feetMethod(){
        if ((selection == 1) || (selection == 2)) {

            //if the input is both 1 and C, the following code will execute.
            if (selection == 1 && desired_con == 'C') {
                System.out.println("You picked feet to decimeters (enter the # of feet):");
                double feet = scanner.nextDouble();
                ft_to_dm = feet * 3.048;
                System.out.println("decimeters: " + ft_to_dm);
                
            }
            //if the input is both 2 and C, the following code will execute.
            if (selection == 2 && desired_con == 'C') {
                System.out.println("You picked decimeters to feet (enter the # decimeters):");
                double decimeters = scanner.nextDouble();
                dm_to_ft = decimeters * .32808399;
                System.out.println("feet: " + dm_to_ft);
                
            }
        } 
        else {
            System.out.println("Invalid Input."); //More error notifications
            
            
        }
        metricMethod();
        
    }//This method provides the prompt and input instructions for the inches option of the main menu.
    static void inchesPrompt() {
                
                System.out.println("---------------------------------------");
                System.out.println("Options(pick your converstion):");
                System.out.println("1: for inches to centimeters");
                System.out.println("2: for centimeter to inches");
                System.out.println("3: for inches to yards");
                System.out.println("4: for yard to inches");
                System.out.println("Type 1,2,3, or 4: ");
                selection = scanner.nextInt();
                
                inchesMethod();
    }//This method provides the prompt and input instructions for the miles option of the main menu
    static void milesPrompt() {
                
                System.out.println("---------------------------------------");
                System.out.println("Options(pick your converstion):");
                System.out.println("1: for miles to nuatical miles");
                System.out.println("2: for nautical miles to miles");
                System.out.println("Type 1 or 2: ");
                selection = scanner.nextInt();

                milesMethod();
                
    }//This method provides the prompt and input instructions for the feet option of the main menu.
    static void feetPrompt(){
        
        System.out.println("---------------------------------------");
        System.out.println("Options(pick your converstion):");
        System.out.println("1: for feet to decimeters");
        System.out.println("2: for decimeters to feet");
        System.out.println("Type 1 or 2: ");
        selection = scanner.nextInt();
        feetMethod();
    }
    //This method provides the functionality behind the intial input in the main menu.
    static void mainBody(){
        while (((desired_con == 'A') || (desired_con == 'B') || (desired_con == 'C') || (desired_con == 'E'))) {

            //This allows a way for the user to exit the program.
            if (desired_con == 'E') {
                System.out.println("___________________________________________________________");
                System.out.println("|Thank you for using the METRIC converter, have a nice day|");
                System.out.println("|_________________________________________________________|");
                break;
            }       


            while (desired_con == 'A') {
                milesPrompt();    
            }
     
            while (desired_con == 'B') {
                inchesPrompt();
            }
    
            while (desired_con == 'C') {
                feetPrompt();
            }
    

        }
        
    }
    

}
