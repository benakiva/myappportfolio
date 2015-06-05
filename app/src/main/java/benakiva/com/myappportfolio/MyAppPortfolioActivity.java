package benakiva.com.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyAppPortfolioActivity extends Activity {
    private Button mSpotify;
    private Button mScores;
    private Button mLibrary;
    private Button mBuildBigger;
    private Button mXYZReader;
    private Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

        mSpotify = (Button) findViewById(R.id.spotify_streamer);

        mScores = (Button)findViewById(R.id.scores);

        mLibrary = (Button)findViewById(R.id.library);

        mBuildBigger = (Button)findViewById(R.id.build);

        mXYZReader = (Button)findViewById(R.id.xyz_reader);

        mCapstone = (Button)findViewById(R.id.capstone);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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

    private void launchToast(View view) {
        Button button = (Button)view;

        String buttonText = (String) button.getText();
        CharSequence text = getString(R.string.open_app) + buttonText;

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
