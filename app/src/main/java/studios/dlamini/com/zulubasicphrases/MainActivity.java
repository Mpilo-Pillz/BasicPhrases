package studios.dlamini.com.zulubasicphrases;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button zuluButton;
    private Button spanishButton;
    private Button portugueseButton;

    public static final String ZULU_PHRASES = "studios.dlamini.com.zulubasicphrases.ZULU_PHRASES";
    public static final String SPANISH_PHRASES = "studios.dlamini.com.zulubasicphrases.SPANISH_PHRASES";
    public static final String PORTUGUESE_PHRASES = "studios.dlamini.com.zulubasicphrases.PORTUGUESE_PHRASES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        zuluButton = (Button) findViewById(R.id.zuluButton);
        zuluButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZuluActivity();
            }
        });

        spanishButton = (Button) findViewById(R.id.spanishButton);
        spanishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpanishActivity();
            }
        });

        portugueseButton = (Button) findViewById(R.id.portugueseButton);
        portugueseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPortugueseActivity();
            }
        });
    }

    public void openZuluActivity() {

            Intent intent = new Intent(this, ZuluPhrases.class);
            startActivity(intent);
        }

    public void openSpanishActivity() {

        Intent intent = new Intent(this, SpanishPhrases.class);
        startActivity(intent);
    }

    public void openPortugueseActivity() {

        Intent intent = new Intent(this, PortuguesePhrases.class);
        startActivity(intent);
    }

}

