package andb.example.footballlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FootballPlayerAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<FootballPlayers> fbList;

    public FootballPlayerAdapter(Context context, int layout, ArrayList<FootballPlayers> fbList) {
        this.context = context;
        this.layout = layout;
        this.fbList = fbList;
    }

    @Override
    public int getCount() {
        return fbList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imgPlayer = (ImageView) view.findViewById(R.id.imagePlayer);
        TextView txtName = (TextView) view.findViewById(R.id.playerName);
        TextView txtDOB = (TextView) view.findViewById(R.id.playerYOB);
        ImageView imgFlag = (ImageView) view.findViewById(R.id.flag);

        FootballPlayers fbplayers = fbList.get(i);
        imgPlayer.setImageResource(fbplayers.getImgPlayers());
        txtName.setText(fbplayers.getName());
        txtDOB.setText(fbplayers.getDob());
        imgFlag.setImageResource(fbplayers.getImgFlag());
        return view;
    }
}

