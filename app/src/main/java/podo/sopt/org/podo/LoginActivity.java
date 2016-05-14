package podo.sopt.org.podo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by NOEP on 2016. 5. 14..
 */
public class LoginActivity extends AppCompatActivity{

    @Bind(R.id.buttonSave)
    Button LoginButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        ButterKnife.bind(this);

    }


    @OnClick (R.id.buttonSave)
    public void buttonSave(){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);


    }

}
