package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2RN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RN implements C0KV {
    public final /* synthetic */ C2QQ A00;

    public C2RN(C2QQ c2qq) {
        this.A00 = c2qq;
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-457349338);
        int A032 = C0f9.A03(-861070297);
        InterfaceC13030lp interfaceC13030lp = new InterfaceC13030lp() { // from class: X.2RO
            @Override // X.InterfaceC13030lp
            public final void DyC(boolean z) {
                C0TP c0tp;
                C1TU c1tu = this.A00.A01;
                UserSession userSession2 = userSession;
                c1tu.A07 = userSession2;
                int A01 = (int) C18U.A01(C06090Tz.A05, userSession2, 36610425785161779L);
                if (A01 != 2) {
                    if (A01 != 3) {
                        c0tp = C1TU.A0F;
                    } else {
                        c0tp = C1TU.A0E;
                    }
                } else {
                    c0tp = C1TU.A0G;
                }
                c1tu.A03 = c0tp;
                c1tu.A06 = AbstractC12220kQ.A00(c1tu, C12180kM.A02, userSession2);
            }
        };
        C0f9.A0A(-444202293, A032);
        C0f9.A0A(273438579, A03);
        return interfaceC13030lp;
    }
}
