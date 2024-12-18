package com.instagram.common.ui.widget.recyclerview;

import X.C3F5;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class FastScrollingLinearLayoutManager extends CustomScrollingLinearLayoutManager {
    public FastScrollingLinearLayoutManager(Context context) {
        super(context, 25.0f, 1, false);
    }

    @Override // com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
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
        ((CustomScrollingLinearLayoutManager) this).A00 = f;
        super.A1T(c3f5, recyclerView, i);
    }
}
