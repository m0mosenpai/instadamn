package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IvC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42717IvC implements InterfaceC28011Xf {
    public final UserSession A00;

    @Override // X.InterfaceC28011Xf
    public final boolean AC7(C108104tt c108104tt) {
        boolean z;
        C14360o3.A0B(c108104tt, 0);
        C38321qM A02 = C1DW.A00(this.A00).A02(c108104tt.A04);
        if (A02 != null) {
            z = A02.A5l();
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        boolean z;
        C38321qM A0E;
        C3XG c3xg = (C3XG) obj;
        if (c3xg != null && (A0E = AbstractC37300Gc1.A0E(c3xg)) != null) {
            z = A0E.A5l();
        } else {
            z = false;
        }
        return !z;
    }

    public C42717IvC(UserSession userSession) {
        this.A00 = userSession;
    }
}
