package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IsE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42535IsE implements InterfaceC64342vt {
    public final C30Y A00;

    @Override // X.InterfaceC64342vt
    public final C30Y AXL() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.30a, java.lang.Object] */
    public C42535IsE(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C30Y c30y;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36311985688544094L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36311985688609631L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36311985688478557L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36311985688413020L);
        if (AbstractC40596HzG.A00(userSession)) {
            c30y = new C30Y(userSession, new Object(), new C37451GeV(userSession, A063, A064, A06, A062), interfaceC60442pS);
        } else {
            c30y = null;
        }
        this.A00 = c30y;
    }
}
