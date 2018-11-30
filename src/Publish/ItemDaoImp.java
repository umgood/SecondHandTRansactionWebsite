package Publish;

import model.SQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDaoImp {
    String itemName;
    String itemPrice;
    String seller;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private SQLConnection sqlConnection;


    public ItemDaoImp(){
        this.itemName = null;
        this.itemPrice = null;
        this.seller = null;
        sqlConnection = new SQLConnection();
    }

    public ArrayList<Items> getItemList(String itemType){
        ArrayList<Items> itemsArrayList = new ArrayList<Items>();
        String sql = "select * from items where type=\""+ itemType +"\";";
        //sql operation
        statement = sqlConnection.connectSQL();
        try{
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String itemName = resultSet.getString("item_name");
                String itemPrice = resultSet.getString("item_price");
                String seller = resultSet.getString("seller_id");
                int itemId = resultSet.getInt("item_id");
                System.out.println("ItemDaoImp - getItemList:item id, " + Integer.toString(itemId));
                Items items = new Items(itemName,itemPrice,seller,itemId);
                itemsArrayList.add(items);
            }
            System.out.println("ItemDaoImp - getItemList:get data success, list count:" + Integer.toString(itemsArrayList.size()));
        }catch (SQLException se){
            System.out.println(se.getMessage());
        }
        sqlConnection.closeSQL(statement);
        return itemsArrayList;
    }

    public Items getItem(int itemId){
        Items items = new Items();
        String sql = "select * from items where item_id="+ Integer.toString(itemId) +"; ";
        statement = sqlConnection.connectSQL();
        try {
            resultSet = statement.executeQuery(sql);
            resultSet.next();
            String itemName = resultSet.getString("item_name");
            String itemPrice = resultSet.getString("item_price");
            String seller = resultSet.getString("seller_id");
            items.setGoodName(itemName);
            items.setItemPrice(itemPrice);
            items.setSeller(seller);
            System.out.println("ItemDaoImp - getItem:itemName," + itemName);

        }catch (SQLException se){
            System.out.println("ItemDaoImp - getItem:error" + se.getMessage());
        }
        sqlConnection.closeSQL(statement);
        return items;
    }

}
