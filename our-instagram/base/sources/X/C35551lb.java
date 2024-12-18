package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35551lb implements InterfaceC29301b7 {
    public static final C0KV A01 = C35561lc.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C35531lZ c35531lZ = (C35531lZ) c1ow;
        C14360o3.A0B(c35531lZ, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        C32226EDz A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        String str = c35531lZ.A01;
        if (str != null) {
            int i = c35531lZ.A00;
            String str2 = c35531lZ.A05;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0L("direct_v2/threads/%s/set_locked_status/", str);
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            c25621Ms.A0D("locked_status", i);
            c25621Ms.A9s("mutation_token", str2);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = A00;
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }

    public C35551lb(UserSession userSession) {
        this.A00 = userSession;
    }
}
