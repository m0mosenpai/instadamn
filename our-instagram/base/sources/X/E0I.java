package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class E0I extends C1I4 {
    public final AbstractC60672pq A00;
    public final C3A9 A01;
    public final EQI A02;

    public E0I(AbstractC60672pq abstractC60672pq, EQI eqi) {
        this.A00 = abstractC60672pq;
        this.A02 = eqi;
        this.A01 = new C3A9(eqi, abstractC60672pq, new C32959Eeq(eqi));
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A0N = AbstractC167017dG.A0N(recyclerView, 1399955146);
        super.onScrolled(recyclerView, i, i2);
        if (!this.A00.isResumed()) {
            i3 = 232628787;
        } else {
            this.A01.A01();
            i3 = 2130770209;
        }
        C0f9.A0A(i3, A0N);
    }
}
