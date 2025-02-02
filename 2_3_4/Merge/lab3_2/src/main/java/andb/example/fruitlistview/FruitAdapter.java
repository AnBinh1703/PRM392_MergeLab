package andb.example.fruitlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FruitAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Fruit> fruitList;

    public FruitAdapter(Context context, int layout, ArrayList<Fruit> fruitList) {
        this.context = context;
        this.layout = layout;
        this.fruitList = fruitList;
    }

    @Override
    public int getCount() {
        return fruitList.size();
    }

    @Override
    public Object getItem(int i) {
        return fruitList.size();

    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtDes = (TextView) view.findViewById(R.id.txtDes);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageItem);

        Fruit fruit = fruitList.get(i);
        txtName.setText(fruit.getName());
        txtDes.setText(fruit.getDescription());
        imageView.setImageResource(fruit.getImage());
        return view;
    }
}
