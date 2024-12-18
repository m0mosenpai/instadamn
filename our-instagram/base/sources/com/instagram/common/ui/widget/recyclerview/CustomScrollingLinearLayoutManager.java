package com.instagram.common.ui.widget.recyclerview;

import X.AbstractC110824yu;
import X.C18C;
import X.C3F5;
import X.MUC;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class CustomScrollingLinearLayoutManager extends LinearLayoutManagerCompat {
    public float A00;
    public boolean A01;
    public final boolean A02;
    public final Context A03;

    public CustomScrollingLinearLayoutManager(Context context, float f, int i, boolean z) {
        super(context, i, false);
        ((LinearLayoutManagerCompat) this).A00 = -1;
        ((LinearLayoutManagerCompat) this).A01 = -1;
        ((LinearLayoutManagerCompat) this).A02 = false;
        this.A01 = true;
        this.A03 = context;
        this.A00 = f;
        this.A02 = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        boolean z = false;
        if (this.A00 > 0.0f) {
            z = true;
        }
        C18C.A0G(z, "Cannot perform smooth scrolling with non positive scrolling speed.");
        MUC muc = new MUC(this.A03, this);
        ((AbstractC110824yu) muc).A00 = i;
        A10(muc);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A1X() {
        if (this.A01 && ((LinearLayoutManager) this).A01 == 0) {
            return true;
        }
        return false;
    }
}
