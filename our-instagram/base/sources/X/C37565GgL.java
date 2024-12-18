package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GgL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37565GgL implements InterfaceC64212vg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C1M1 A01;
    public final /* synthetic */ String A02;

    public C37565GgL(UserSession userSession, C1M1 c1m1, String str) {
        this.A00 = userSession;
        this.A01 = c1m1;
        this.A02 = str;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(c120985dq, obj2, enumC64262vl);
        C38321qM c38321qM = c120985dq.A02;
        UserSession userSession = this.A00;
        return new C82573mL(enumC64262vl, AbstractC82563mK.A04(userSession, c38321qM), this.A01.getSessionId(), AbstractC37564GgK.A02(c120985dq), this.A02, AbstractC82563mK.A06(AbstractC37302Gc3.A0b(c120985dq.A02)), AbstractC82563mK.A03(userSession, c120985dq.A02), f, 0, -1, -1, -1, -1, -1, -1, AbstractC82563mK.A00(c120985dq.A02), j, j2);
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        return AbstractC37303Gc4.A05(obj);
    }
}
