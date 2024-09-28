package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        //Criação de objeto, o = obj
        Department o = new Department(1, "Books");
        Seller seller = new Seller(21, "John Gree", "johngree@gamil.com", new Date(), 3000.0, o);
        System.out.println(seller);
    }
}
