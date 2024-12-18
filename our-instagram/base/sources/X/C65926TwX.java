package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.TwX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65926TwX implements C3A8 {
    public final RecyclerView A00;

    @Override // X.C3A8
    public final void FDq(C3AB c3ab, C3A9 c3a9) {
        AbstractC70663Fe abstractC70663Fe = this.A00.A0D;
        abstractC70663Fe.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a == -1 || A1b == -1) {
            return;
        }
        while (A1a <= A1b) {
            c3a9.A02(c3ab, A1a);
            A1a++;
        }
    }

    public C65926TwX(RecyclerView recyclerView) {
        C18C.A0G(recyclerView.A0D instanceof LinearLayoutManager, "VisibleItemTracker's RecyclerPositionTracked isn't implemented to support recycler views not using LinearLayoutManager.");
        this.A00 = recyclerView;
    }
}
