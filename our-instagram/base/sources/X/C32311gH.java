package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32311gH implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1gI
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1122619210);
            int A032 = C0f9.A03(494166892);
            C32311gH c32311gH = new C32311gH(userSession);
            C0f9.A0A(-1769949301, A032);
            C0f9.A0A(2109936888, A03);
            return c32311gH;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C32291gF c32291gF = (C32291gF) c1ow;
        UserSession userSession = this.A00;
        DirectThreadKey C7Q = c32291gF.C7Q();
        String str = c32291gF.A05;
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0L("direct_v2/threads/%s/leave/", C7Q.A00);
        c25621Ms.A9s("client_context", str);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C32311gH(UserSession userSession) {
        this.A00 = userSession;
    }
}
