package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DsY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31488DsY extends C1I4 {
    public final C3A9 A00;

    public C31488DsY(RecyclerView recyclerView, AbstractC31433Drd abstractC31433Drd, C31440Drk c31440Drk) {
        this.A00 = new C3A9(recyclerView, new C65927TwY(c31440Drk, 3), new C31486DsW(abstractC31433Drd, c31440Drk), new C31487DsX(abstractC31433Drd, c31440Drk), new C31489DsZ(abstractC31433Drd, c31440Drk));
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(171667881);
        this.A00.A01();
        C0f9.A0A(805188377, A03);
    }
}
