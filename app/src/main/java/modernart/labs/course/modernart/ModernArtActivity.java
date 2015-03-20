package modernart.labs.course.modernart;

import android.content.Context;
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
import android.widget.SeekBar;
import android.widget.TextView;


public class ModernArtActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern_art);

        SurfaceView leftUpTile = (SurfaceView) findViewById(R.id.leftUpTile);
        SurfaceView leftDownTile = (SurfaceView) findViewById(R.id.leftDownTile);
        SurfaceView rightUpTile = (SurfaceView) findViewById(R.id.rightUpTile);
        SurfaceView rightMidTile = (SurfaceView) findViewById(R.id.rightMidTile);
        SurfaceView rightDownTile = (SurfaceView) findViewById(R.id.rightDownTile);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        leftUpTile.setBackgroundColor(Color.BLUE);
        leftDownTile.setBackgroundColor(Color.RED);
        rightUpTile.setBackgroundColor(Color.YELLOW);
        rightMidTile.setBackgroundColor(Color.MAGENTA);
        rightDownTile.setBackgroundColor(Color.GREEN);



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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


