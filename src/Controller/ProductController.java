package Controller;

import Component.MSG;
import Database.DBConnection;
import Model.ProductModel;
import java.sql.*;

public class ProductController extends DBConnection{
    PreparedStatement ps;
    ResultSet rs;
    
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
