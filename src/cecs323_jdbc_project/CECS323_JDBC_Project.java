package cecs323_jdbc_project;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CECS323_JDBC_Project {

    public static void main(String[] args) {
        
        // Init connection
        Connection con = null;
        Statement st = null;
        // DB Details
        String dbName = "jdbc_project";
        String dbUser = "root";
        String dbPass = "pass";
        String dbURL = "jdbc:derby://localhost:1527/" + dbName + ";user="+ dbUser + ";password=" + dbPass;
        
        // Start DB Connection
        try {
            con = DriverManager.getConnection(dbURL);
        } catch (SQLException se) {
            se.printStackTrace();
        }
        
        menu(con, st);
    }
    
    public static void menu(Connection _con, Statement _st) {
        
        // Variables
        String menuSelection;
        Scanner menuInput = new Scanner(System.in);
        
        // Menu
        System.out.println("\t-----\t Menu \t -----");
        System.out.println("[1]\tList Groups");
        System.out.println("[2]\tSearch by Groups");
        System.out.println("------------------------");
        System.out.println("[3]\tList Publishers");
        System.out.println("[4]\tSearch by Publishers");
        System.out.println("------------------------");
        System.out.println("[5]\tList Books");
        System.out.println("[6]\tSearch by Books");
        System.out.println("------------------------");
        System.out.println("[7]\tAdd New Book");
        System.out.println("[8]\tAdd & Replace Publisher");
        System.out.println("------------------------");
        System.out.println("[0]\tDelete Book");
        System.out.println("------------------------");
        System.out.println("ANY OTHER KEY TO CLOSE");
        System.out.println("\n\nSelection: ");
        menuSelection = menuInput.nextLine();
        
        
        // Recursive Menu
        switch(menuSelection) {
            case "1":
                System.out.println("------- List Groups -------");
                System.out.println("---------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "2":
                System.out.println("------- Search By Groups -------");
                System.out.println("--------------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "3":
                System.out.println("------- List Publishers -------");
                System.out.println("-------------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "4":
                System.out.println("------- Search By Publishers -------");
                System.out.println("------------------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "5":
                System.out.println("------- List Books -------");
                System.out.println("--------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "6":
                System.out.println("------- Search By Books -------");
                System.out.println("-------------------------------");
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "7":
                System.out.println("------- Add Book -------");
                System.out.println("------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "8":
                System.out.println("------- Add & Replace Publisher -------");
                System.out.println("---------------------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            case "0":
                System.out.println("------- Delete Book -------");
                System.out.println("---------------------------");
                
                
                // function();
                
                
                System.out.println("---------------------------------------\n\n");
                menu(_con, _st);
            default:
                System.out.println("Closing...");  
                
                //Cleanup
                {
                    try {
                        _st.close();
                        _con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(CECS323_JDBC_Project.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                System.exit(0);
                break;
        }
    }
    
    public static void listGroups(Connection _con, Statement _st) {
        // TODO Set up statement & query to list all groups in DB
    }
    
    public static void searchGroups(Connection _con, Statement _st) {
        // TODO Set up statement & query to find data by Groups
    }
    
    public static void listTitles(Connection _con, Statement _st) {
        // TODO Set up statement & query to list all titles in DB
    }
    
    public static void searchTitles(Connection _con, Statement _st) {
        // TODO Set up statement & query to find data by Titles
    }
    
    public static void removeBook(Connection _con, Statement _st) {
        // TODO Set up statement & query to delete a book (by title).
    }
    
    
}