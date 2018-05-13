package cl.dany.example.data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Nodes {
    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();
    public DatabaseReference users()
    {
        return root.child("credentials");
    }
    public DatabaseReference user(String key)
    {
        return users().child(key);
    }
}
