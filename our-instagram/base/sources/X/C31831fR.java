package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31831fR implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fS
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1669233452);
            int A032 = C0f9.A03(361086583);
            C31831fR c31831fR = new C31831fR(userSession);
            C0f9.A0A(-1047822796, A032);
            C0f9.A0A(484095857, A03);
            return c31831fR;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        UserSession userSession = this.A00;
        String str = ((C31811fP) c1ow).A00.A00;
        C18C.A07(str, "thread id must not be null");
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0L("direct_v2/threads/%s/mark_valued_request/", str);
        c25621Ms.A9s("marked", "false");
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C31831fR(UserSession userSession) {
        this.A00 = userSession;
    }
}
