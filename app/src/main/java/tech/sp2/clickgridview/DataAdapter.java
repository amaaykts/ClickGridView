package tech.sp2.clickgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ARTEM on 01.10.2016.
 */

public class DataAdapter extends BaseAdapter {
    private Context context;
    private int resource;
    private int textViewResourceId;
    private String[] data;
    private LayoutInflater layoutInflater;

    public DataAdapter(Context context, int resource, int textViewResourceId, String[] data){
        this.context = context;
        this.resource = resource;
        this.textViewResourceId = textViewResourceId;
        this.data = data;
        layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Button button;
        if(view==null){
            view = layoutInflater.inflate(resource,parent,false);
            button = (Button)view.findViewById(textViewResourceId);
            button.setText(data[position]);
        }
        view.setId(position);
        button = (Button)view.findViewById(textViewResourceId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello "+ position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
