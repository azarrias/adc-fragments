package es.pue.android.adc_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.activity_et_name);
        Button btnFragment = findViewById(R.id.activity_btn_insFragment);

        btnFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_btn_insFragment:
                getFragmentManager()
                        .beginTransaction()
                        .add(R.id.activity_root_fragment,BlankFragment.newInstance(etName.getText().toString()))
                        .commitAllowingStateLoss();
        }
    }
}
