package problem1;

import java.util.*;

public class UsernameService {

    private Map<String, Integer> userDatabase;


    private Map<String, Integer> attemptFrequency;

    public UsernameService() {
        userDatabase = new HashMap<>();
        attemptFrequency = new HashMap<>();
    }

    public void registerUser(String username, int userId) {
        userDatabase.put(username.toLowerCase(), userId);
    }


    public boolean checkAvailability(String username) {
        username = username.toLowerCase();
        attemptFrequency.put(username,
                attemptFrequency.getOrDefault(username, 0) + 1);

        return !userDatabase.containsKey(username);
    }


    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        username = username.toLowerCase();

        for (int i = 1; i <= 5; i++) {
            String suggestion = username + i;
            if (!userDatabase.containsKey(suggestion)) {
                suggestions.add(suggestion);
            }
        }

        String modified = username.replace("_", ".");
        if (!userDatabase.containsKey(modified)) {
            suggestions.add(modified);
        }

        return suggestions;
    }


    public String getMostAttempted() {
        String mostAttempted = null;
        int max = 0;

        for (Map.Entry<String, Integer> entry : attemptFrequency.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostAttempted = entry.getKey();
            }
        }

        return mostAttempted + " (" + max + " attempts)";
    }
}