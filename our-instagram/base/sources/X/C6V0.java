package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.6V0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6V0 implements View.OnTouchListener {
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final ScaleGestureDetectorOnScaleGestureListenerC139956Uz A06;
    public final boolean A07;
    public boolean A03 = false;
    public boolean A02 = false;
    public float A00 = Float.MAX_VALUE;
    public float A01 = Float.MAX_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        if (r2.A01(r0) == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6V0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C6V0(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, ScaleGestureDetectorOnScaleGestureListenerC139956Uz scaleGestureDetectorOnScaleGestureListenerC139956Uz, boolean z) {
        this.A06 = scaleGestureDetectorOnScaleGestureListenerC139956Uz;
        this.A04 = gestureDetector;
        this.A05 = scaleGestureDetector;
        this.A07 = z;
    }
}
