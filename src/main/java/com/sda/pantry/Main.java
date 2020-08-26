package com.sda.pantry;

import com.sda.pantry.db.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.getOurSessionFactory();
    }
}
