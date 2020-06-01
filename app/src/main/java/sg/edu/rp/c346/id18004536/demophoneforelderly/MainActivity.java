package sg.edu.rp.c346.id18004536.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sonPass;
    Button daughterPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonPass = findViewById(R.id.buttonCallSon);
        daughterPass = findViewById(R.id.buttonCallDaughter);

        sonPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callSon =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 92240336));
                startActivity(callSon);
            }
        });


        daughterPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callDaughter =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 89675543));
                startActivity(callDaughter);
            }
        });
    }
}
