package as.koding.sendedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button2);
        textField = findViewById(R.id.editText);

        Person person = new Person("thomas", "orten", "utskarpen", 40044195);
        Person person2 = new Person("titten", "tei", "utskarpen", 111);
        Person person3 = new Person();

        AdresseBok bok = new AdresseBok();
        bok.addPerson(person);
        bok.addPerson(person2);
        bok.addPerson(person3);

        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textField.getText().toString();
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("verdi", text);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        textField.setText( data.getExtras().getString("verdi") );

        logThis("Hei igjen");
    }

    public void logThis(String message) {
        Log.d("LOL", message);
    }

}
