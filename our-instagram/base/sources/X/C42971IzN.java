package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IzN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42971IzN implements JHV {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C42971IzN(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    @Override // X.JHV
    public final /* bridge */ /* synthetic */ C9CQ ATt(Object obj, Object obj2) {
        return AbstractC37303Gc4.A05(obj);
    }

    @Override // X.JHV
    public final /* bridge */ /* synthetic */ C72274XaV ATu(XVS xvs, Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        C120985dq A0A = AbstractC37301Gc2.A0A(obj);
        String str = this.A01;
        String A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(A0A.A02));
        UserSession userSession = this.A00;
        String A0S = AbstractC37303Gc4.A0S(A0A, userSession);
        String A04 = AbstractC82563mK.A04(userSession, A0A.A02);
        C38321qM c38321qM = A0A.A02;
        if (c38321qM != null && !c38321qM.CdW()) {
            enumC64262vl = EnumC64262vl.A04;
        } else {
            enumC64262vl = EnumC64262vl.A05;
        }
        return new C72274XaV(xvs, enumC64262vl, str, A06, A0S, A04, AbstractC37564GgK.A02(A0A), C16930sl.A00, System.currentTimeMillis());
    }
}
