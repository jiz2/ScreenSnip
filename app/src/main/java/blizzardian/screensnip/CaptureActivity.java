package blizzardian.screensnip;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.io.ByteArrayOutputStream;

public class CaptureActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_capture);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // TODO Try to actually capture the screen here since it is fullscreen but no content
//        Canvas c = new Canvas();

//        View rootView = getWindow().getDecorView().getRootView();
////        rootView.setVisibility(View.INVISIBLE);
//
//        // Take a Screenshot and pass it to EditActivity
////                rootView.setDrawingCacheBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorFade));
//        rootView.setDrawingCacheEnabled(true);
//        Bitmap screenshot = rootView.getDrawingCache();
//        ByteArrayOutputStream imageBytes = new ByteArrayOutputStream();
//        screenshot.compress(Bitmap.CompressFormat.PNG, 100, imageBytes);
//        setResult(RESULT_OK, new Intent().putExtra("bImage", imageBytes.toByteArray()));
//        rootView.setDrawingCacheEnabled(false);
        finish();
    }
}
