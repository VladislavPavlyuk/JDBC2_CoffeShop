package org.postgresql;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException {
        CoffeeShopDAO dao = new CoffeeShopDAO();
        dao.addBarista("Vladislav Pavlyuk","3-22-22-3","vladislav.pavlyuk@gmail.com");
    }
}
