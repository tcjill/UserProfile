package android.example.userprofile;

import android.example.userprofile.R;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.googl);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("");


        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("");

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("");
    }
}