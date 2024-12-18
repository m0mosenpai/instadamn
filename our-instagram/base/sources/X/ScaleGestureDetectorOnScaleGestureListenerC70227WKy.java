package X;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.WKy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC70227WKy implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ WXb A00;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r5 <= r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        r5 = ((r5 - r1) * 0.5f) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r5 < r1) goto L14;
     */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScale(android.view.ScaleGestureDetector r10) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            X.WXb r4 = r9.A00
            java.lang.Integer r1 = r4.A0L
            java.lang.Integer r0 = X.C05F.A0C
            r3 = 1
            if (r1 == r0) goto L11
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L8e
        L11:
            float r7 = r10.getFocusX()
            float r6 = r10.getFocusY()
            android.graphics.PointF r5 = r4.A0T
            float r0 = r5.x
            float r8 = r7 - r0
            float r0 = r5.y
            float r2 = r6 - r0
            float r1 = r4.A04
            float r1 = r1 + r8
            r4.A04 = r1
            float r0 = r4.A05
            float r0 = r0 + r2
            r4.A05 = r0
            X.2hj r2 = r4.A0H
            double r0 = (double) r1
            r2.A08(r0, r3)
            X.2hj r2 = r4.A0I
            float r0 = r4.A05
            double r0 = (double) r0
            r2.A08(r0, r3)
            float r2 = r4.A04
            float r1 = r4.A05
            android.view.View r0 = X.WXb.A00(r4)
            r0.setTranslationX(r2)
            r0.setTranslationY(r1)
            r5.x = r7
            r5.y = r6
            float r5 = r4.A02
            float r0 = r10.getScaleFactor()
            float r5 = r5 * r0
            float r0 = r4.A07
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L60
            float r1 = r4.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L6c
        L60:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L71
            float r1 = r4.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L71
        L6c:
            float r5 = r5 - r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            float r5 = r5 + r1
        L71:
            r4.A07(r5)
            X.2hj r2 = r4.A0J
            double r0 = (double) r5
            r2.A08(r0, r3)
            float r2 = r4.A02
            android.view.View r1 = X.WXb.A00(r4)
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto L88
            r2 = 1065353216(0x3f800000, float:1.0)
        L88:
            r1.setScaleX(r2)
            r1.setScaleY(r2)
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC70227WKy.onScale(android.view.ScaleGestureDetector):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.UBP, android.widget.FrameLayout, android.view.View] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        WXb wXb = this.A00;
        Integer num = wXb.A0L;
        if (num == C05F.A00 || num == C05F.A0Y) {
            if (wXb.A0Q) {
                View view = wXb.A0V;
                wXb.A06 = view.getTranslationY();
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                wXb.A0B = iArr[0];
                wXb.A0C = iArr[1];
                ?? frameLayout = new FrameLayout(wXb.A0S);
                FrameLayout.LayoutParams layoutParams = WXb.A0c;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setBackground(wXb.A0D);
                frameLayout.setVisibility(8);
                ((ViewGroup) wXb.A0X.getValue()).addView(frameLayout);
                wXb.A0K = frameLayout;
                wXb.A08(C05F.A0C);
                wXb.A0P = true;
                Ut9 ut9 = wXb.A0G;
                if (ut9 != null) {
                    UBP ubp = wXb.A0K;
                    if (ubp != null) {
                        wXb.A08 = ut9.indexOfChild(view);
                        wXb.A0F = view.getLayoutParams();
                        ut9.detachViewFromParent(view);
                        ubp.attachViewToParent(view, 0, layoutParams);
                        ubp.bringToFront();
                        ut9.requestLayout();
                        ut9.invalidate();
                        ubp.setVisibility(0);
                        wXb.A0E = view;
                        ut9.getParent().requestDisallowInterceptTouchEvent(true);
                        ut9.requestDisallowInterceptTouchEvent(true);
                        ubp.getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                wXb.A08(C05F.A0N);
            }
            WXb.A00(wXb).setHasTransientState(true);
            PointF pointF = wXb.A0T;
            boolean z = wXb.A0P;
            float focusX = scaleGestureDetector.getFocusX();
            if (z) {
                focusX -= wXb.A0B;
            }
            pointF.x = focusX;
            boolean z2 = wXb.A0P;
            float focusY = scaleGestureDetector.getFocusY();
            if (z2) {
                focusY -= wXb.A0C;
            }
            pointF.y = focusY;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC70227WKy(WXb wXb) {
        this.A00 = wXb;
    }
}
