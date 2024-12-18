package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class L6F {
    public final /* synthetic */ AnonymousClass983 A00;

    public L6F(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    public final void A00(int i) {
        C7W4 A01 = AnonymousClass983.A01(this.A00);
        RecyclerView recyclerView = A01.A04;
        if (recyclerView != null) {
            if (recyclerView.canScrollVertically(1)) {
                i = A01.A00;
            }
            A01.A00 = i;
            RecyclerView recyclerView2 = A01.A04;
            if (recyclerView2 != null) {
                int paddingBottom = recyclerView2.getPaddingBottom();
                RecyclerView recyclerView3 = A01.A04;
                if (recyclerView3 != null) {
                    AbstractC125325le A0F = AbstractC43592JPx.A0n(recyclerView3).A0F(true);
                    A0F.A06 = new C49609Lw2(A01, paddingBottom);
                    A0F.A0H();
                    C7XA c7xa = A01.A0j.A0H;
                    c7xa.A00 = A01.A00;
                    C7XA.A01(c7xa);
                    return;
                }
            }
        }
        C14360o3.A0F("messageRecyclerView");
        throw C00O.createAndThrow();
    }
}
