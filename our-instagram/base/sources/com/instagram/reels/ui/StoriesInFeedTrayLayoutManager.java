package com.instagram.reels.ui;

import X.AbstractC110824yu;
import X.AbstractC166997dE;
import X.C110814yt;
import X.C14360o3;
import X.C3F5;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class StoriesInFeedTrayLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C14360o3.A0B(recyclerView, 0);
        C110814yt c110814yt = new C110814yt(AbstractC166997dE.A0L(recyclerView));
        ((AbstractC110824yu) c110814yt).A00 = i;
        A10(c110814yt);
    }
}
