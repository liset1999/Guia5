package personal.app.guia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.widget.Button;
import android.widget.Toast;

import personal.app.guia5.adapters.ConversationAdapter;

public class MainActivity extends AppCompatActivity {

    private Button btnMostrarDatos, btnConversations;
    private Button btnLogin, btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMostrarDatos = (Button) findViewById(R.id.btnMostrarDatos);
        btnConversations = (Button) findViewById(R.id.btnConversations);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnCalculator = (Button) findViewById(R.id.btnCalculator) ;

        btnMostrarDatos.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarDatosActivity.class));
        });

        btnConversations.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ConversationsActivity.class));
        });

        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        });

        btnCalculator.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CalculadoraActivity.class));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

}