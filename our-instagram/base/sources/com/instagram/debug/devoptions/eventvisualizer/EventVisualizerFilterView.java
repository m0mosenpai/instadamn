package com.instagram.debug.devoptions.eventvisualizer;

import X.AbstractC167007dF;
import X.C0f9;
import X.C0fA;
import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class EventVisualizerFilterView extends FrameLayout {
    public ArrayAdapter mAdapter;
    public View mAddButton;
    public View mApplyButton;
    public View mClearButton;
    public FilterViewDelegate mDelegate;
    public EditText mEditText;
    public final ArrayList mFilters;
    public ListView mListView;

    /* loaded from: classes11.dex */
    public interface FilterViewDelegate {
        void onFilterAdded(String str);

        void onFilterApplied(List list);

        void onFilterCleared();
    }

    private void updateFilterView() {
        this.mEditText.getText().clear();
        C0fA.A00(this.mAdapter, 978541428);
    }

    public void clearFilter() {
        this.mFilters.clear();
        updateFilterView();
    }

    public EventVisualizerFilterView(Context context, FilterViewDelegate filterViewDelegate) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.mFilters = arrayList;
        this.mAdapter = new ArrayAdapter(getContext(), R.layout.simple_list_item_1, arrayList);
        this.mDelegate = filterViewDelegate;
        initView();
    }

    private void initView() {
        View.inflate(getContext(), com.facebook.R.layout.event_visualizer_filter, this);
        this.mEditText = (EditText) requireViewById(com.facebook.R.id.filter_edittext);
        ListView listView = (ListView) requireViewById(com.facebook.R.id.filterListView);
        this.mListView = listView;
        listView.setAdapter((ListAdapter) this.mAdapter);
        this.mAddButton = requireViewById(com.facebook.R.id.filter_add_button);
        this.mClearButton = requireViewById(com.facebook.R.id.filter_clear_button);
        this.mApplyButton = requireViewById(com.facebook.R.id.filter_apply_button);
        this.mAddButton.setOnClickListener(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerFilterView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(1464719946);
                EventVisualizerFilterView eventVisualizerFilterView = EventVisualizerFilterView.this;
                eventVisualizerFilterView.mDelegate.onFilterAdded(AbstractC167007dF.A0g(eventVisualizerFilterView.mEditText));
                C0f9.A0C(163318118, A05);
            }
        });
        this.mClearButton.setOnClickListener(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerFilterView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(165771106);
                EventVisualizerFilterView.this.mDelegate.onFilterCleared();
                C0f9.A0C(-2124329490, A05);
            }
        });
        this.mApplyButton.setOnClickListener(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerFilterView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(572469661);
                EventVisualizerFilterView eventVisualizerFilterView = EventVisualizerFilterView.this;
                eventVisualizerFilterView.mDelegate.onFilterApplied(eventVisualizerFilterView.mFilters);
                C0f9.A0C(1444060756, A05);
            }
        });
    }

    public void addFilter(String str) {
        if (!TextUtils.isEmpty(str) && !this.mFilters.contains(str)) {
            this.mFilters.add(str);
        }
        updateFilterView();
    }
}
