package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MWZ {
    public OAM A00;
    public boolean A01;
    public final UserSession A02;
    public final C153506vL A03;
    public final String A04;
    public final InterfaceC09390do A05;
    public final C07X A06;

    public MWZ(C07X c07x, UserSession userSession, C153506vL c153506vL, String str) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = str;
        this.A06 = c07x;
        this.A03 = c153506vL;
        this.A05 = C1XM.A00(C57538PgC.A01(this, 9));
    }

    public static final void A00(MWZ mwz) {
        if (mwz.A01) {
            OAM oam = mwz.A00;
            if (oam != null) {
                oam.A02.A01(C05F.A00);
                return;
            }
            return;
        }
        AbstractC31177DnL.A1Q(mwz, C07Y.A00(mwz.A06), 13);
    }
}
