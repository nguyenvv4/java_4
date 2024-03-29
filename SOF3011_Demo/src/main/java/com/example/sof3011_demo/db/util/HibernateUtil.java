package com.example.sof3011_demo.db.util;

import com.example.sof3011_demo.cart.entity.SanPham;
import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.filter.entity.MauSac;
import com.example.sof3011_demo.join.entity.ChiTietSP;
import com.example.sof3011_demo.join.entity.SanPham1;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;


public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=java_4");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "Password.1");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
//        conf.addAnnotatedClass(DongVat.class);
//        conf.addAnnotatedClass(SinhVien.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(SanPham1.class);

        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(MauSac.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        System.out.println(getFACTORY());
        System.out.println("Connected");
    }
}
