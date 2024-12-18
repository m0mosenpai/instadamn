package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OEU {
    public String A00;
    public final UserSession A01;
    public final AnonymousClass501 A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;

    public OEU(UserSession userSession) {
        this.A01 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H(new C54977OTj(false, true, false));
        this.A04 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A03 = A0o;
        this.A05 = AbstractC208910l.A02(A0o);
        this.A02 = new AnonymousClass500(userSession.userId);
    }
}
