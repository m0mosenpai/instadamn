package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.56S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56S {
    public InterfaceC46822Cv A00;
    public final InterfaceC222916i A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;
    public static final String A06 = C56S.class.getName();
    public static final InterfaceC08100bW A05 = new C1QF("IgSecureUriParser").A00;

    public C56S(UserSession userSession, boolean z, boolean z2) {
        InterfaceC46822Cv A00;
        C14360o3.A0B(userSession, 1);
        this.A04 = z;
        this.A03 = z2;
        C222816h c222816h = C222816h.A06;
        C14360o3.A08(c222816h);
        this.A01 = c222816h;
        if (C18U.A06(C06090Tz.A05, userSession, 36320756010853235L)) {
            A00 = AbstractC46782Cq.A00(userSession);
        } else {
            A00 = AbstractC54278Nyy.A00(userSession);
        }
        this.A00 = A00;
        this.A02 = userSession;
    }
}
