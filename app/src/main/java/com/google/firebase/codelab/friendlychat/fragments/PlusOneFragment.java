package com.google.firebase.codelab.friendlychat.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.google.firebase.codelab.friendlychat.R;

import java.util.Arrays;
import java.util.List;

public class PlusOneFragment extends Fragment {

    private ListView list;
    String token = null;
    private SwipeRefreshLayout swipeLayout;

    public PlusOneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // On récupère le token dans les arguments du fragment
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_plus_one, container, false);

        list = (ListView) view.findViewById(R.id.list);

        //View header = getActivity().getLayoutInflater().inflate(R.layout.user_list_header, list, false);

        //list.addHeaderView(header, null, false);
        List<String> users = Arrays.asList("sup1", "sup2", "sup3");

       // adapter = new UserListAdapter(getContext(), users);
        //list.setAdapter(adapter);

     //   swipeLayout = (SwipeRefreshLayout) view.findViewById(R.id.users_swiperefresh);

        return view;
    }

}
