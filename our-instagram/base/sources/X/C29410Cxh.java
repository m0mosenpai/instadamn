package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cxh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29410Cxh implements InterfaceC31153Dmx {
    public final C96444Vc A00;
    public final UserSession A01;

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ABE() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean APV() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ARV() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ARg() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ARl() {
        return true;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ARr() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CMq() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CUw() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CUx() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CY7() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CZR() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CeF() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean Cfo() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean Cte() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean EF2() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean EjV() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean Epx() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final String ADB() {
        if (C18U.A06(C06090Tz.A06, this.A01, 36319209825246272L)) {
            return "cross";
        }
        return "back_arrow";
    }

    @Override // X.InterfaceC31079DlM
    public final boolean APO() {
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession) && C18U.A06(C06090Tz.A06, userSession, 36319209824656442L)) {
            return AbstractC166997dE.A1Z(Aoz(), false);
        }
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final Float Aoy() {
        C06090Tz c06090Tz;
        long j;
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession)) {
            C96444Vc c96444Vc = this.A00;
            if (c96444Vc.A03 && AbstractC96454Vd.A00(c96444Vc)) {
                c06090Tz = C06090Tz.A06;
                j = 37163634754650410L;
            } else {
                c06090Tz = C06090Tz.A06;
                j = 37163634754584873L;
            }
            return AbstractC25229BEm.A0k(c06090Tz, userSession, j);
        }
        return Float.valueOf(0.2f);
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean Aoz() {
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession)) {
            return AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36319209824721979L);
        }
        return AbstractC166997dE.A0a();
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean Ap0() {
        boolean A06;
        UserSession userSession = this.A01;
        if (!AbstractC28385Cfo.A03(userSession)) {
            return AbstractC166997dE.A0a();
        }
        C96444Vc c96444Vc = this.A00;
        if (c96444Vc.A03 && AbstractC96454Vd.A00(c96444Vc) && C18U.A06(C06090Tz.A06, userSession, 36319209825836104L)) {
            A06 = false;
        } else {
            A06 = C18U.A06(C06090Tz.A06, userSession, 36319209824656442L);
        }
        return Boolean.valueOf(A06);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean BOT() {
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession)) {
            return C18U.A06(C06090Tz.A06, userSession, 36319209824590905L);
        }
        return true;
    }

    @Override // X.InterfaceC31079DlM
    public final Float BPu() {
        return AbstractC25229BEm.A0k(C06090Tz.A06, this.A01, 37163634755109163L);
    }

    @Override // X.InterfaceC31079DlM
    public final String BRh() {
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession)) {
            return C18U.A04(C06090Tz.A06, userSession, 36882159778202038L);
        }
        return "disabled";
    }

    @Override // X.InterfaceC31079DlM
    public final String BRi() {
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession)) {
            return C18U.A04(C06090Tz.A06, userSession, 36882159778267575L);
        }
        return "expand_browser";
    }

    @Override // X.InterfaceC31079DlM
    public final float BTo() {
        UserSession userSession = this.A01;
        if (AbstractC28385Cfo.A03(userSession)) {
            return AbstractC25225BEi.A00(C06090Tz.A06, userSession, 37163634754257192L);
        }
        return 0.2f;
    }

    public C29410Cxh(UserSession userSession, C96444Vc c96444Vc) {
        this.A01 = userSession;
        this.A00 = c96444Vc;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ String AEJ() {
        return "cross";
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ Boolean ARh() {
        return AbstractC166997dE.A0a();
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ float B6t() {
        return 0.35f;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ float B6u() {
        return 0.45f;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ Boolean BDd() {
        return AbstractC166997dE.A0a();
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ Boolean BDe() {
        return AbstractC166997dE.A0a();
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
