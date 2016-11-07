package se.jku.at.ubifood.Settings;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import se.jku.at.ubifood.Server;
import se.jku.at.ubifood.R;

import static android.R.id.list;

/**
 * Created by Thomas on 26.10.2016.
 */

public class ShopData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_shop_data);
        initEntries();
    }

    private void initEntries() {
        final ListView listview = (ListView) findViewById(R.id.listview);
        final List<ShopDataContainer> container = Server.GetShopData();
        final ShopArrayAdapter adapter = new ShopArrayAdapter(ShopData.this, container.toArray(new ShopDataContainer[container.size()]));
        listview.setAdapter(adapter);
        listview.setClickable(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //ToDo: Show on map
            }
        });
    }

    public class ShopArrayAdapter extends ArrayAdapter<ShopDataContainer> {
        private final Context context;
        private final ShopDataContainer[] values;

        public ShopArrayAdapter(Context context, ShopDataContainer[] values) {
            super(context, -1, values);
            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.shop_data_layout, parent, false);
            TextView tName = (TextView) rowView.findViewById(R.id.tName);
            TextView tAddress = (TextView) rowView.findViewById(R.id.tAddress);
            TextView tETA = (TextView) rowView.findViewById(R.id.tETA);
            tName.setText(values[position].getName());
            tAddress.setText(values[position].getAddress());
            tETA.setText(values[position].getEta());
            rowView.findViewById(R.id.lLayout).setBackgroundColor(Color.parseColor(getRandomRainbowColor()));
            return rowView;
        }

        int currentRainbowIndex = -1;
        private String getRandomRainbowColor(){
            currentRainbowIndex++;
            if(currentRainbowIndex > 8)
                currentRainbowIndex = -1;

            switch (currentRainbowIndex){
                case 0:
                    return "#FF0000";
                case 1:
                    return "#E2571E";
                case 2:
                    return "#FF7F00";
                case 3:
                    return "#FFFF00";
                case 4:
                    return "#00FF00";
                case 5:
                    return "#96bf33";
                case 6:
                    return "#0000FF";
                case 7:
                    return "#4B0082";
                case 8:
                    return "#8B00FF";
            }

            return "#FF0000";
        }
    }
}
