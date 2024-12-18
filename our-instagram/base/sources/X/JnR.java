package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JnR extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C51111MiG c51111MiG = new C51111MiG(recyclerView.getContext(), this, 0);
        ((AbstractC110824yu) c51111MiG).A00 = i;
        A10(c51111MiG);
    }
}
