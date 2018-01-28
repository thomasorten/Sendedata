package as.koding.sendedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button1 = findViewById(R.id.button2);
        final EditText textField = findViewById(R.id.editText);

        Intent intent = this.getIntent();

        String verdi = intent.getExtras().getString("verdi");
        textField.setText(verdi);

        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Her skal vi sende tilbake verdien i tekstfeltet
                Intent intent = SecondActivity.this.getIntent();
                String val = textField.getText().toString();
                intent.putExtra("verdi", val);
                setResult(1, intent);
                finish(); // Ødelegg activity onFinished() kjører
            }
        });
    }
}
