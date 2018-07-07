package mx.edu.ittepic.clase_02_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtContrasena;
    Button btnEntrar;
    String usuario = "Admin";
    String contrasena = "1234";
    String strUsuario, strPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtContrasena = findViewById(R.id.edtContrasena);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strUsuario = edtUsuario.getText().toString();
                strPassword = edtContrasena.getText().toString();
                if(strUsuario.equals(usuario) &&  strPassword.equals(contrasena)){
                    //Toast.makeText(MainActivity.this,"Bienvenido", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Bienvenida.class);
                    //i.putExtra("usuario", strUsuario);
                    startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this,"Error", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
