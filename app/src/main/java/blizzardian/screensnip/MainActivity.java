package blizzardian.screensnip;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    private static final int CAPTURE_REQUEST = 7878;
    private Button bCapture;
    private Button bCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCapture = (Button) findViewById(R.id.bCapture);
        bCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View rootView = v.getRootView();
                rootView.setVisibility(View.GONE);
//
//                // Take a Screenshot and pass it to EditActivity
////                rootView.setDrawingCacheBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorFade));
//                rootView.setDrawingCacheEnabled(true);
//                Bitmap screenshot = rootView.getDrawingCache();
//                ByteArrayOutputStream imageBytes = new ByteArrayOutputStream();
//                screenshot.compress(Bitmap.CompressFormat.PNG, 100, imageBytes);
//
//                Intent editIntent = new Intent(MainActivity.this, EditActivity.class);
//                editIntent.putExtra("ImageBytes", imageBytes.toByteArray());
//                rootView.setDrawingCacheEnabled(false);
//
//                startActivity(editIntent);
//                finish();

                startActivityForResult(new Intent(MainActivity.this, CaptureActivity.class), CAPTURE_REQUEST);
            }
        });

        bCancel = (Button) findViewById(R.id.bCancel);
        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Terminate the app
                finish();
                moveTaskToBack(true);
                System.exit(0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check request
        if (requestCode == CAPTURE_REQUEST) {
            // Check request success
            if (resultCode == RESULT_OK) {
                Intent editIntent = new Intent(MainActivity.this, EditActivity.class);
                editIntent.putExtra("ImageBytes", data.getByteArrayExtra("bImage"));
                startActivity(editIntent);
            }
        }
        finish();
    }
}
