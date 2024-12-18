package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Glj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37889Glj implements InterfaceC115315Jf {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C37889Glj(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC115315Jf
    public final /* bridge */ /* synthetic */ C9CQ AU2(Object obj, Object obj2) {
        return AbstractC37303Gc4.A05(obj);
    }

    @Override // X.InterfaceC115315Jf
    public final /* bridge */ /* synthetic */ C72271XaS AU3(Object obj, Object obj2) {
        C120985dq A0A = AbstractC37301Gc2.A0A(obj);
        String str = this.A01;
        String A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(A0A.A02));
        UserSession userSession = this.A00;
        String A0S = AbstractC37303Gc4.A0S(A0A, userSession);
        String A04 = AbstractC82563mK.A04(userSession, A0A.A02);
        return new C72271XaS(AbstractC37303Gc4.A0G(A0A), str, A06, A0S, A04, AbstractC37564GgK.A02(A0A), C16930sl.A00, System.currentTimeMillis());
    }
}
