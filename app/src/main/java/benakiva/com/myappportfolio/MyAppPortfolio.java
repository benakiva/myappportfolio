package benakiva.com.myappportfolio;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyAppPortfolio extends Activity implements View.OnClickListener {
    private Resources mRes;
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
        mSpotify.setOnClickListener(this);

        mScores = (Button)findViewById(R.id.scores);
        mScores.setOnClickListener(this);

        mLibrary = (Button)findViewById(R.id.library);
        mLibrary.setOnClickListener(this);

        mBuildBigger = (Button)findViewById(R.id.build);
        mBuildBigger.setOnClickListener(this);

        mXYZReader = (Button)findViewById(R.id.xyz_reader);
        mXYZReader.setOnClickListener(this);

        mCapstone = (Button)findViewById(R.id.capstone);
        mCapstone.setOnClickListener(this);

        mRes = getResources();
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

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.spotify_streamer:
                launchToast(mRes.getString(R.string.spotify));
                break;
            case R.id.scores:
                launchToast(mRes.getString(R.string.scores_app));
                break;
            case R.id.library:
                launchToast(mRes.getString(R.string.library_app));
                break;
            case R.id.build:
                launchToast(mRes.getString(R.string.build_bigger));
                break;
            case R.id.xyz_reader:
                launchToast(mRes.getString(R.string.xyz_reader));
                break;
            case R.id.capstone:
                launchToast(mRes.getString(R.string.capstone_app));
                break;
            default:
                return;
        }
    }

    private void launchToast(final String app) {
        Toast.makeText(getApplicationContext(), mRes.getString(R.string.toast_msg, app),
                Toast.LENGTH_LONG).show();
    }
}
