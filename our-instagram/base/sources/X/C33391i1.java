package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33391i1 implements InterfaceC29421bJ {
    public static final C0KV A01 = C33401i2.A00;
    public final C2DS A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C33351hx c33351hx = (C33351hx) c1ow;
        C14360o3.A0B(c33351hx, 0);
        C14360o3.A0B(mnp, 1);
        AbstractC31275Dox.A0G(c33351hx, this.A00, ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C33351hx c33351hx = (C33351hx) c1ow;
        C14360o3.A0B(c33351hx, 0);
        C14360o3.A0B(mnp2, 2);
        AbstractC31275Dox.A0G(c33351hx, this.A00, ((JTV) mnp2).A02);
    }

    public C33391i1(UserSession userSession) {
        this.A00 = AbstractC28761aE.A00(userSession);
    }
}
