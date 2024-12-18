package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147426kS {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final UserSession A03;
    public final C147436kT A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final boolean A07;
    public final boolean A08;

    public C147426kS(UserSession userSession) {
        C147436kT c147436kT;
        this.A03 = userSession;
        if (C18U.A06(C06090Tz.A05, userSession, 36320506904257132L)) {
            c147436kT = (C147436kT) userSession.A01(C147436kT.class, new J8V(userSession, 31));
        } else {
            c147436kT = new C147436kT(userSession);
        }
        this.A04 = c147436kT;
        this.A05 = AbstractC09440dt.A01(C142776cd.A00);
        this.A06 = AbstractC09440dt.A01(C142786ce.A00);
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A08 = C18U.A06(c06090Tz, userSession, 36320506903929449L);
        this.A07 = C18U.A06(c06090Tz, userSession, 36320506904060522L);
        this.A02 = C18U.A01(c06090Tz, userSession, 36601981880832440L);
    }
}
