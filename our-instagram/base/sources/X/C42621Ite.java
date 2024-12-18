package X;

import android.view.View;

/* renamed from: X.Ite, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42621Ite implements InterfaceC152866uG {
    public final /* synthetic */ HEN A00;

    @Override // X.InterfaceC152866uG
    public final void AAn(C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        C63622uj c63622uj = this.A00.A01;
        String id = c38321qM.getId();
        if (id != null) {
            Integer valueOf = Integer.valueOf(i);
            String id2 = c38321qM.getId();
            if (id2 != null) {
                c63622uj.A01(C59062n7.A00(c38321qM, valueOf, id2).A01(), id);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C42621Ite(HEN hen) {
        this.A00 = hen;
    }

    @Override // X.InterfaceC152866uG
    public final void EDr(View view, C38321qM c38321qM) {
        HEN hen = this.A00;
        C57112jm c57112jm = hen.A00;
        C63622uj c63622uj = hen.A01;
        String id = c38321qM.getId();
        if (id != null) {
            AbstractC37304Gc5.A0u(view, c57112jm, c63622uj, id);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
