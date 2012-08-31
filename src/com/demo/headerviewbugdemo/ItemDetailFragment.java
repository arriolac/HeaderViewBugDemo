package com.demo.headerviewbugdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.demo.headerviewbugdemo.dummy.DummyContent;

import java.util.ArrayList;

public class ItemDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    DummyContent.DummyItem mItem;

    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
        if (mItem != null) {
            //((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        }

        
        return rootView;
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        
        // Add header
        ListView list = (ListView) getView().findViewById(R.id.list);
        View header = LayoutInflater.from(getActivity()).inflate(R.layout.header_text_view, null);
        TextView headerText = (TextView) header.findViewById(R.id.header_text);
        headerText.setText("This is a header. This is some garbage text. This is some more garbage text" +
        "garbage garbage garbage garbage garbasge garbage garbage garbage garbage garbage garbage garbage" +
        "garbage garbage garbage garbage garbasge garbage garbage garbage garbage garbage garbage garbage");
        list.addHeaderView(header);
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("six");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), 
                android.R.layout.simple_list_item_1);
        adapter.addAll(arrayList);
        list.setAdapter(adapter);
    }
}
