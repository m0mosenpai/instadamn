package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cxl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29414Cxl implements InterfaceC31079DlM {
    public final UserSession A00;

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ABE() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean APO() {
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
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean ARr() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ float BTo() {
        return 0.0f;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CMq() {
        return false;
    }

    @Override // X.InterfaceC31079DlM
    public final /* synthetic */ boolean CUx() {
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
        if (C18U.A06(C06090Tz.A05, this.A00, 36318123197601744L)) {
            return "back_arrow";
        }
        return "cross";
    }

    @Override // X.InterfaceC31079DlM
    public final String AEJ() {
        if (C18U.A06(C06090Tz.A05, this.A00, 36318123198715863L)) {
            return "down_arrow";
        }
        return "cross";
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean ARh() {
        return AbstractC166997dE.A0c(C06090Tz.A05, this.A00, 2342161132411033549L);
    }

    @Override // X.InterfaceC31079DlM
    public final Float Aoy() {
        return AbstractC25229BEm.A0k(C06090Tz.A05, this.A00, 37162548127006960L);
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean Aoz() {
        return AbstractC166997dE.A0c(C06090Tz.A05, this.A00, 36318123197011915L);
    }

    @Override // X.InterfaceC31079DlM
    public final Boolean Ap0() {
        return AbstractC166997dE.A0c(C06090Tz.A05, this.A00, 36318123196815306L);
    }

    @Override // X.InterfaceC31079DlM
    public final float B6t() {
        return AbstractC25225BEi.A00(C06090Tz.A05, this.A00, 37169304109646320L);
    }

    @Override // X.InterfaceC31079DlM
    public final Float BPu() {
        return AbstractC25229BEm.A0k(C06090Tz.A05, this.A00, 37162548126220527L);
    }

    @Override // X.InterfaceC31079DlM
    public final String BRh() {
        return C18U.A04(C06090Tz.A05, this.A00, 36881073150099827L);
    }

    @Override // X.InterfaceC31079DlM
    public final String BRi() {
        return C18U.A04(C06090Tz.A05, this.A00, 36881073150034290L);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean CUw() {
        return C18U.A06(C06090Tz.A05, this.A00, 36324879179461166L);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean CY7() {
        return C18U.A06(C06090Tz.A05, this.A00, 2342161132411230159L);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean CZR() {
        return C18U.A06(C06090Tz.A05, this.A00, 36318123198519253L);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean CeF() {
        return C18U.A06(C06090Tz.A05, this.A00, 36318123197667281L);
    }

    @Override // X.InterfaceC31079DlM
    public final boolean Cfo() {
        return C18U.A06(C06090Tz.A05, this.A00, 2342161132412278742L);
    }

    @Override // X.InterfaceC31079DlM
    public final EnumC27385C6o backPressDestination() {
        String A04 = C18U.A04(C06090Tz.A05, this.A00, 36881073152065908L);
        int hashCode = A04.hashCode();
        if (hashCode != -746053640) {
            if (hashCode != -285958901) {
                if (hashCode == 1579758726 && A04.equals("lowest_partial_state")) {
                    return EnumC27385C6o.A04;
                }
            } else if (A04.equals("previous_partial_state")) {
                return EnumC27385C6o.A05;
            }
        } else if (A04.equals("highest_partial_state")) {
            return EnumC27385C6o.A03;
        }
        return EnumC27385C6o.A02;
    }

    @Override // X.InterfaceC31079DlM
    public final double getDragUpReleaseRatio() {
        return C18U.A00(C06090Tz.A05, this.A00, 37162548129038578L);
    }

    public C29414Cxl(UserSession userSession) {
        this.A00 = userSession;
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
    public final boolean BOT() {
        if (AbstractC166997dE.A1Z(Ap0(), true)) {
            boolean A06 = C18U.A06(C06090Tz.A05, this.A00, 2342161132411164622L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        return true;
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
