package blizzardian.screensnip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        getSupportActionBar().setTitle(R.string.titleEdit);
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
