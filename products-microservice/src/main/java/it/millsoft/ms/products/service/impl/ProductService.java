package it.millsoft.ms.products.service.impl;

import it.millsoft.ms.products.service.IProductService;
import it.millsoft.ms.products.dto.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a.benvenuto on 23/03/2017.
 */
@RestController
public class ProductService implements IProductService
{

    private static Map<Integer,Product> products;
    static
    {
        mockProducts();
    }

    @Override
    @RequestMapping(value = "/getProduct",method = RequestMethod.GET)
    public Product getProduct(Integer id) {
        return products.get(id);
    }

    private static void mockProducts()
    {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Processore I7");
        product1.setBrand("Intel");
        product1.setDescription("Processore I7 gamma Intel");
        product1.setPrice(new Double(466.5));

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("RAM 16gb");
        product2.setBrand("Sandisk");
        product2.setDescription("Memoria RAM");
        product2.setPrice(new Double(90));

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("NVIDIA Graphic Accellerator");
        product3.setBrand("NVIDIA");
        product3.setDescription("Scheda grafica");
        product3.setPrice(new Double(319));

        Product product4 = new Product();
        product4.setId(4);
        product4.setName("Mouse");
        product4.setBrand("Lenovo");
        product4.setDescription("Mouse");
        product4.setPrice(new Double(12));

        products = new HashMap<Integer,Product>();
        products.put(product1.getId(),product1);
        products.put(product2.getId(),product2);
        products.put(product3.getId(),product3);
        products.put(product4.getId(),product4);
    }
}
