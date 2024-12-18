package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WjM implements GXY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C66151U1s A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public WjM(C66151U1s c66151U1s, String str, String str2, String str3, long j, boolean z) {
        this.A01 = c66151U1s;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A05 = z;
    }

    @Override // X.GXY
    public final void Dsp() {
        long A07 = AbstractC43593JPy.A07();
        C66151U1s c66151U1s = this.A01;
        boolean z = c66151U1s.A09;
        if (!z) {
            AbstractC66181U2w.A03(c66151U1s.A03, this.A03, this.A02, c66151U1s.A07, this.A04, this.A00, A07);
        }
        if (!this.A05 && !C14360o3.A0K(this.A02, "ig_search:serp_hcm_pill") && (c66151U1s.A08 || z)) {
            new C140966Yy(c66151U1s.A01, c66151U1s.A04).A06();
        }
        UserSession userSession = c66151U1s.A04;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36327950082325499L)) {
            AbstractC35257Fgr.A08(userSession, c66151U1s.A01, EnumC33519Ers.A0B.toString());
        }
    }
}
