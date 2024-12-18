package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cxj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29412Cxj implements InterfaceC31153Dmx {
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
        if (C18U.A06(C06090Tz.A05, this.A01, 36321322947257664L)) {
            return "cross";
        }
        return "back_arrow";
    }

    @Override // X.InterfaceC31079DlM
    public final boolean APO() {
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36321322947716420L)) {
            return AbstractC166997dE.A1Z(Aoz(), false);
        }
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final Float Aoy() {
        C06090Tz c06090Tz;
        long j;
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            C96444Vc c96444Vc = this.A00;
            if (c96444Vc.A03 && AbstractC96454Vd.A00(c96444Vc)) {
                c06090Tz = C06090Tz.A05;
                j = 37165747878101397L;
            } else {
                c06090Tz = C06090Tz.A05;
                j = 37165747877773714L;
            }
            return AbstractC25229BEm.A0k(c06090Tz, userSession, j);
        }
        return Float.valueOf(0.2f);
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean Aoz() {
        boolean z;
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            z = C18U.A06(C06090Tz.A05, userSession, 36321322947454274L);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean Ap0() {
        boolean z;
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            C96444Vc c96444Vc = this.A00;
            if (!c96444Vc.A03 || !AbstractC96454Vd.A00(c96444Vc) || !C18U.A06(C06090Tz.A05, userSession, 36321322947781957L)) {
                z = C18U.A06(C06090Tz.A05, userSession, 36321322947716420L);
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean BOT() {
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36321322947388737L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        return true;
    }

    @Override // X.InterfaceC31079DlM
    public final Float BPu() {
        return AbstractC25229BEm.A0k(C06090Tz.A05, this.A01, 37165747877970323L);
    }

    @Override // X.InterfaceC31079DlM
    public final String BRh() {
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            return C18U.A04(C06090Tz.A05, userSession, 36884272900735549L);
        }
        return "disabled";
    }

    @Override // X.InterfaceC31079DlM
    public final String BRi() {
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            return C18U.A04(C06090Tz.A05, userSession, 36884272900997694L);
        }
        return "expand_browser";
    }

    @Override // X.InterfaceC31079DlM
    public final float BTo() {
        UserSession userSession = this.A01;
        if (CKR.A00(userSession).booleanValue()) {
            return AbstractC25225BEi.A00(C06090Tz.A05, userSession, 37165747878035860L);
        }
        return 0.2f;
    }

    public C29412Cxj(UserSession userSession, C96444Vc c96444Vc) {
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
