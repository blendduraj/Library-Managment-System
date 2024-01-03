
package lms.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import lms.JDialogExceptionThrower;


public class DBConnection {

    private static Connection con;
    private static String dbDriver;
    private static String server;
    private static String jDBCUr;
    private static String database;
    private static String userID;
    private static String password;
    private static String readFile = System.getProperty("user.dir") + "/src/lms/util/config.ini";

    public void getDBConn() {
        synchronized ("") {
            try {
                if (this.getCon() == null || this.getCon().isClosed()) {
                    try {

                        Properties p2 = new Properties();
                        p2 = loadProperties(readFile);
                        Class.forName(p2.getProperty("DBDriver"));
                        String dbDriverl =p2.getProperty("DBDriver");
                        String serverl = p2.getProperty("Server");
                        String jDBCUrl = p2.getProperty("JDBCUrl");
                        String databasel = p2.getProperty("Database");
                        String userIDl = p2.getProperty("UserID");
                        String passwordl = p2.getProperty("Password");

                        setDbDriver(dbDriverl);        
                        setjDBCUr(jDBCUrl);
                        setDatabase(databasel);
                        setUserID(userIDl);
                        setPassword(passwordl);
                        setServer(serverl);

                        String url = jDBCUrl + serverl + "/" + databasel;
                        setCon(DriverManager.getConnection(url, userIDl, passwordl));

                    } catch (Exception e) {
                        JDialogExceptionThrower s = new JDialogExceptionThrower(null, true, e);
                        s.setVisible(true);
                    }
                } else {
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            } finally {

            }
        }
    }


    public static Connection getCon() {
        return con;
    }


    public static void setCon(Connection aCon) {
        con = aCon;
    }

    public static void closeConnection() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Properties loadProperties(String sFile) {
        Properties p = new Properties();
        try {
            FileInputStream in = new FileInputStream(sFile);
            p.load(in);
            in.close();
        } catch (IOException iOException) {
            JOptionPane.showMessageDialog(null, iOException);
        }
        return p;
    }


    public static String getDbDriver() {
        return dbDriver;
    }


    public static void setDbDriver(String aServer) {
        dbDriver = aServer;
    }


    public static String getjDBCUr() {
        return jDBCUr;
    }


    public static void setjDBCUr(String ajDBCUr) {
        jDBCUr = ajDBCUr;
    }

    public static String getDatabase() {
        return database;
    }


    public static void setDatabase(String aDatabase) {
        database = aDatabase;
    }


    public static String getUserID() {
        return userID;
    }


    public static void setUserID(String aUserID) {
        userID = aUserID;
    }

    public static String getPassword() {
        return password;
    }


    public static void setPassword(String aPassword) {
        password = aPassword;
    }


    public static String getServer() {
        return server;
    }


    public static void setServer(String aServer) {
        server = aServer;
    }

}
