package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bc4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25849Bc4 extends AbstractC52922bZ {
    public CRV A00;
    public final C2GS A01;
    public final UserSession A02;
    public final C28372CfY A03;
    public final C05A A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    public C25849Bc4(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A05 = AbstractC25225BEi.A1H(new ViewModelListUpdate());
        this.A03 = new C28372CfY(new C57748Pjb(this, 29));
        this.A01 = new C2GT(C1Z.A00);
        C008002u A00 = C10E.A00(C29348Cwh.A00);
        this.A04 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new PZB(this, (InterfaceC23621Ds) null, 18), AbstractC141776au.A00(this));
    }

    public final void A00() {
        this.A03.A04(false);
        this.A01.A0A(C1Y.A00);
    }
}
