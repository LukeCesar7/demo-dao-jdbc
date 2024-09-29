package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===TESTE 1: seller findById =====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n===TESTE 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller o : list) {
            System.out.println(o);
        }

        System.out.println("\n===TESTE 3: seller findAll =====");

        list = sellerDao.findAll();

        for (Seller o : list) {
            System.out.println(o);
        }
        System.out.println("\n===TESTE 4: seller findAll =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Insert! New id = " + newSeller.getId());

        System.out.println("\n===TESTE 5: seller update =====");
        Seller seller1 = sellerDao.findById(6);
        seller1.setName("Marta Waine");
        sellerDao.update(seller1);
        System.out.println("Update Completed");
    }

}

