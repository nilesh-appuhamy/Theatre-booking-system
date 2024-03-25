//Part A

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;


public class Theatre { //create a class called Theatre

    static int[] row_1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] row_2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] row_3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
    static int row_N;
    static int seat_N;
    static Scanner input = new Scanner(System.in);
    static ArrayList<Ticket> ticketsList = new ArrayList<>(); // create an array list name as ticketsList


    public static void main(String[] args) {//create the main method
        System.out.println("\t\t Welcome to the New Theatre");

        System.out.println("Seats available in \"0\" mark:");
        System.out.println("\n");
        System.out.print("ROW 1");
        System.out.print("\t\t\t\t");
        for (int i = 0; i < row_1.length; i++) {
            if (i == 6) {
                System.out.print(" ");
            }
            System.out.print(row_1[i]);
        }

        System.out.println("\n");
        System.out.print("ROW 2");
        System.out.print("\t\t\t  ");
        for (int i = 0; i < row_2.length; i++) {
            if (i == 8) {
                System.out.print(" ");
            }
            System.out.print(row_2[i]);
        }

        System.out.println("\n");
        System.out.print("ROW 3");
        System.out.print("\t\t\t");
        for (int i = 0; i < row_3.length; i++) {
            if (i == 10) {
                System.out.print(" ");
            }
            System.out.print(row_3[i]);
        }

        System.out.println("\n");
        Scanner input = new Scanner(System.in);

        while (true) {
            try {


//                Task 2
                System.out.println("-----------------------------------------------");
                System.out.println("Please select an option:");
                System.out.println("1) Buy a ticket");
                System.out.println("2) Print seating area");
                System.out.println("3) cancel ticket");
                System.out.println("4) List available seats");
                System.out.println("5) Save to file");
                System.out.println("6) Load from file");
                System.out.println("7) Print ticket information and total price");
                System.out.println("8) Sort tickets by price");
                System.out.println("0) Quit");
                System.out.println("-----------------------------------------------");


                System.out.print("\nEnter option: ");//display this to get user input
                int option = input.nextInt();// this value is compared with the values of each case


                switch (option) {//use switch statement instead of writing many if...else statement
                    case 1:
                        buy_ticket();
                        System.out.print("If you want to continue with another option " +
                                "enter 'y' or to quite press 'q': ");
                        String option_2 = input.next();
                        if (option_2.equals("y")) {
                            continue;
                        } else if (option_2.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }
                        break;
                    case 2:
                        print_seating_area();
                        System.out.print("If you want to continue with another option " +
                                "enter 'y' or to quite press 'q': ");
                        String option_3 = input.next();
                        if (option_3.equals("y")) {
                            continue;
                        } else if (option_3.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        cancel_ticket();
                        System.out.print("If you want to continue with another option enter 'y' or to quite press 'q': ");
                        String option_4 = input.next();
                        if (option_4.equals("y")) {
                            continue;
                        } else if (option_4.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }//when reaches it breaks out of the switch block
                        break;
                    case 4:
                        show_available();
                        System.out.print("If you want to continue with another option enter 'y' or to quite press 'q': ");
                        String option_5 = input.next();
                        if (option_5.equals("y")) {
                            continue;
                        } else if (option_5.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }//when reaches it breaks out of the switch block
                        break;
                    case 5:
                        save();
                        System.out.print("If you want to continue with another option enter 'y' or to quite press 'q': ");
                        String option_6 = input.next();
                        if (option_6.equals("y")) {
                            continue;
                        } else if (option_6.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }

                    case 6:
                        load();
                        System.out.print("If you want to continue with another option enter 'y' or to quite press 'q': ");
                        String option_7 = input.next();
                        if (option_7.equals("y")) {
                            continue;
                        } else if (option_7.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }
                        break;
                    case 7:
                        Ticket_info_price();
                        System.out.print("If you want to continue with another option enter 'y' or to quite press 'q': ");
                        String option_8 = input.next();
                        if (option_8.equals("y")) {
                            continue;
                        } else if (option_8.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }
                        break;
                    case 8:
                        sort_ticket();
                        System.out.print("If you want to continue with another option enter 'y' or to quite press 'q': ");
                        String option_9 = input.next();
                        if (option_9.equals("y")) {
                            continue;
                        } else if (option_9.equals("q")) {
                            System.exit(0);
                        } else {
                            continue;
                        }
                    default:
                        System.out.println("Invalid option, Enter a valid option.");
                }
            } catch (Exception e) {
                System.out.println(" Invalid enter..please check option you enter!");
            }
        }
    }

    public static void inputCheck() {
        System.out.println("Enter a row and seat number to reserve : ");
        try {
            //block of code to be tested for errors while it is being executed
            System.out.print("Enter row number: ");
            row_N = input.nextInt();

            System.out.print("Enter seat number: ");
            seat_N = input.nextInt();
        } catch (Exception e) {
            //define a block of code to be executed, if an error occurs in the try block.
            System.out.println("Invalid inputs. Please check row & seat number: ");
            //this will pass the values that assign by the user to next executions
        }
    }

    //Task 3
    public static void buy_ticket() {
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your surname: ");
        String surname = input.next();
        System.out.print("Enter your email: ");
        String email = input.next();
        Person person = new Person(name, surname, email);

        boolean ticketReserved = false;

        while (!ticketReserved) {
            inputCheck();

            // Check the inputs from the user, the row and seat numbers are correct.
            if (row_N <= 3 && seat_N < 21) {
                switch (row_N) {
                    case 1:
                        if ((seat_N > 0) && (seat_N <= 12) && (row_1[seat_N - 1] == 0)) {
                            row_1[seat_N - 1] = 1;
                            System.out.println("Successfully You have reserved seat number " + seat_N + " in row number 1");
                            System.out.print("Enter the ticket price: ");
                            double price1 = input.nextDouble();
                            Ticket obj = new Ticket(row_N, seat_N, price1, person);
                            ticketsList.add(obj);
                            ticketReserved = true;
                        } else {
                            System.out.println("Sorry. Already reserved that seat or the seat number you entered has not in the 1st row");
                        }
                        break;

                    case 2:
                        if ((seat_N > 0) && (seat_N <= 16) && (row_2[seat_N - 1] == 0)) {
                            row_2[seat_N - 1] = 1;
                            System.out.println("You have reserved seat number " + seat_N + " in row number 2");
                            System.out.print("Enter the ticket price: ");
                            double price = input.nextDouble();
                            Ticket obj = new Ticket(row_N, seat_N, price, person);
                            ticketsList.add(obj);
                            ticketReserved = true;
                        } else {
                            System.out.println("Sorry. Already reserved that seat or the seat number you entered has not in the 1st row");
                        }
                        break;

                    case 3:
                        if ((seat_N > 0) && (seat_N <= 20) && (row_3[seat_N - 1] == 0)) {
                            row_3[seat_N - 1] = 1;
                            System.out.println("You have reserved seat number " + seat_N + " in row number 2");
                            System.out.print("Enter the ticket price: ");
                            double price = input.nextDouble();
                            Ticket obj = new Ticket(row_N, seat_N, price, person);
                            ticketsList.add(obj);
                            ticketReserved = true;
                        } else {
                            System.out.println("Sorry. Already reserved that seat or the seat number you entered has not in the 1st row");
                        }
                        break;
                }
            }
        }
    }


    //Task 4

    public static void print_seating_area() {

        System.out.println("\t\t\t\t\t\t\t***********");
        System.out.println("\t\t\t\t\t\t\t*  STAGE  *");
        System.out.println("\t\t\t\t\t\t\t***********");

        System.out.print("\t\t\t\t\t\t\t");
        for (int i = 0; i < row_1.length; i++) {
            if (i == 6) {
                System.out.print(" ");
                continue;
            }
            if (row_1[i] == 1) {
                System.out.print("X");
            } else {
                System.out.print("0");
            }
        }

        System.out.println("\n");
        System.out.print("\t\t\t\t\t\t  ");
        for (int i = 0; i < row_2.length; i++) {
            if (i == 8) {
                System.out.print(" ");
                continue;
            }
            if (row_2[i] == 1) {
                System.out.print("X");
            } else {
                System.out.print("0");
            }
        }

        System.out.println("\n");
        System.out.print("\t\t\t\t\t    ");
        for (int i = 0; i < row_3.length; i++) {
            if (i == 10) {
                System.out.print(" ");
                continue;
            }
            if (row_3[i] == 1) {
                System.out.print("X");
            } else {
                System.out.print("0");
            }
        }
        System.out.println("\n");
    }

    //task 5
    public static void cancel_ticket() {
        while (true) {
            inputCheck();
            // Check the inputs from the user, the row and seat numbers are correct.
            if (row_N <= 3 && seat_N < 21) {
                switch (row_N) {
                    case 1:
                        if ((seat_N > 0) && (seat_N <= 12) && (row_1[seat_N - 1] == 1)) {
                            row_1[seat_N - 1] = 0;
                            System.out.println("Successfully You have canceled seat number " + seat_N + " in row number 1");
                        } else {
                            System.out.println("Sorry.Already available that seat or the seat number you entered has not in the 1st row");
                        }
                        break;

                    case 2:
                        if ((seat_N > 0) && (seat_N <= 16) && (row_2[seat_N - 1] == 1)) {
                            row_2[seat_N - 1] = 0;
                            System.out.println("Successfully You have canceled seat number " + seat_N + " in row number 2");
                        } else {
                            System.out.println("Sorry.Already available that seat or the seat number you entered has not in the 2nd row ");
                        }
                        break;

                    case 3:
                        if ((seat_N > 0) && (seat_N <= 20) && (row_3[seat_N - 1] == 1)) {
                            row_3[seat_N - 1] = 0;
                            System.out.println("Successfully You have canceled seat number " + seat_N + " in row number 1");
                        } else {
                            System.out.println("Sorry.Already available that seat or the seat number you entered has not in the 3rd row ");
                        }
                        break;
                }
                break;
            } else {
                System.out.println("Invalid row number or seat number please check again");
            }

        }

    }

    public static void show_available() {
        int row_number = 3;
        int rows;
        System.out.print("Seats available in row 1: ");

        for (rows = 1; rows <= row_number; rows++) {
            if (rows == 1) {
                for (int i = 0; i < row_1.length; i++) {
                    if (row_1[i] == 1) {
                        continue;
                    }
                    System.out.print((i + 1) + ", ");

                }
                System.out.print("\n");

            } else if (rows == 2) {
                System.out.print("Seats available in row 2: ");
                for (int i = 0; i < row_2.length; i++) {
                    if (row_2[i] == 1) {
                        continue;
                    }
                    System.out.print((i + 1) + ", ");

                }
                System.out.println();

            } else {
                System.out.print("Seats available in row 3: ");
                for (int i = 0; i < row_3.length; i++) {
                    if (row_3[i] == 1) {
                        continue;
                    }
                    System.out.print((i + 1) + ", ");
                }
            }

        }
        System.out.println("\n");
    }

    public static void save() {
        try {
            FileWriter outputFile = new FileWriter("text file.txt");
            outputFile.write("ROW 01: ");
            int count = 1;
            for (int elements : row_1) {

                if (elements == 1) {
                    outputFile.write("x");
                } else {
                    outputFile.write("0");
                }
                count++;
            }

            outputFile.write("\n");
            System.out.println();
            outputFile.write("ROW 02: ");
            int count1 = 1;
            for (int element : row_2) {
                if (element == 1) {
                    outputFile.write("x");
                } else {
                    outputFile.write("0");
                }
                count1++;
            }


            outputFile.write("\n");
            outputFile.write("ROW 03: ");
            int count2 = 1;
            for (int element : row_3) {
                if (element == 1) {
                    outputFile.write("x");
                } else {
                    outputFile.write("0");
                }
                count2++;
            }
            outputFile.close();
            System.out.println("Successfully saved to the file.");

        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }


    }

    public static void load() {
        try {
            File file = new File("text file.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String element = reader.nextLine();
                System.out.println(element);

            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Error while reading a file.");
            e.printStackTrace();
        }


    }

    public static void Ticket_info_price() {
        double totalPrice = 0.00;

        for (Ticket t : ticketsList) {
            t.print();
            totalPrice = totalPrice + t.getPrice();
        }

        System.out.println("Total Price: " + totalPrice);
    }

    public static ArrayList<Ticket> sort_ticket() {
        ArrayList<Ticket> sortedTickets = ticketsList;

        sortedTickets.sort((t1, t2) -> Double.compare(t1.getPrice(), t2.getPrice()));

        for (Ticket ticket : sortedTickets) {
            ticket.print();
        }

        return sortedTickets;
    }


}

