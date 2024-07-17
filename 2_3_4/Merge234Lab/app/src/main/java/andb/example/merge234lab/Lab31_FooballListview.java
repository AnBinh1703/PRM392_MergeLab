package andb.example.merge234lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Lab31_FooballListview extends AppCompatActivity {
    ListView lvContent;
    FootballPlayerAdapter adapter;
    ArrayList<FootballPlayers> fbPlayers;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab31);
        handleMapping();
        adapter = new FootballPlayerAdapter(this, R.layout.activity_lab31_footballlistview,fbPlayers);
        lvContent.setAdapter(adapter);
        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lab31_FooballListview.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private int getAge(String dob) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(parseDate(dob));
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    private Date parseDate(String dob) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    private void handleMapping() {
        lvContent = (ListView) findViewById(R.id.layoutListView);
        fbPlayers = new ArrayList<>();
        int cr7img = R.drawable.cr7;
        int m10img = R.drawable.m10;
        int mbappeImg = R.drawable.mbapee;
        int neymarImg = R.drawable.neymarjr;
        int ramosImg = R.drawable.ramos;
        int sallaImg = R.drawable.salla;
        int robenImg = R.drawable.robben;

        int portugalFl = R.drawable.portugal;
        int argenFl = R.drawable.argentina;
        int franceFl  = R.drawable.france;
        int brazilFl = R.drawable.brazil;
        int spainFl =R.drawable.spain;
        int EFl = R.drawable.ai_cap;
        int hollandFl = R.drawable.holland;


        fbPlayers.add(new FootballPlayers(cr7img,"Cristiano Ronaldo","1985-02-05 ( age " + getAge("1985-02-05") + " )", portugalFl ));
        fbPlayers.add(new FootballPlayers(m10img,"Lionel  Messi","1987-06-24 ( age " + getAge("1987-06-24") + " )", argenFl ));
        fbPlayers.add(new FootballPlayers(mbappeImg,"Kylian Mbappé Lottin","1998-12-20 ( age " + getAge("1998-12-20") + " )", franceFl ));
        fbPlayers.add(new FootballPlayers(neymarImg,"Neymar da Silva Santos Júnior","1992-02-05 ( age " + getAge("1992-02-05") + " )", brazilFl ));
        fbPlayers.add(new FootballPlayers(ramosImg,"Sergio Ramos García","1986-03-30 ( age " + getAge("1986-03-30 ") + " )", spainFl ));
        fbPlayers.add(new FootballPlayers(sallaImg,"Mohamed Salah Ghaly","1992-06-15 ( age " + getAge("1992-06-15") + " )", EFl ));
        fbPlayers.add(new FootballPlayers(robenImg,"Arjen Robben","1984-01-23 ( age " + getAge("1984-01-23") + " )", hollandFl ));


    }
}