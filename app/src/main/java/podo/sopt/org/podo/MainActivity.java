package podo.sopt.org.podo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.button) Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }


    @OnClick(R.id.button)
    public void onClickTest(){
        Toast.makeText(getApplicationContext(),"tttest",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(),CameraActivity.class);

        startActivity(intent);

    }

}
