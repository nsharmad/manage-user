package org.example.dao;

import org.example.model.User;
import util.DbConnectionUtl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {


    public static final String SAVE_SQL = "insert into user_tbl(user_name, password, salary, mobile_no, dob, is_Active)values(?,?,?,?,?,?)";

    @Override
    public int saveUser(User user) {
        int saved=0;

        try (PreparedStatement ps = DbConnectionUtl.getConnection().prepareStatement(SAVE_SQL)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setDouble(3, user.getSalary());
            ps.setLong(4, user.getMobileNo());
            ps.setDate(5, Date.valueOf(user.getDob()));
            ps.setBoolean(6, user.isActive());

            saved = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return saved;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User getUserByID(int ID) {
        return null;
    }

    @Override
    public List<User> getAllUserUser() {
        return null;
    }
}
