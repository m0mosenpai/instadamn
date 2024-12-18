package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.Ol7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55514Ol7 implements AbsListView.RecyclerListener {
    public final /* synthetic */ N7W A00;

    public C55514Ol7(N7W n7w) {
        this.A00 = n7w;
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        C53621NnS c53621NnS = (C53621NnS) AbstractC31172DnG.A0x(view);
        c53621NnS.A05.removeTextChangedListener(c53621NnS.A02);
    }
}
