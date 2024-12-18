package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35751lv implements InterfaceC29421bJ {
    public static final C0KV A01 = C35761lw.A00;
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C35691lp c35691lp = (C35691lp) c1ow;
        C14360o3.A0B(c35691lp, 0);
        C14360o3.A0B(mnp, 1);
        C35202Ffu.A00.A02(c35691lp, (C2DS) this.A00.getValue(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C35691lp c35691lp = (C35691lp) c1ow;
        C14360o3.A0B(c35691lp, 0);
        C14360o3.A0B(mnp2, 2);
        C35202Ffu.A00.A02(c35691lp, (C2DS) this.A00.getValue(), ((JTV) mnp2).A02);
    }

    public C35751lv(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new MHI(userSession, 44));
    }
}
