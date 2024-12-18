package com.instagram.mainfeed.fragment.layoutmanager;

import X.C14360o3;
import X.C3F5;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* loaded from: classes2.dex */
public final class MainFeedLinearLayoutManager extends FastScrollingLinearLayoutManager {
    public boolean A00;

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1s(C3F5 c3f5, int[] iArr) {
        C14360o3.A0B(c3f5, 0);
        super.A1s(c3f5, iArr);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A1Y() {
        if (this.A00 && super.A1Y()) {
            return true;
        }
        return false;
    }
}
