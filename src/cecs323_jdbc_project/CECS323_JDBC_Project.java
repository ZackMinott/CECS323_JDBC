package cecs323_jdbc_project;

import java.sql.*;
import java.util.Scanner;


public class CECS323_JDBC_Project {

    public static void main(String[] args) {
        
        menu();
        
        // TODO Set up JDB Driver Connection & Settings
    }
    
    public static void menu() {
        
        // Variables
        int menuSelection;
        
        // Menu
        System.out.println("\t-----\t Menu \t -----");
        System.out.println("[1]\tList Groups");
        System.out.println("[2]\tList Publishers");
        System.out.println("[3]\tList Books");
        System.out.println("------------------------");
        System.out.println("[4]\tAdd New Book");
        System.out.println("[5]\tAdd & Replace Publisher");
        System.out.println("------------------------");
        System.out.println("[0]\tDelete Book");
        System.out.println("\n\nSelection: ");
    }
    
}