import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/keuangan_pribadi";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void saveTransaction(String tipe, String keterangan, double jumlah) {
        String sql = "INSERT INTO transaksi (tipe, keterangan, jumlah) VALUES (?, ?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, tipe);
            pstmt.setString(2, keterangan);
            pstmt.setDouble(3, jumlah);
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }
}
