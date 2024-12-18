package com.instagram.direct.fragment.prompts;

import X.AbstractC110824yu;
import X.AbstractC31173DnH;
import X.C3F5;
import X.C51109MiE;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class DirectDailyPromptsCreationFragment$CustomAutoscrollLinearLayoutManger extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C51109MiE c51109MiE = new C51109MiE(AbstractC31173DnH.A06(recyclerView, 0), 1);
        ((AbstractC110824yu) c51109MiE).A00 = i;
        A10(c51109MiE);
    }
}
