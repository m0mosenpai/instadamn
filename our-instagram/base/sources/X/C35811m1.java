package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35811m1 implements InterfaceC29421bJ {
    public static final C0KV A01 = C35821m2.A00;
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C35771lx c35771lx = (C35771lx) c1ow;
        C14360o3.A0B(c35771lx, 0);
        C14360o3.A0B(mnp, 1);
        C35202Ffu.A00(c35771lx, (C2DS) this.A00.getValue(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C35771lx c35771lx = (C35771lx) c1ow;
        C14360o3.A0B(c35771lx, 0);
        C14360o3.A0B(mnp2, 2);
        C35202Ffu.A00(c35771lx, (C2DS) this.A00.getValue(), ((JTV) mnp2).A02);
    }

    public C35811m1(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new MHI(userSession, 45));
    }
}
