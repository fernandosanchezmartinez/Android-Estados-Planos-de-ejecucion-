package damp_2.utad.activityestados_fernandosanchezdamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public LinearLayout ly_VertGeneral =null;
    public LinearLayout ly_Horiz1 =null;
    public LinearLayout ly_Horiz2 =null;

    public TextView txtTiempAntDePause = null;
    public TextView txtTiempoEnPause = null;



    long ln_tiempoMiliseg_alArrancar = 0;


    public void initLayouts(){
        ly_VertGeneral=(LinearLayout)findViewById(R.id.ly_VertGeneral);
        ly_Horiz1=(LinearLayout)findViewById(R.id.ly_Horiz1);
        ly_Horiz2=(LinearLayout)findViewById(R.id.ly_Horiz2);

    }


    public void init_textViews(){
        txtTiempAntDePause=(TextView) findViewById(R.id.txtTiempAntDePause);
        txtTiempoEnPause=(TextView) findViewById(R.id.txtTiempoEnPause);
    }

//---------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ln_tiempoMiliseg_alArrancar = System.currentTimeMillis();
        this.initLayouts();
        this.init_textViews();
    }
//---------------------------------------------------------------------------------------------
    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MSG_CONTROL", "HE ENTRADO EN PAUSA");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MSG_CONTROL", "HE VUELTO DE SEGUNDO PLANO");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MSG_CONTROL", "FINN");
    }
}
