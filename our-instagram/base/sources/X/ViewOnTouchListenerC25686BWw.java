package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.BWw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC25686BWw implements View.OnTouchListener {
    public C25687BWx A00;
    public final C6FG A01;
    public final C102884kP A02;
    public final C102884kP A03;
    public final float A04;

    public ViewOnTouchListenerC25686BWw(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        this.A03 = c102884kP;
        this.A01 = c6fg;
        this.A02 = c102884kP2;
        this.A00 = (C25687BWx) AnonymousClass634.A06(c6fg, c102884kP);
        this.A04 = ViewConfiguration.get(c6fg.A00).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
    
        if (r5.A00 != false) goto L37;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r1 = r10.getAction()
            r6 = 0
            if (r1 == 0) goto L15
            r7 = 1
            if (r1 == r7) goto L40
            r0 = 3
            if (r1 == r0) goto L9a
            r0 = 4
            if (r1 == r0) goto L9a
        L10:
            X.BWx r0 = r8.A00
            boolean r0 = r0.A00
            return r0
        L15:
            X.4kP r3 = r8.A03
            X.4lE r2 = r3.A09()
            if (r2 != 0) goto L1e
            return r6
        L1e:
            X.6FX r1 = X.AbstractC25225BEi.A0s()
            X.4kP r0 = r8.A02
            X.6FW r1 = X.AbstractC25227BEk.A0f(r1, r0, r6)
            X.6FG r0 = r8.A01
            java.lang.Object r2 = X.C6FP.A03(r0, r3, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto Lb2
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto Lb2
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.AbstractC25241Le.A02(r1, r0)
            X.BWx r5 = r8.A00
            goto L96
        L40:
            X.BWx r5 = r8.A00
            boolean r0 = r5.A00
            if (r0 == 0) goto L10
            float r4 = r10.getX()
            float r3 = r10.getY()
            float r2 = r8.A04
            X.C14360o3.A0B(r9, r6)
            float r1 = -r2
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto La0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto La0
            int r1 = r9.getRight()
            int r0 = r9.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto La0
            int r1 = r9.getBottom()
            int r0 = r9.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La0
            X.4kP r4 = r8.A03
            r0 = 38
            X.4lE r3 = r4.A0B(r0)
            if (r3 == 0) goto L96
            X.6FX r2 = X.AbstractC25225BEi.A0s()
            X.4kP r0 = r8.A02
            r2.A03(r0, r6)
        L8d:
            X.6FG r1 = r8.A01
            X.6FW r0 = X.AbstractC25227BEk.A0f(r2, r1, r7)
            X.C6FP.A03(r1, r4, r0, r3)
        L96:
            r5.A00 = r6
            goto L10
        L9a:
            X.BWx r5 = r8.A00
            boolean r0 = r5.A00
            if (r0 == 0) goto L10
        La0:
            X.4kP r4 = r8.A03
            X.4lE r3 = r4.A0A()
            if (r3 == 0) goto L96
            X.6FX r2 = X.AbstractC25225BEi.A0s()
            X.4kP r0 = r8.A02
            r2.A03(r0, r6)
            goto L8d
        Lb2:
            X.BWx r1 = r8.A00
            boolean r0 = X.C6DZ.A01(r2)
            r1.A00 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC25686BWw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
