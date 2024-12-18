package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DyO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31804DyO extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;
    public final UserSession A02;

    public C31804DyO(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        String string = AbstractC23021Ah.A00(userSession).A01.getString("translate_to_language", C00Q.A03(AbstractC166987dD.A19(C1Q2.A02()), 2));
        C008002u A1H = AbstractC25225BEi.A1H(string == null ? "" : string);
        this.A00 = A1H;
        this.A01 = AbstractC208910l.A02(A1H);
    }
}
