package blizzardian.screensnip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class EditActivity extends AppCompatActivity {

    private Bitmap screenshot;

    private ImageView mImageEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        getSupportActionBar().setTitle(R.string.titleEdit);

        // Store and display the screenshot taken from MainActivity
//        screenshot = getIntent().getParcelableExtra("Image");
        screenshot = BitmapFactory.decodeByteArray(
                getIntent().getByteArrayExtra("ImageBytes"),
                0,
                getIntent().getByteArrayExtra("ImageBytes").length
        );
        mImageEditor = (ImageView) findViewById(R.id.imageEditor);
        mImageEditor.setImageBitmap(screenshot);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        // Terminate application when Back is pressed
        finish();
        moveTaskToBack(true);
        System.exit(0);
    }
}
