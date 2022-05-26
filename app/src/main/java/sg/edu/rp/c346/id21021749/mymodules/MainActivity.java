package sg.edu.rp.c346.id21021749.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnModule1;
    TextView btnModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModule1 = findViewById(R.id.btnModule1);
        btnModule2 = findViewById(R.id.btnModule2);

        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleInfoActivity.class);
                intent.putExtra("Module01", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcadYear", 2020);
                intent.putExtra("Sem", 1);
                intent.putExtra("ModCredit", 4.0);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

            }
        });
        btnModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleInfoActivity.class);
                intent.putExtra("Module02", "C349");
                intent.putExtra("ModuleName", "Ipad Programming");
                intent.putExtra("AcadYear", 2020);
                intent.putExtra("Sem", 2);
                intent.putExtra("ModCredit", 4.0);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

            }
        });


    }
}