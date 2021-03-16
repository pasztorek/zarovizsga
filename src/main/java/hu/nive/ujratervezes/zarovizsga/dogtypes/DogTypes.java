package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private MariaDbDataSource ds = new MariaDbDataSource();

    public DogTypes(MariaDbDataSource ds) {
        this.ds = ds;
    }

    public List<String> getDogsByCountry(String country) {
        String CountryUpper = country.toUpperCase();
        List<String> results = new ArrayList<>();

        try(Connection conn = ds.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("SELECT NAME FROM dog_types WHERE country =?");
            stmt.setString(1,CountryUpper);
            ResultSet rs = stmt.executeQuery();


            while (rs.next()) {

                results.add(rs.getString("name").toLowerCase());
            }

        } catch (SQLException se) {
            throw new IllegalStateException("Nincs eredmény", se);
        }

            return results;
    }


}
