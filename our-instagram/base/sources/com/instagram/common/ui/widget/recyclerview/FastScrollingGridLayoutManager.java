package com.instagram.common.ui.widget.recyclerview;

import X.AbstractC110824yu;
import X.C3F5;
import X.C51103Mi8;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FastScrollingGridLayoutManager extends GridLayoutManager {
    public float A00;
    public final Context A01;

    public FastScrollingGridLayoutManager(Context context, int i) {
        super(context, i);
        this.A01 = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        float f;
        int abs = Math.abs(i - A1a());
        if (abs < 10) {
            f = 25.0f;
        } else {
            f = 2.0f;
            if (abs < 100) {
                f = 10.0f;
            }
        }
        this.A00 = f;
        C51103Mi8 c51103Mi8 = new C51103Mi8(this.A01, this);
        ((AbstractC110824yu) c51103Mi8).A00 = i;
        A10(c51103Mi8);
    }
}
