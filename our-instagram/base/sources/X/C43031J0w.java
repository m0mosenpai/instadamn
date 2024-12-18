package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.J0w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43031J0w implements InterfaceC86363t8 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C75113Zb A05;
    public final Activity A06;
    public final View A07;
    public final View A08;
    public final C120985dq A09;
    public final UserSession A0A;
    public final C38321qM A0B;
    public final C5SW A0C;
    public final SPM A0D;
    public final C37546Gg2 A0E;
    public final C37560GgG A0F;
    public final C37556GgC A0G;

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final void D5o() {
        A03(true);
        if (this.A01) {
            C75113Zb c75113Zb = this.A05;
            if (c75113Zb.A1q) {
                c75113Zb.A1q = false;
            }
            this.A0G.A0C();
            A00();
            A01();
            this.A0E.CtR(this.A0B);
            c75113Zb.A0O(EnumC37732Gj7.A04);
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5p(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final void Dyj(C51752Mtb c51752Mtb) {
        C14360o3.A0B(c51752Mtb, 0);
        int i = c51752Mtb.A01;
        if (i == 1) {
            A02();
            this.A03 = true;
            A03(true);
            this.A05.A0O(EnumC37732Gj7.A03);
            return;
        }
        if (i == 3) {
            this.A05.A0d(true);
        }
        this.A03 = false;
    }

    private final void A00() {
        C75113Zb c75113Zb = this.A05;
        if (c75113Zb.A1p) {
            c75113Zb.A0d(false);
            AbstractC25651Mw.A00(this.A0A).E4s(new C72243Lx(this.A0B, AnonymousClass341.A07));
        }
    }

    private final void A01() {
        C37560GgG c37560GgG = this.A0F;
        C25370BKn A04 = C37560GgG.A04(c37560GgG);
        if (A04 != null) {
            C37546Gg2 c37546Gg2 = this.A0E;
            C37644Ghd C09 = c37546Gg2.A0A.C09(this.A09);
            if (!c37560GgG.A0d(A04) && C09.A0J == null && !C09.A0Y) {
                c37560GgG.A0W("resume", false);
            }
        }
    }

    private final void A02() {
        C75113Zb c75113Zb = this.A05;
        if (c75113Zb.A1q) {
            c75113Zb.A1q = false;
        }
        A00();
        if (c75113Zb.A1o) {
            c75113Zb.A1o = false;
        }
        this.A0E.CtR(this.A0B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5.A0A, 36321537696802374L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(boolean r6) {
        /*
            r5 = this;
            android.view.View r4 = r5.A08
            if (r4 == 0) goto L4d
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321537696802374(0x810a3f001d2646, double:3.03322492232632E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4d
        L13:
            r1 = 300(0x12c, double:1.48E-321)
            r3 = 0
            int r0 = r4.getVisibility()
            if (r6 == 0) goto L38
            if (r0 == 0) goto L37
            r4.setAlpha(r3)
            r0 = 0
            r4.setVisibility(r0)
            android.view.ViewPropertyAnimator r3 = r4.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r3.alpha(r0)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 0
        L34:
            r2.setListener(r1)
        L37:
            return
        L38:
            if (r0 != 0) goto L37
            android.view.ViewPropertyAnimator r0 = r4.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r0 = 2
            X.Gsa r1 = new X.Gsa
            r1.<init>(r4, r0)
            goto L34
        L4d:
            android.view.View r4 = r5.A07
            if (r4 == 0) goto L37
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321537696671300(0x810a3f001b2644, double:3.0332249222434286E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L37
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43031J0w.A03(boolean):void");
    }

    @Override // X.InterfaceC86363t8
    public final void CwQ(float f) {
        UserSession userSession = this.A0A;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36321537695753787L)) {
            this.A0G.A0B();
        }
        if (!this.A01) {
            this.A01 = true;
        } else {
            C75113Zb c75113Zb = this.A05;
            if (c75113Zb.A1q) {
                c75113Zb.A1q = false;
            }
            this.A0E.CtR(this.A0B);
            if (C18U.A06(c06090Tz, userSession, 36321537695295031L)) {
                A01();
            }
        }
        this.A05.A0O(EnumC37732Gj7.A02);
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        if (!this.A03) {
            A02();
        }
        UserSession userSession = this.A0A;
        if (!C18U.A06(C06090Tz.A06, userSession, 36321537695098421L)) {
            this.A0G.A0C();
        }
        C37546Gg2 c37546Gg2 = this.A0E;
        C37644Ghd C09 = c37546Gg2.A0A.C09(this.A09);
        if (C09.A0J == null && !C09.A0Y) {
            this.A0F.A0W("resume", false);
        }
        this.A05.A0O(EnumC37732Gj7.A03);
        SPM spm = this.A0D;
        if (spm != null) {
            spm.A02("secondary_cta", "dismiss", AbstractC58317Pt9.A00(112));
        }
        AbstractC56402iY.A01 = false;
        A03(true);
        C3DN A00 = C3DN.A00.A00(this.A06);
        if (A00 != null) {
            C3DP c3dp = (C3DP) A00;
            C55942hf c55942hf = C3DP.A19;
            c3dp.A0A = c55942hf;
            c3dp.A0u.A09(c55942hf);
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                viewOnTouchListenerC65896Tw0.A0V.A09(c55942hf);
            }
        }
        C5SW c5sw = this.A0C;
        if (c5sw != null) {
            c5sw.A07(userSession);
        }
    }

    @Override // X.InterfaceC86363t8
    public final void DId(Integer num) {
        C75113Zb c75113Zb;
        EnumC37732Gj7 enumC37732Gj7;
        C37560GgG c37560GgG = this.A0F;
        if (C37560GgG.A04(c37560GgG) != null) {
            C37546Gg2 c37546Gg2 = this.A0E;
            C37644Ghd C09 = c37546Gg2.A0A.C09(this.A09);
            if (C09.A0J == null && !C09.A0Y) {
                c37560GgG.A0S(null, "caption_and_browse", true, false);
                this.A04 = true;
            }
        }
        if (!C18U.A06(C06090Tz.A06, this.A0A, 36321537695295031L)) {
            A02();
            this.A03 = true;
            c75113Zb = this.A05;
            enumC37732Gj7 = EnumC37732Gj7.A05;
        } else {
            c75113Zb = this.A05;
            enumC37732Gj7 = EnumC37732Gj7.A04;
        }
        c75113Zb.A0O(enumC37732Gj7);
    }

    @Override // X.InterfaceC86363t8
    public final void DZk(int i, int i2) {
        if (this.A01 && !this.A02) {
            this.A02 = true;
            return;
        }
        if (this.A02 && !this.A03) {
            C75113Zb c75113Zb = this.A05;
            if (!c75113Zb.A1q) {
                c75113Zb.A1q = true;
            }
            this.A0E.CtR(this.A0B);
        }
        if (!this.A00 && !this.A01) {
            A03(false);
            this.A00 = true;
        }
        if (!this.A04) {
            return;
        }
        this.A0F.A0W("resume", false);
        this.A04 = false;
    }

    public C43031J0w(Activity activity, C120985dq c120985dq, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, C5SW c5sw, SPM spm, C37546Gg2 c37546Gg2, C37560GgG c37560GgG, C37556GgC c37556GgC) {
        ViewGroup viewGroup;
        this.A0B = c38321qM;
        this.A05 = c75113Zb;
        this.A06 = activity;
        this.A09 = c120985dq;
        this.A0E = c37546Gg2;
        this.A0G = c37556GgC;
        this.A0F = c37560GgG;
        this.A0A = userSession;
        this.A0D = spm;
        this.A0C = c5sw;
        C56352iT A00 = C56342iS.A00(activity);
        if (A00 != null) {
            viewGroup = A00.A0O;
        } else {
            viewGroup = null;
        }
        this.A08 = viewGroup;
        this.A07 = activity.findViewById(R.id.action_bar_right_side_buttons_wrapper);
    }
}
