package com.instagram.debug.devoptions.eventvisualizer;

import X.AbstractC70663Fe;
import X.C0f9;
import X.C2UU;
import X.C9GR;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class EventVisualizerView extends FrameLayout {
    public EventViewDelegate mDelegate;
    public View mFilterButton;
    public View mInteractiveButton;
    public View mMainContentView;
    public RecyclerView mRecyclerView;

    /* loaded from: classes11.dex */
    public interface EventViewDelegate {
        void onFilterButtonClicked(View view);

        void onInteractiveButtonClicked();
    }

    public void requestScrollToPosition(int i) {
        AbstractC70663Fe abstractC70663Fe = this.mRecyclerView.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A1O(i);
        }
    }

    public void setAdapter(C2UU c2uu) {
        this.mRecyclerView.setAdapter(c2uu);
    }

    public void setInteractive() {
        this.mRecyclerView.setClickable(true);
        this.mRecyclerView.setOnTouchListener(null);
    }

    public void setLayoutManager(AbstractC70663Fe abstractC70663Fe) {
        this.mRecyclerView.setLayoutManager(abstractC70663Fe);
    }

    public void setNotInteractive() {
        this.mRecyclerView.setClickable(false);
        this.mRecyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                EventVisualizerView.this.mMainContentView.dispatchTouchEvent(motionEvent);
                return true;
            }
        });
    }

    public EventVisualizerView(Context context, EventViewDelegate eventViewDelegate) {
        super(context);
        this.mDelegate = eventViewDelegate;
        initView();
    }

    private void initView() {
        Context context = getContext();
        View.inflate(context, R.layout.event_visualizer, this);
        RecyclerView recyclerView = (RecyclerView) requireViewById(R.id.recyclerView);
        this.mRecyclerView = recyclerView;
        recyclerView.A10(new EventItemDecoration(context));
        View requireViewById = requireViewById(R.id.interactive_button);
        this.mInteractiveButton = requireViewById;
        requireViewById.setOnClickListener(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(-1009426018);
                EventViewDelegate eventViewDelegate = EventVisualizerView.this.mDelegate;
                if (eventViewDelegate != null) {
                    eventViewDelegate.onInteractiveButtonClicked();
                }
                C0f9.A0C(-365758403, A05);
            }
        });
        View requireViewById2 = requireViewById(R.id.filter_button);
        this.mFilterButton = requireViewById2;
        requireViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int A05 = C0f9.A05(-380423428);
                EventViewDelegate eventViewDelegate = EventVisualizerView.this.mDelegate;
                if (eventViewDelegate != null) {
                    eventViewDelegate.onFilterButtonClicked(view);
                }
                C0f9.A0C(458857961, A05);
            }
        });
        setNotInteractive();
    }

    public void setMainContentView(View view) {
        this.mMainContentView = view;
    }

    public void showEventDetail(String str) {
        if (EventVisualizerController.getInstance().mInteractiveMode) {
            C9GR.A09(getContext(), str);
        }
    }
}
