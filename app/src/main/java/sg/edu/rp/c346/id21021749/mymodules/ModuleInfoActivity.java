package sg.edu.rp.c346.id21021749.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleInfoActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_info);

        tvAnswer = findViewById(R.id.displayText);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        if (intentReceived.hasExtra("Module01")) {
            String module = intentReceived.getStringExtra("Module01");
            String modNam = intentReceived.getStringExtra("ModuleName");
            int year = intentReceived.getIntExtra("AcadYear", 2020);
            int sem = intentReceived.getIntExtra("Sem", 1);
            double credit = intentReceived.getDoubleExtra("ModCredit", 4.0);
            String venue = intentReceived.getStringExtra("Venue");
            String display = String.format("Module code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %.2f\nVenue: %s", module,
                    modNam,year,sem,credit,venue);
            tvAnswer.setText(display);
        }
        else {
            String module = intentReceived.getStringExtra("Module02");
            String modNam = intentReceived.getStringExtra("ModuleName");
            int year = intentReceived.getIntExtra("AcadYear", 2020);
            int sem = intentReceived.getIntExtra("Sem", 2);
            double credit = intentReceived.getDoubleExtra("ModCredit", 4.0);
            String venue = intentReceived.getStringExtra("Venue");
            String display = String.format("Module code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %.2f\nVenue: %s", module,
                    modNam,year,sem,credit,venue);
            tvAnswer.setText(display);
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleInfoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}