package mmfontsample.dojoartisan.mmfontsample;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.Rabbit;
import mmfontsample.dojoartisan.mmfontsample.utils.TypefaceManager;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    public static Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        MDetect.INSTANCE.init(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        txt = (TextView) findViewById(R.id.txt);

        if (MDetect.INSTANCE.isUnicode()){
            this.typeface = MainApplication.typefaceManager.getUni();
            txt.setText("ပြတ်သွားတဲ့ ရီးစားကိုလည်း အပစ်မယူ ၊ မင်းလည်း ငါ့ဘဝထဲမှာ မရှိနေသင့်ဘူး ချစ်သူ၊ မင်းမရှိလို့ မဖြစ်ဘူးဆိုတဲ့ အသံလည်းငါမဟစ်၊ သေချာတာကငါလည်းမပေးနိုင်ဘူး မင်လိုချင်တဲ့ ကဗျာဆန်တဲ့ အချစ်");
            txt.setTypeface(typeface);

        }else {
            this.typeface = MainApplication.typefaceManager.getZgyi();
            txt.setText(Rabbit.uni2zg("ပြတ်သွားတဲ့ ရီးစားကိုလည်း အပစ်မယူ ၊ မင်းလည်း ငါ့ဘဝထဲမှာ မရှိနေသင့်ဘူး ချစ်သူ၊ မင်းမရှိလို့ မဖြစ်ဘူးဆိုတဲ့ အသံလည်းငါမဟစ်၊ သေချာတာကငါလည်းမပေးနိုင်ဘူး မင်လိုချင်တဲ့ ကဗျာဆန်တဲ့ အချစ်"));
            txt.setTypeface(typeface);


        }

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
