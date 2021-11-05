package personal.app.guia5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import personal.app.guia5.utils.Utils;

public class LoginActivity extends AppCompatActivity {

    private Button btnLog, btnReset;
    private EditText edtUserName, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        btnLog = (Button) findViewById(R.id.btnLog);
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnLog.setOnClickListener(v -> {
            if(Utils.verifyEditText(edtUserName) && Utils.verifyEditText(edtPassword)) {
                Intent intent = new Intent(this, MainActivity.class);
                String username = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();

                Bundle extras = new Bundle();
                extras.putString("USERNAME",username);
                extras.putString("PASSWORD",password);
                //Agrega el objeto bundle a el Intent
                intent.putExtras(extras);
                //Inicia Activity
                startActivity(intent);

                Toast.makeText(LoginActivity.this,
                        "Login as: " + username,
                        Toast.LENGTH_SHORT).show();
            }
        });

       btnReset.setOnClickListener(v -> {
           edtUserName.setText("");
           edtPassword.setText("");
       });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}