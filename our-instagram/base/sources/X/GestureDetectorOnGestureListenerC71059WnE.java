package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.WnE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class GestureDetectorOnGestureListenerC71059WnE implements InterfaceC149626oF, GestureDetector.OnGestureListener {
    public boolean A00;
    public boolean A01;
    public final GestureDetector A02;
    public final C68749VbS A03;

    public GestureDetectorOnGestureListenerC71059WnE(Context context, C68749VbS c68749VbS) {
        this.A03 = c68749VbS;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A02 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A00) {
            GestureDetector gestureDetector = this.A02;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            if (gestureDetector.onTouchEvent(obtain)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r1 != 3) goto L8;
     */
    @Override // X.InterfaceC149626oF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Du7(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            android.view.GestureDetector r3 = r5.A02
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r6)
            float r1 = r6.getRawX()
            float r0 = r6.getRawY()
            r2.setLocation(r1, r0)
            r3.onTouchEvent(r2)
            boolean r3 = r5.A00
            int r1 = r6.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L3c
            r0 = 2
            if (r1 == r0) goto L28
            r0 = 3
            if (r1 == r0) goto L3c
        L27:
            return r3
        L28:
            if (r3 == 0) goto L27
            X.VbS r0 = r5.A03
            float r2 = r6.getX()
            float r1 = r6.getY()
            X.WnD r0 = r0.A00
            X.XLV r0 = r0.A01
            r0.DsP(r2, r1)
            return r3
        L3c:
            boolean r0 = r5.A00
            if (r0 == 0) goto L27
            boolean r0 = r5.A01
            if (r0 != 0) goto L27
            X.VbS r0 = r5.A03
            X.WnD r0 = r0.A00
            X.XLV r0 = r0.A01
            r0.DsO()
            r5.A00 = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC71059WnE.Du7(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        this.A01 = true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (!this.A01) {
            this.A00 = true;
            C68749VbS c68749VbS = this.A03;
            c68749VbS.A00.A01.DsN(motionEvent.getX(), motionEvent.getY());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
