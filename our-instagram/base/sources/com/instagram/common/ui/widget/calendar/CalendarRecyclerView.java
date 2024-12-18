package com.instagram.common.ui.widget.calendar;

import X.AbstractC166987dD;
import X.AbstractC51171MjF;
import X.C2UU;
import X.C70783Fq;
import X.JnN;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public class CalendarRecyclerView extends RecyclerView {
    public final GridLayoutManager A00;

    public CalendarRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(C2UU c2uu) {
        if (c2uu instanceof AbstractC51171MjF) {
            JnN.A00(this.A00, c2uu, 5);
            super.setAdapter(c2uu);
            return;
        }
        throw AbstractC166987dD.A12("adapter must be an instance of CalendarAdapter");
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), AbstractC51171MjF.A05);
        this.A00 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        C70783Fq recycledViewPool = getRecycledViewPool();
        recycledViewPool.A02(2, 21);
        recycledViewPool.A02(0, 90);
        recycledViewPool.A02(1, 28);
    }

    public CalendarRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
