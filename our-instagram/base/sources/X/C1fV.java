package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1fV implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fW
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1818103146);
            int A032 = C0f9.A03(-2086734315);
            C1fV c1fV = new C1fV(userSession);
            C0f9.A0A(504358602, A032);
            C0f9.A0A(-106373760, A03);
            return c1fV;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31851fT c31851fT = (C31851fT) c1ow;
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c31851fT.A00;
        boolean z = c31851fT.A01;
        boolean z2 = c31851fT.A02.A09;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(directThreadKey, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0L("direct_v2/threads/%s/mark_unread/", directThreadKey.A00);
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
        c25621Ms.A0I("marked", z);
        if (z2) {
            c25621Ms.A9s("sampled", "true");
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C1fV(UserSession userSession) {
        this.A00 = userSession;
    }
}
