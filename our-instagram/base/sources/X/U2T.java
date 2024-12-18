package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U2T {
    public int A00;
    public C1ON A01;
    public C34520FJg A02;
    public U2I A03;
    public final int A04;
    public final UserSession A05;
    public final boolean A06;
    public final boolean A07;

    public U2T(UserSession userSession) {
        this.A05 = userSession;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        this.A06 = C18U.A06(A0U, userSession, 36321662248953515L);
        this.A04 = (int) C18U.A01(A0U, userSession, 36603137225790351L);
        this.A07 = C14360o3.A0K(C18U.A04(A0U, userSession, 36884612202431049L), "chaining");
    }
}
