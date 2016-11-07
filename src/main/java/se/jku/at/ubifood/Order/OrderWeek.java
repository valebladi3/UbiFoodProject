package se.jku.at.ubifood.Order;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import se.jku.at.ubifood.R;
import se.jku.at.ubifood.Server;

/**
 * Created by Thomas on 04.11.2016.
 */

public class OrderWeek extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_week);
        initDefaultEntries();
    }

    private void initDefaultEntries() {
        final ListView listview = (ListView) findViewById(R.id.lWeekPlan);
        final List<Ingredient> container = Server.GetCurrentWeekingredients(0);
        final OrderArrayAdapter adapter = new OrderArrayAdapter(OrderWeek.this, container.toArray(new Ingredient[container.size()]));
        listview.setAdapter(adapter);
    }

    public class OrderArrayAdapter extends ArrayAdapter<Ingredient> {
        private final Context context;
        private final Ingredient[] values;

        public OrderArrayAdapter(Context context, Ingredient[] values) {
            super(context, -1, values);
            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.order_week_layout, parent, false);
            TextView tAmount = (TextView) rowView.findViewById(R.id.tAmount);
            TextView tName = (TextView) rowView.findViewById(R.id.tItemName);
            TextView tCost = (TextView) rowView.findViewById(R.id.tItemConst);
            tAmount.setText(Integer.toString(values[position].getAmount()));
            tName.setText(values[position].getName());
            tCost.setText(Float.toString(values[position].getPrice()));
            return rowView;
        }
    }
}
