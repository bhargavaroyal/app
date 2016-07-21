package bhargavaroyal.com.gp.fragment;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bhargavaroyal.com.gp.R;


/**
 * Created by hp on 20-07-2016.
 */
public class NumberFragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    int index = 0;
    String number [] = new String []{"one","two","three"};

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_number,container, false);
//            ListView list = (ListView)view.findViewById(R.id.list);
            TextView tvFragmentName = (TextView) view.findViewById(R.id.tvFragmentName);
            tvFragmentName.setText("This is Fragment " + index);
            return view;

    }


    @Override
    public void onClick(View v) {

    }
    public static NumberFragment newInstance(int index) {
        NumberFragment fragment = new NumberFragment();
        fragment.setIndex(index);
        return fragment;
    }




}
