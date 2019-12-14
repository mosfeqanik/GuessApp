package mosfeqanik01.guessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnumber;
    public void SetRandomNumber(){
        Random Rand = new Random();
        randomnumber = Rand.nextInt(20) + 1;
    }
    public  void Guess(View view){
        EditText editText=findViewById(R.id.numberText);
        int guessvalue = Integer.parseInt(editText.getText().toString());
        String message;
        if (guessvalue > randomnumber){
            message ="Lower";
        }
        else if (guessvalue < randomnumber){
            message ="Higher";
        }
        else{
            message ="You got it";
            SetRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("number",editText.getText().toString());
        Log.i("info",Integer.toString(randomnumber));
//
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetRandomNumber();

    }
}
