package X;

import java.util.List;

/* renamed from: X.AlO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24031AlO implements GZN {
    public final /* synthetic */ C187128Rf A00;

    public C24031AlO(C187128Rf c187128Rf) {
        this.A00 = c187128Rf;
    }

    @Override // X.GZN
    public final void DlA(List list) {
        C187128Rf.A04(this.A00, AbstractC166987dD.A1a(AbstractC166987dD.A16(list)));
    }

    @Override // X.GZN
    public final void onCancel() {
        C187128Rf.A05(this.A00, false, false);
    }
}
