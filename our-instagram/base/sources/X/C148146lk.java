package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148146lk implements InterfaceC60602pj, InterfaceC145136gY, InterfaceC62892tS {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public ValueAnimator A04;
    public CountDownTimer A05;
    public View A06;
    public View A07;
    public IgSimpleImageView A08;
    public IgTextView A09;
    public C3VZ A0A;
    public C41181vS A0B;
    public C41181vS A0C;
    public C141596ac A0D;
    public GradientSpinner A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final float A0S;
    public final Context A0T;
    public final Handler A0U;
    public final View A0V;
    public final UserSession A0W;
    public final C674732m A0X;
    public final C148116lh A0Y;
    public final C148136lj A0Z;
    public final C148126li A0a;
    public final InterfaceC147266kB A0b;
    public final InterfaceC16820sZ A0c;
    public final InterfaceC16820sZ A0d;
    public final boolean A0e;
    public final C3G2 A0f;
    public final InterfaceC114805Gn A0g;

    public C148146lk(Context context, View view, UserSession userSession, C674732m c674732m, C3G2 c3g2, C148116lh c148116lh, C148136lj c148136lj, C148126li c148126li, InterfaceC147266kB interfaceC147266kB, InterfaceC114805Gn interfaceC114805Gn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC147266kB, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c3g2, 5);
        C14360o3.A0B(interfaceC114805Gn, 6);
        this.A0V = view;
        this.A0b = interfaceC147266kB;
        this.A0W = userSession;
        this.A0T = context;
        this.A0f = c3g2;
        this.A0g = interfaceC114805Gn;
        this.A0d = interfaceC16820sZ;
        this.A0c = interfaceC16820sZ2;
        this.A0X = c674732m;
        this.A0Y = c148116lh;
        this.A0a = c148126li;
        this.A0Z = c148136lj;
        this.A02 = -1;
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A0e = C18U.A06(c06090Tz, userSession, 36324776103850451L);
        this.A0U = new Handler(Looper.getMainLooper());
        this.A04 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.A00 = 1.0f;
        this.A0P = true;
        this.A0A = C3VZ.A03;
        this.A0R = true;
        this.A03 = (int) C18U.A00(c06090Tz, userSession, 37169201030627818L);
        this.A01 = -1;
        this.A0S = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void A02(C148146lk c148146lk) {
        c148146lk.A0J = false;
        c148146lk.A0H = false;
        c148146lk.A02 = -1;
        c148146lk.A0G = false;
        c148146lk.A0R = true;
        c148146lk.A0Q = false;
        c148146lk.A0B = null;
        c148146lk.A01 = -1;
        C141596ac c141596ac = c148146lk.A0D;
        if (c141596ac != null) {
            c141596ac.A0K = -1;
        }
        c148146lk.A04.cancel();
        c148146lk.A00 = 1.0f;
        c148146lk.A0K = true;
        c148146lk.A0P = true;
        c148146lk.A07 = null;
        ((C147256kA) c148146lk.A0b).A04.A0V = false;
        c148146lk.A0X.A00 = null;
        A03(c148146lk);
        AbstractC39681HjD.A00 = true;
        AbstractC39681HjD.A01 = null;
    }

    public static final void A03(C148146lk c148146lk) {
        if (c148146lk.A0e) {
            ((C147256kA) c148146lk.A0b).A04.A0T = false;
        }
    }

    public final boolean A06(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        if (!this.A0X.A07(c41181vS.A0b)) {
            if (this.A0J) {
                this.A0C = c41181vS;
                A04("scroll");
            }
            return false;
        }
        this.A0C = c41181vS;
        this.A02 = ((C147256kA) this.A0b).A04.A08;
        return true;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(c41181vS, 1);
        A00(c41181vS);
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        C14360o3.A0B(str, 0);
        if (this.A0X.A04() && this.A0J && str.equals("fragment_paused")) {
            A04("app_background");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        C14360o3.A0B(c3vz, 0);
        if (A05()) {
            this.A0A = c3vz;
            int ordinal = c3vz.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    C41181vS c41181vS = this.A0C;
                    if (c41181vS != null && ((C147256kA) this.A0b).A04.A08 == this.A02) {
                        A00(c41181vS);
                        return;
                    }
                    return;
                }
                A01(this);
                this.A0F = false;
                return;
            }
            A04("scroll");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a7, code lost:
    
        if (r10 != (-1)) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C41181vS r15) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148146lk.A00(X.1vS):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C148146lk r7) {
        /*
            android.view.View r6 = r7.A07
            android.view.View r5 = r7.A06
            boolean r0 = r7.A0M
            r4 = 1
            if (r0 != 0) goto L15
            boolean r0 = r7.A0O
            if (r0 != 0) goto L15
            boolean r2 = r7.A0e
            if (r2 == 0) goto L4d
            boolean r0 = r7.A0N
            if (r0 == 0) goto L4d
        L15:
            r1 = 1
        L16:
            boolean r0 = r7.A0F
            if (r0 != 0) goto L42
            if (r1 == 0) goto L42
            X.6kB r0 = r7.A0b
            X.6kA r0 = (X.C147256kA) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            int r1 = r0.A08
            int r0 = r7.A02
            if (r1 != r0) goto L42
            android.content.Context r0 = r7.A0T
            boolean r0 = X.C143726eF.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L43
            if (r5 == 0) goto L42
            android.os.Handler r3 = r7.A0U
            X.M4i r2 = new X.M4i
            r2.<init>(r5, r7)
        L3b:
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            r7.A0F = r4
        L42:
            return
        L43:
            if (r6 == 0) goto L42
            android.os.Handler r3 = r7.A0U
            X.M4i r2 = new X.M4i
            r2.<init>(r6, r7)
            goto L3b
        L4d:
            r1 = 0
            if (r2 == 0) goto L16
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148146lk.A01(X.6lk):void");
    }

    private final void A04(String str) {
        if (!this.A0K && !this.A0L) {
            this.A0Q = true;
            CountDownTimer countDownTimer = this.A05;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.A04.cancel();
            this.A0H = true;
            IgTextView igTextView = this.A09;
            if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            IgSimpleImageView igSimpleImageView = this.A08;
            if (igSimpleImageView != null) {
                igSimpleImageView.setVisibility(0);
            }
            this.A0K = true;
            this.A0a.A00(this.A0B, C05F.A0N, str, this.A01, this.A0J);
        }
    }

    public final boolean A05() {
        String str;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        if (this.A0X.A04() && this.A0J) {
            C41181vS c41181vS = this.A0C;
            String str2 = null;
            if (c41181vS != null && (c38321qM2 = c41181vS.A0b) != null) {
                str = c38321qM2.getId();
            } else {
                str = null;
            }
            C41181vS c41181vS2 = this.A0B;
            if (c41181vS2 != null && (c38321qM = c41181vS2.A0b) != null) {
                str2 = c38321qM.getId();
            }
            if (C14360o3.A0K(str, str2) && this.A07 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        if (A05()) {
            this.A0a.A00(this.A0B, C05F.A0j, "story_viewer_exit", this.A01, this.A0J);
            A02(this);
            this.A0U.removeCallbacksAndMessages(null);
        }
    }
}
