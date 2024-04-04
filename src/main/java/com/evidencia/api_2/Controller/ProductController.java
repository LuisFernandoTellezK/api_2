package com.evidencia.api_2.Controller;

     import com.evidencia.api_2.Entity.Product;
     import com.evidencia.api_2.Service.ProductService;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.web.bind.annotation.GetMapping;
     import org.springframework.web.bind.annotation.RequestMapping;
     import org.springframework.web.bind.annotation.RestController;

     import java.util.List;

     @RestController
     @RequestMapping("api/product")
     public class ProductController {
         @Autowired
         ProductService productService;

         @GetMapping("/findAll")
         public List<Product> findAll() {
             return productService.findAll();
         }
     }