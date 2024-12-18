package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32571gh implements InterfaceC29421bJ {
    public static final C0KV A02 = C32581gi.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new MHI(this, 48));

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C32531gd c32531gd = (C32531gd) c1ow;
        C14360o3.A0B(c32531gd, 0);
        C14360o3.A0B(mnp, 1);
        AbstractC31275Dox.A03(this.A00, c32531gd, (C2DS) this.A01.getValue(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C32531gd c32531gd = (C32531gd) c1ow;
        C14360o3.A0B(c32531gd, 0);
        C14360o3.A0B(mnp2, 2);
        AbstractC31275Dox.A03(this.A00, c32531gd, (C2DS) this.A01.getValue(), ((JTV) mnp2).A02);
    }

    public C32571gh(UserSession userSession) {
        this.A00 = userSession;
    }
}
