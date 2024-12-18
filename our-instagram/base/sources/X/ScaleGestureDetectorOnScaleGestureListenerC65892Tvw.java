package X;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;

/* renamed from: X.Tvw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC65892Tvw implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ C65891Tvv A00;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r3 <= r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r3 = ((r3 - r1) * 0.5f) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r3 < r1) goto L14;
     */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.Tvv r5 = r6.A00
            java.lang.Integer r1 = r5.A0J
            java.lang.Integer r0 = X.C05F.A0C
            r4 = 1
            if (r1 == r0) goto L11
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L4b
        L11:
            float r1 = r7.getFocusX()
            float r0 = r7.getFocusY()
            X.C65891Tvv.A03(r5, r1, r0)
            float r3 = r5.A02
            float r0 = r7.getScaleFactor()
            float r3 = r3 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2f
            float r1 = r5.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3b
        L2f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L40
            float r1 = r5.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L40
        L3b:
            float r3 = r3 - r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r0
            float r3 = r3 + r1
        L40:
            X.2hj r2 = r5.A0G
            if (r2 == 0) goto L4c
            double r0 = (double) r3
            r2.A08(r0, r4)
            X.C65891Tvv.A02(r5, r3)
        L4b:
            return r4
        L4c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC65892Tvw.onScale(android.view.ScaleGestureDetector):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.UBP, android.widget.FrameLayout, android.view.View] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        C65891Tvv c65891Tvv = this.A00;
        if (c65891Tvv.A0J == C05F.A00) {
            UBP ubp = c65891Tvv.A0I;
            if (ubp != null) {
                c65891Tvv.A05 = ((C65895Tvz) ubp).A00.getTranslationY();
                int[] iArr = new int[2];
                UBP ubp2 = c65891Tvv.A0I;
                if (ubp2 != null) {
                    ((C65895Tvz) ubp2).A00.getLocationInWindow(iArr);
                    c65891Tvv.A0B = iArr[0];
                    c65891Tvv.A0C = iArr[1];
                    ?? frameLayout = new FrameLayout(c65891Tvv.A0M);
                    FrameLayout.LayoutParams layoutParams = C65891Tvv.A0V;
                    frameLayout.setLayoutParams(layoutParams);
                    frameLayout.setBackground(c65891Tvv.A0P);
                    frameLayout.setVisibility(8);
                    c65891Tvv.A0R.addView(frameLayout);
                    c65891Tvv.A0H = frameLayout;
                    c65891Tvv.A0J = C05F.A0C;
                    c65891Tvv.A0K = true;
                    UBP ubp3 = c65891Tvv.A0I;
                    if (ubp3 != null) {
                        BTM btm = ((C65895Tvz) ubp3).A00;
                        c65891Tvv.A0A = ubp3.indexOfChild(btm);
                        c65891Tvv.A0E = btm.getLayoutParams();
                        ubp3.detachViewFromParent(btm);
                        frameLayout.attachViewToParent(btm, 0, layoutParams);
                        frameLayout.bringToFront();
                        ubp3.requestLayout();
                        ubp3.invalidate();
                        frameLayout.setVisibility(0);
                        c65891Tvv.A0D = btm;
                        ubp3.getParent().requestDisallowInterceptTouchEvent(true);
                        ubp3.requestDisallowInterceptTouchEvent(true);
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                        C65891Tvv.A00(c65891Tvv).setHasTransientState(true);
                        C55982hj c55982hj = c65891Tvv.A0G;
                        if (c55982hj != null) {
                            c55982hj.A02();
                            c55982hj.A0A(c65891Tvv);
                            PointF pointF = c65891Tvv.A0N;
                            boolean z = c65891Tvv.A0K;
                            float focusX = scaleGestureDetector.getFocusX();
                            if (z) {
                                focusX -= c65891Tvv.A0B;
                            }
                            pointF.x = focusX;
                            boolean z2 = c65891Tvv.A0K;
                            float focusY = scaleGestureDetector.getFocusY();
                            if (z2) {
                                focusY -= c65891Tvv.A0C;
                            }
                            pointF.y = focusY;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC65892Tvw(C65891Tvv c65891Tvv) {
        this.A00 = c65891Tvv;
    }
}
