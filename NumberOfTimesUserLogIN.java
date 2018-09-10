/*
        Given a file (which can be considered as a String with comma delimiter for the complexity of the question) of usernames and a value k, find top k usernames (with number of logins) who logged into the system the most.
        For example -
        Input:
        User (String) = user1, user4, user2, user1, user3, user1, user2, user3
        k (int) = 2
        Output:
        user1 (3)
        user2 (2)
        user3 (2)
        - Both user2 and user3 should be included since both has same number of logins
        Write a java method to find the output with best time and space complexity.*/

import java.util.HashMap;
import java.util.Map;

public class NumberOfTimesUserLogIN {

    public static void main (String args[]){
        String userString = "user1, user4, user2, user1, user3, user1, user2, user3";
        String[] userStringArray = userString.split(",");

        HashMap<String, Integer> userMap = new HashMap<>();

        for(int i =0; i<userStringArray.length; i++){

            String user = userStringArray[i].trim();
            System.out.println(user);
            if(userMap.containsKey(user)){
                userMap.put(user, userMap.get(user).intValue()+1);
            } else {
                userMap.put(user, 1);
            }
        }

        for(Map.Entry<String, Integer> map : userMap.entrySet()){
            System.out.println(map.getKey() +"::" +map.getValue());
        }


    }
}
