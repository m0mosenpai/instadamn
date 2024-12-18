package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Izk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42994Izk implements InterfaceC64212vg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ C1M1 A02;

    public C42994Izk(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A00 = userSession;
        this.A02 = c1m1;
        this.A01 = interfaceC60442pS;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        C38321qM c38321qM = (C38321qM) obj;
        AbstractC167027dH.A12(c38321qM, obj2, enumC64262vl);
        UserSession userSession = this.A00;
        String A04 = AbstractC82563mK.A04(userSession, c38321qM);
        String sessionId = this.A02.getSessionId();
        String id = c38321qM.getId();
        if (id == null) {
            id = "n/a";
        }
        return new C82573mL(enumC64262vl, A04, sessionId, id, this.A01.getModuleName(), AbstractC37302Gc3.A0c(c38321qM), AbstractC82563mK.A03(userSession, c38321qM), f, 0, -1, -1, -1, -1, -1, -1, AbstractC82563mK.A00(c38321qM), j, j2);
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        return AbstractC82563mK.A01(AbstractC37301Gc2.A0H(obj));
    }
}
