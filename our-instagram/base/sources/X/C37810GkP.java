package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GkP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37810GkP implements InterfaceC128465rF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C37810GkP(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.InterfaceC128465rF
    public final /* bridge */ /* synthetic */ XaW ATw(C206209Bd c206209Bd, Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        C120985dq c120985dq = (C120985dq) obj;
        String A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(AbstractC37301Gc2.A0G(c120985dq)));
        C38321qM c38321qM = c120985dq.A02;
        UserSession userSession = this.A00;
        String A04 = AbstractC82563mK.A04(userSession, c38321qM);
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && !c38321qM2.CdW()) {
            enumC64262vl = EnumC64262vl.A04;
        } else {
            enumC64262vl = EnumC64262vl.A05;
        }
        C16930sl c16930sl = C16930sl.A00;
        long A0t = AbstractC25232BEp.A0t((Number) c206209Bd.A00);
        boolean A1a = AbstractC31177DnL.A1a((Boolean) c206209Bd.A01);
        return new XaW(enumC64262vl, A04, this.A01, A06, AbstractC37564GgK.A02(c120985dq), AbstractC82563mK.A03(userSession, c120985dq.A02), c16930sl, A0t, A1a);
    }

    @Override // X.InterfaceC128465rF
    public final /* bridge */ /* synthetic */ C9CQ ATv(Object obj, Object obj2) {
        return AbstractC37303Gc4.A05(obj);
    }
}