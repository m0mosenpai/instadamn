package com.instagram.debug.devoptions.eventvisualizer;

import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.C0f9;
import X.C2UU;
import X.C3OO;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class EventVisualizerAdapter extends C2UU {
    public final List mData = new ArrayList();
    public EventDataDelegate mDelegate;

    /* loaded from: classes11.dex */
    public interface EventDataDelegate {
        void onEventDetailRequest(EventVisualizerLogger.EventData eventData);
    }

    /* loaded from: classes11.dex */
    public class ViewHolder extends C3OO {
        public TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.requireViewById(R.id.text1);
        }
    }

    public void addNewData(EventVisualizerLogger.EventData eventData) {
        this.mData.add(0, eventData);
        notifyItemInserted(0);
    }

    public void clearData() {
        this.mData.clear();
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(((EventVisualizerLogger.EventData) this.mData.get(i)).mName);
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-1865786049);
        int size = this.mData.size();
        C0f9.A0A(-1183789279, A03);
        return size;
    }

    @Override // X.C2UU
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final ViewHolder viewHolder = new ViewHolder(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.event_visualizer_row_view));
        viewHolder.textView.setLongClickable(true);
        viewHolder.textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerAdapter.1
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                EventVisualizerAdapter eventVisualizerAdapter = EventVisualizerAdapter.this;
                EventDataDelegate eventDataDelegate = eventVisualizerAdapter.mDelegate;
                if (eventDataDelegate != null) {
                    eventDataDelegate.onEventDetailRequest((EventVisualizerLogger.EventData) eventVisualizerAdapter.mData.get(viewHolder.getBindingAdapterPosition()));
                    return true;
                }
                return true;
            }
        });
        return viewHolder;
    }

    public void setDelegate(EventDataDelegate eventDataDelegate) {
        this.mDelegate = eventDataDelegate;
    }
}
