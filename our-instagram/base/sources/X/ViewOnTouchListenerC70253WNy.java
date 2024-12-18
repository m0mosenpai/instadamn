package X;

import android.view.GestureDetector;
import android.view.View;

/* renamed from: X.WNy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC70253WNy implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ GestureDetector A02;
    public final /* synthetic */ UMC A03;
    public final /* synthetic */ InterfaceC145396gy A04;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            r2 = 1
            X.C14360o3.A0B(r7, r2)
            android.view.GestureDetector r0 = r5.A02
            boolean r4 = r0.onTouchEvent(r7)
            int r1 = r7.getActionMasked()
            if (r1 == 0) goto L45
            if (r1 == r2) goto L34
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L34
        L18:
            return r4
        L19:
            X.UMC r0 = r5.A03
            boolean r0 = r0.A00
            if (r0 == 0) goto L18
            float r2 = r7.getRawX()
            float r0 = r5.A00
            float r2 = r2 - r0
            float r1 = r7.getRawY()
            float r0 = r5.A01
            float r1 = r1 - r0
            X.6gy r0 = r5.A04
            boolean r4 = r0.DQo(r2, r1)
            return r4
        L34:
            X.6gy r0 = r5.A04
            r3 = 0
            r0.Dwo(r3)
            X.UMC r2 = r5.A03
            X.U9C r1 = r2.A01
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            r2.A00 = r3
            return r4
        L45:
            float r0 = r7.getRawX()
            r5.A00 = r0
            float r0 = r7.getRawY()
            r5.A01 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC70253WNy.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC70253WNy(GestureDetector gestureDetector, UMC umc, InterfaceC145396gy interfaceC145396gy) {
        this.A02 = gestureDetector;
        this.A03 = umc;
        this.A04 = interfaceC145396gy;
    }
}
