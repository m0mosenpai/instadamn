package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GuH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38380GuH extends C1I4 {
    public final /* synthetic */ C42661IuI A00;

    public C38380GuH(C42661IuI c42661IuI) {
        this.A00 = c42661IuI;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        AbstractC70663Fe abstractC70663Fe;
        int A03 = C0f9.A03(-549399639);
        if (i == 0 && (abstractC70663Fe = recyclerView.A0D) != null) {
            this.A00.A00 = abstractC70663Fe.A1M();
        }
        C0f9.A0A(-1509764369, A03);
    }
}
