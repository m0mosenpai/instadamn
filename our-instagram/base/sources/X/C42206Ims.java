package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ims, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42206Ims implements C38Y {
    public SPM A00;
    public float A01;
    public boolean A02;
    public final UserSession A03;
    public final C3DN A04;
    public final C37624GhJ A05;
    public final boolean A06;

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        C38321qM c38321qM;
        SPM spm;
        C14360o3.A0B(num, 0);
        if (num == C05F.A00) {
            C3DN c3dn = this.A04;
            if (c3dn != null) {
                C3DP c3dp = (C3DP) c3dn;
                if (c3dp.A0h && this.A02) {
                    if (this.A06) {
                        c3dn.A0A();
                    } else {
                        c3dn.A0B();
                    }
                    if ((c3dp.A0b || !c3dp.A0h) && (spm = this.A00) != null) {
                        spm.A02("secondary_cta", "dismiss", "external_swipe");
                    }
                }
            }
            C120985dq A02 = this.A05.A02();
            if (A02 != null) {
                c38321qM = A02.A02;
            } else {
                c38321qM = null;
            }
            this.A02 = C25375BKs.A03(this.A03, c38321qM);
            this.A01 = -1.0f;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
        C3DN c3dn;
        if (this.A02 && (c3dn = this.A04) != null && ((C3DP) c3dn).A0h && this.A06) {
            float f3 = this.A01;
            if (f3 == -1.0f) {
                this.A01 = f2;
                f3 = f2;
            }
            double d = f2 - f;
            if (f < f3) {
                d = -d;
            }
            c3dn.A0F(d);
        }
    }

    public C42206Ims(UserSession userSession, C3DN c3dn, C37624GhJ c37624GhJ) {
        AbstractC167017dG.A1R(c37624GhJ, userSession);
        this.A04 = c3dn;
        this.A05 = c37624GhJ;
        this.A03 = userSession;
        this.A06 = C18U.A06(C06090Tz.A06, userSession, 36321537697326666L);
        this.A01 = -1.0f;
    }
}
