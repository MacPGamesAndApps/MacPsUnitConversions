package com.MacPGames.MacPsUnitConversions;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Conversions conversion;
    private MenuItem lastSelectedConversionType = null;
    private boolean TO_METRIC = true;
    private boolean TO_IMPERIAL = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //Uncheck previous selection, if any
        if (lastSelectedConversionType != null)
        {
            lastSelectedConversionType.setChecked(false);
        }
        lastSelectedConversionType = item;

        ((TextView)findViewById(R.id.textViewConversionType)).setText(item.getTitle());
        item.setChecked(true);

        switch(item.getItemId())
        {
            case R.id.conversion_in_cm:
            {
                conversion = new in_cm(TO_METRIC);
                break;
            }
            case R.id.conversion_ft_m:
            {
                conversion = new ft_m(TO_METRIC);
                break;
            }
            case R.id.conversion_yd_m:
            {
                conversion = new yd_m(TO_METRIC);
                break;
            }
            case R.id.conversion_mi_km:
            {
                conversion = new mi_km(TO_METRIC);
                break;
            }
            case R.id.conversion_lb_kg:
            {
                conversion = new lb_kg(TO_METRIC);
                break;
            }
            case R.id.conversion_usoz_ml:
            {
                conversion = new USoz_mL(TO_METRIC);
                break;
            }
            case R.id.conversion_usgal_l:
            {
                conversion = new USgal_L(TO_METRIC);
                break;
            }
            case R.id.conversion_ukgal_l:
            {
                conversion = new UKgal_L(TO_METRIC);
                break;
            }
            case R.id.conversion_f_c:
            {
                conversion = new F_C(TO_METRIC);
                break;
            }
            case R.id.conversion_cm_in:
            {
                conversion = new in_cm(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_m_ft:
            {
                conversion = new ft_m(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_m_yd:
            {
                conversion = new yd_m(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_km_mi:
            {
                conversion = new mi_km(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_kg_lb:
            {
                conversion = new lb_kg(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_ml_usoz:
            {
                conversion = new USoz_mL(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_l_usgal:
            {
                conversion = new USgal_L(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_l_ukgal:
            {
                conversion = new UKgal_L(TO_IMPERIAL);
                break;
            }
            case R.id.conversion_c_f:
            {
                conversion = new F_C(TO_IMPERIAL);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void buttonConvert_onClick(View view)
    {
        if (conversion != null)
        {
            Double doubleFrom = 0.0;
            EditText editTextFrom = findViewById(R.id.editTextConvertFrom);

            String textFrom = editTextFrom.getText().toString();
            if(!textFrom.isEmpty())
            {
                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                doubleFrom = Double.parseDouble(textFrom);
                ((TextView)findViewById(R.id.textViewConvertedValue)).setText(Double.toString(conversion.ConvertValue(doubleFrom)));
            }
        }
    }
}
