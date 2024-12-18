package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GiF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37678GiF extends C0T6 {
    public final EnumC71343Hv A00;
    public final InterfaceC30930Dik A01;
    public final C120985dq A02;
    public final C37616GhB A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37678GiF) {
                C37678GiF c37678GiF = (C37678GiF) obj;
                if (!C14360o3.A0K(this.A02, c37678GiF.A02) || !C14360o3.A0K(this.A08, c37678GiF.A08) || !C14360o3.A0K(this.A07, c37678GiF.A07) || this.A00 != c37678GiF.A00 || !C14360o3.A0K(this.A04, c37678GiF.A04) || !C14360o3.A0K(this.A01, c37678GiF.A01) || this.A06 != c37678GiF.A06 || this.A05 != c37678GiF.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A06, (((((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166987dD.A0G(this.A02))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    public C37678GiF(EnumC71343Hv enumC71343Hv, InterfaceC30930Dik interfaceC30930Dik, C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, boolean z, boolean z2) {
        this.A02 = c120985dq;
        this.A08 = interfaceC60442pS;
        this.A07 = userSession;
        this.A00 = enumC71343Hv;
        this.A04 = num;
        this.A01 = interfaceC30930Dik;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = new C37616GhB(userSession, interfaceC60442pS);
    }
}
