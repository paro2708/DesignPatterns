import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    //0 Buyer 1 Seller
    int userType = -1;
    public static String username;
    public String password;
    public int login() throws IOException {
        System.out.println("Enter Username");
        Scanner sc = new Scanner(System.in);
        username = sc.next();
        System.out.println("Enter Password");
        password = sc.next();
        if(validateBuyer(username, password) == 0) {
            System.out.println("Hello buyer!");
            userType = 0;
        } else if (validateSeller(username, password) == 1) {
            System.out.println("Hello seller!");
            userType = 1;
        } else {
            System.out.println("Invalid credentials");
            System.exit(-1);
        }
        return userType;
    }

    public int validateBuyer(String username, String password) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\Paromita Roy\\Documents\\Fall22\\SER515\\Assignments\\DP\\DP\\src\\BuyerInfo.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();

        String strToMatch = username + ":" + password;

        for(String s : listOfLines) {
            if (strToMatch.equalsIgnoreCase(s)) {
                userType = 0;
                break;
            }
        }
        return userType;
    }

    public int validateSeller(String username, String password) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\Paromita Roy\\Documents\\Fall22\\SER515\\Assignments\\DP\\DP\\src\\SellerInfo.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();

        String strToMatch = username + ":" + password;

        for(String s : listOfLines) {
            if (strToMatch.equalsIgnoreCase(s)) {
                userType = 1;
                break;
            }
        }
        return userType;
    }
}
