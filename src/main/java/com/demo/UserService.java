package com.demo;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private final Map<String, String> users = new HashMap<>();

    public boolean registerUser(String username, String email) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        if (users.containsKey(username)) {
            return false;   // duplicate not allowed
        }
        users.put(username, email);
        return true;
    }

    public String getEmail(String username) {
        return users.getOrDefault(username, null);
    }

    public boolean deleteUser(String username) {
        return users.remove(username) != null;
    }

    public int getUserCount() {
        return users.size();
    }
}
    // Feature: improved email validation with domain check
    public boolean isValidEmailFormat(String email) {
        if (email == null) return false;
        return email.contains("@") && email.contains(".") && email.length() > 5;
    }
