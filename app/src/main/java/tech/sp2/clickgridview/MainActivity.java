package tech.sp2.clickgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridView);
        String[] data = {"H","E","L","L","O"};
        DataAdapter adapter = new DataAdapter(this, R.layout.item, R.id.btn,data);
        gridView.setAdapter(adapter);
    }
}
