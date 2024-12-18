package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLP extends C3CI {
    public final InterfaceC147026je A00;
    public final UserSession A01;
    public final InterfaceC114805Gn A02;

    @Override // X.C36Z
    public final Class CAO() {
        return C41181vS.class;
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtH(Object obj) {
        this.A00.DNf((C41181vS) obj);
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
        this.A00.DNx((C41181vS) obj, i);
    }

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        C41551w4 c41551w4 = (C41551w4) this.A02.getItem(i);
        if (c41551w4 != null) {
            C41181vS A08 = c41551w4.A08(this.A01);
            if (!A08.A1O()) {
                c3ab.FDo(A08.CGe(), A08, i);
            }
        }
    }

    public HLP(UserSession userSession, InterfaceC147026je interfaceC147026je, InterfaceC114805Gn interfaceC114805Gn) {
        this.A01 = userSession;
        this.A02 = interfaceC114805Gn;
        this.A00 = interfaceC147026je;
    }
}
