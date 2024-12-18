package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32171g1 implements InterfaceC29421bJ {
    public static final C0KV A01 = C32181g2.A00;
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C32131fx c32131fx = (C32131fx) c1ow;
        C14360o3.A0B(c32131fx, 0);
        C14360o3.A0B(mnp, 1);
        AbstractC31275Dox.A0H(c32131fx, (C2DS) this.A00.getValue(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C32131fx c32131fx = (C32131fx) c1ow;
        C14360o3.A0B(c32131fx, 0);
        C14360o3.A0B(mnp2, 2);
        AbstractC31275Dox.A0H(c32131fx, (C2DS) this.A00.getValue(), ((JTV) mnp2).A02);
    }

    public C32171g1(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new MHI(userSession, 49));
    }
}
