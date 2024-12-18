package X;

import android.app.Activity;
import android.os.Handler;
import android.view.GestureDetector;
import com.instagram.common.session.UserSession;

/* renamed from: X.BYm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25727BYm extends GestureDetector.SimpleOnGestureListener {
    public final GestureDetector A00;
    public final Activity A01;
    public final Handler A02;
    public final UserSession A03;
    public final SPM A04;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r0 == false) goto L27;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r10, android.view.MotionEvent r11, float r12, float r13) {
        /*
            r9 = this;
            r4 = 1
            X.C14360o3.A0B(r11, r4)
            float r0 = java.lang.Math.abs(r13)
            double r2 = (double) r0
            com.instagram.common.session.UserSession r6 = r9.A03
            X.0Tz r5 = X.AbstractC25228BEl.A0l(r6)
            r0 = 37165962628891039(0x840a3f003b019f, double:3.567242649605472E-306)
            double r7 = X.C18U.A00(r5, r6, r0)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto La8
            r2 = 0
            if (r10 == 0) goto La5
            float r1 = r10.getRawY()
        L23:
            float r0 = r11.getRawY()
            float r1 = r1 - r0
            r7 = 0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            boolean r3 = X.AbstractC167007dF.A1O(r0)
            if (r10 == 0) goto La3
            float r1 = r10.getRawY()
        L35:
            float r0 = r11.getRawY()
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            r7 = 1
        L3f:
            java.lang.String r2 = "caption_swipe"
            if (r3 == 0) goto L5e
            X.3DO r1 = X.C3DN.A00
            android.app.Activity r0 = r9.A01
            X.3DN r1 = r1.A00(r0)
            if (r1 == 0) goto L52
            java.lang.Integer r0 = X.C05F.A04
            r1.A0U(r0)
        L52:
            X.SPM r3 = r9.A04
            if (r3 == 0) goto L5d
            java.lang.String r1 = "full"
            java.lang.String r0 = "expand"
            r3.A02(r1, r0, r2)
        L5d:
            return r4
        L5e:
            if (r7 == 0) goto La8
            r0 = 36321537697261129(0x810a3f00242649, double:3.033224922616439E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            if (r0 == 0) goto L77
            r0 = 36321537695753787(0x810a3f000d263b, double:3.0332249216631897E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            r5 = 1
            if (r0 != 0) goto L78
        L77:
            r5 = 0
        L78:
            X.3DO r1 = X.C3DN.A00
            android.app.Activity r0 = r9.A01
            X.3DN r1 = r1.A00(r0)
            if (r1 == 0) goto La8
            java.lang.String r3 = "dismiss"
            if (r5 == 0) goto L99
            java.lang.Integer r0 = X.C05F.A0Y
            r1.A0V(r0, r4)
            X.SPM r1 = r9.A04
            if (r1 == 0) goto L5d
            r0 = 247(0xf7, float:3.46E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
        L95:
            r1.A02(r0, r3, r2)
            return r4
        L99:
            r1.A0B()
            X.SPM r1 = r9.A04
            if (r1 == 0) goto L5d
            java.lang.String r0 = "secondary_cta"
            goto L95
        La3:
            r1 = 0
            goto L35
        La5:
            r1 = 0
            goto L23
        La8:
            boolean r0 = super.onFling(r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25727BYm.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public C25727BYm(Activity activity, UserSession userSession, SPM spm) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A04 = spm;
        Handler A0J = AbstractC167007dF.A0J();
        this.A02 = A0J;
        this.A00 = new GestureDetector(activity.getApplicationContext(), new GestureDetectorOnGestureListenerC58552mE(this), A0J);
    }
}
