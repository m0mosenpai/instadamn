package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32691gt implements InterfaceC29421bJ {
    public static final C0KV A02 = C32701gu.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new MHI(this, 46));

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C32651gp c32651gp = (C32651gp) c1ow;
        C14360o3.A0B(c32651gp, 0);
        C14360o3.A0B(mnp, 1);
        AbstractC31275Dox.A02(this.A00, c32651gp, (C2DS) this.A01.getValue(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C32651gp c32651gp = (C32651gp) c1ow;
        C14360o3.A0B(c32651gp, 0);
        C14360o3.A0B(mnp2, 2);
        AbstractC31275Dox.A02(this.A00, c32651gp, (C2DS) this.A01.getValue(), ((JTV) mnp2).A02);
    }

    public C32691gt(UserSession userSession) {
        this.A00 = userSession;
    }
}