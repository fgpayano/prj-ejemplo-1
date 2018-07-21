package net.forgeek.customadapterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listVIew);

        final List<User> users = new ArrayList<>();
        //prj-ejemplo-1
        users.add(new User("1. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("2. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("3. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("4. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("5. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("6. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("7. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("8. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("9. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("10. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));
        users.add(new User("11. Francis Goris Payano", "Uia dolor sit amet consectetur adipisci velit"));

        UserAdapter adapter = new UserAdapter(this, users);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, users.get(i).getName() + " clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
