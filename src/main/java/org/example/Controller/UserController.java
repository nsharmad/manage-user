package org.example.Controller;

import org.example.model.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        User user = new User();

        String username = JOptionPane.showInputDialog("Enter UserName");
        String password = JOptionPane.showInputDialog("Enter Password");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));
        long mobile = Long.parseLong(JOptionPane.showInputDialog("Enter mobile number"));
        LocalDate dob = LocalDate.now();
        boolean isActive = Boolean.parseBoolean(JOptionPane.showInputDialog("Is user Active?"));
        user.setUsername(username);
        user.setPassword(password);
        user.setSalary(salary);
        user.setDob(dob);
        user.setMobileNo(mobile);
        user.setActive(isActive);
        int saved = userService.saveUser(user);

        if (saved>=1){
            JOptionPane.showMessageDialog(null, "User is saved successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Error in db");
        }



    }

}
