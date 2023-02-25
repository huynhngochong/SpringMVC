/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ngochong.hibernatedemo;

import com.ngochong.pojo.Category;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author giaco
 */
public class HibernateDemo {

    public static void main(String[] args) {
        try(Session s = HibernateUtils.getFactory().openSession()) {
            Query q= s.createQuery("FROM Category");
            List<Category> r = q.getResultList();
            r.forEach(c -> System.out.println(c.getName()));
        }
        
    }
}
