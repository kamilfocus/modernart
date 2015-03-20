package modernart.labs.course.modernart;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class ModernArtActivity extends ActionBarActivity {

    private int alpha = 200;
    private int colorChange = 0;
    private int leftUpColor = Color.argb(alpha, colorChange, 125, 255);
    private int leftDownColor = Color.argb(alpha, 255, colorChange, 125);
    private int rightUpColor = Color.argb(alpha, 153, colorChange, 0);
    private int rightMidColor = Color.argb(alpha, 255, 255, 255);
    private int rightDownColor = Color.argb(alpha, colorChange, 76, 153);

    private DialogFragment mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern_art);

        final SurfaceView leftUpTile = (SurfaceView) findViewById(R.id.leftUpTile);
        final SurfaceView leftDownTile = (SurfaceView) findViewById(R.id.leftDownTile);
        final SurfaceView rightUpTile = (SurfaceView) findViewById(R.id.rightUpTile);
        final SurfaceView rightMidTile = (SurfaceView) findViewById(R.id.rightMidTile);
        final SurfaceView rightDownTile = (SurfaceView) findViewById(R.id.rightDownTile);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        leftUpTile.setBackgroundColor(leftUpColor);
        leftDownTile.setBackgroundColor(leftDownColor);
        rightUpTile.setBackgroundColor(rightUpColor);
        rightMidTile.setBackgroundColor(rightMidColor);
        rightDownTile.setBackgroundColor(rightDownColor);

        seekBar.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                leftUpTile.setBackgroundColor(Color.argb(alpha, progresValue, 125, 255));
                leftDownTile.setBackgroundColor(Color.argb(alpha, 255, progresValue, 125));
                rightUpTile.setBackgroundColor(Color.argb(alpha, 153, progresValue, 0));
                rightMidTile.setBackgroundColor(Color.argb(alpha, 255, 255, 255));
                rightDownTile.setBackgroundColor(Color.argb(alpha, progresValue, 76, 153));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_modern_art, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.more_information) {
            LayoutInflater layoutInflater = LayoutInflater.from(this);
            View promptView = layoutInflater.inflate(R.layout.alert_dialog_fragment, null);
            final AlertDialog alertD = new AlertDialog.Builder(this).create();


            Button notButton = (Button) promptView.findViewById(R.id.not_button);
            Button momaButton = (Button) promptView.findViewById(R.id.moma_button);

            momaButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {



                }
            });

            notButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    alertD.dismiss();
                }
            });

            alertD.setView(promptView);
            alertD.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}


