package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bbw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25841Bbw extends AbstractC52922bZ {
    public final UserSession A00;
    public final C38321qM A01;
    public final InterfaceC60442pS A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final C05A A06;
    public final C0UO A07;

    public C25841Bbw(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        Integer num;
        AbstractC25234BEr.A1P(userSession, str, c38321qM);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = interfaceC60442pS;
        this.A01 = c38321qM;
        this.A04 = C1XM.A00(new D8A(this, 48));
        this.A05 = C1XM.A00(new D8A(this, 49));
        if (c38321qM.A64()) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        C008002u A00 = C10E.A00(new C51598Mqq(C29365Cwy.A00, num, true));
        this.A06 = A00;
        this.A07 = AbstractC208910l.A02(A00);
    }
}
