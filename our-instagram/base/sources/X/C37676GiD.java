package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GiD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37676GiD implements C33R {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ BLI A01;
    public final /* synthetic */ boolean A02;

    public C37676GiD(C38321qM c38321qM, BLI bli, boolean z) {
        this.A02 = z;
        this.A00 = c38321qM;
        this.A01 = bli;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C37648Ghh c37648Ghh;
        ILR ilr;
        EnumC37742GjH enumC37742GjH;
        C14360o3.A0B(c75113Zb, 0);
        if (i == 46 && C14360o3.A0K(c75113Zb.A0y, true) && c75113Zb.A1p && !this.A02) {
            C38321qM c38321qM = this.A00;
            BLI bli = this.A01;
            UserSession userSession = bli.A0A;
            C14360o3.A0B(c38321qM, 0);
            C14360o3.A0B(userSession, 1);
            if (!c38321qM.A4Y() && C18U.A06(C06090Tz.A05, userSession, 36323105357966318L)) {
                c37648Ghh = bli.A08.A0F;
                if (c37648Ghh != null) {
                    ilr = (ILR) c37648Ghh.A04.getValue();
                    enumC37742GjH = EnumC37742GjH.A02;
                } else {
                    return;
                }
            } else {
                c37648Ghh = bli.A08.A0F;
                if (!c38321qM.A4Y() && C37906Gm3.A00(userSession, c37648Ghh) && C18U.A06(C06090Tz.A05, userSession, 36320201960267908L)) {
                    if (c37648Ghh == null) {
                        return;
                    }
                    ilr = (ILR) c37648Ghh.A04.getValue();
                    enumC37742GjH = EnumC37742GjH.A03;
                } else {
                    if (c38321qM.A4Y() || !C37906Gm3.A00(userSession, c37648Ghh) || !C18U.A06(C06090Tz.A05, userSession, 36320201960857741L) || c37648Ghh == null) {
                        return;
                    }
                    ilr = (ILR) c37648Ghh.A04.getValue();
                    enumC37742GjH = EnumC37742GjH.A04;
                }
            }
            C37729Gj4 A00 = ilr.A00(enumC37742GjH);
            AbstractC40919IAr.A00(bli.A06, userSession, bli.A0C, A00, c37648Ghh, enumC37742GjH, "expand_caption", bli.A0T, true);
        }
    }
}
