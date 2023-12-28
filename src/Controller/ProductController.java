package Controller;

import Component.MSG;
import Database.DBConnection;
import Model.ProductModel;
import java.sql.*;
import java.util.*;

public class ProductController extends DBConnection{
    PreparedStatement ps;
    ResultSet rs;
    
    public Collection<ProductModel> get(){
        List<ProductModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `tbl_product`";
            ps=connection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                ProductModel product = new ProductModel(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6), rs.getString(7));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void add(ProductModel product){
        String sql = "INSERT INTO `tbl_product`(`name`, `qty`, `price`, `total`, `discount`, `image`) VALUES (?,?,?,?,?,?)";
        try {
            ps = connection().prepareStatement(sql);
            ps.setString(1,product.getName());
            ps.setInt(2, product.getQty());
            ps.setDouble(3, product.getPrice());
            ps.setDouble(4, product.getTotal());
            ps.setInt(5, product.getDiscount());
            ps.setString(6, product.getImage());
            int i = ps.executeUpdate();
            if (i>0) {
                MSG.success("Added");
            } else {
                MSG.error("Add Fail");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void update(ProductModel product){
        
    }
    public void delete(int id){
        
    }
}
