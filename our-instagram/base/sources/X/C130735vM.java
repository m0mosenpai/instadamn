package X;

import android.content.Context;

/* renamed from: X.5vM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130735vM {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public float A04;
    public final float A05;

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.view.MotionEvent r11, android.view.View r12) {
        /*
            r10 = this;
            boolean r0 = r10.A02
            if (r0 == 0) goto L4d
            android.view.ViewParent r7 = r12.getParent()
            r7.getClass()
            int r0 = r11.getAction()
            if (r0 == 0) goto L5f
            r8 = 2
            if (r0 != r8) goto L4d
            float r9 = r11.getRawY()
            float r0 = r10.A04
            float r9 = r9 - r0
            float r1 = java.lang.Math.abs(r9)
            float r0 = r10.A05
            r6 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4d
            r5 = 1
            r0 = -1
            boolean r4 = r12.canScrollVertically(r0)
            boolean r3 = r12.canScrollVertically(r5)
            boolean r2 = r10.A01
            r1 = 3
            int r0 = r10.A00
            if (r2 == 0) goto L4e
            if (r0 == r5) goto L5c
            if (r0 == r8) goto L59
            if (r0 != r1) goto L4d
            r1 = 0
            if (r4 != 0) goto L44
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L4a
        L44:
            if (r3 != 0) goto L4d
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
        L4a:
            r7.requestDisallowInterceptTouchEvent(r6)
        L4d:
            return
        L4e:
            if (r0 == r5) goto L5c
            if (r0 == r8) goto L59
            if (r0 != r1) goto L4d
            if (r4 == 0) goto L4a
            if (r3 != 0) goto L4d
            goto L4a
        L59:
            if (r3 == 0) goto L4a
            return
        L5c:
            if (r4 == 0) goto L4a
            return
        L5f:
            r11.getRawX()
            float r0 = r11.getRawY()
            r10.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130735vM.A00(android.view.MotionEvent, android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.view.MotionEvent r6, android.view.View r7, boolean r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L40
            android.view.ViewParent r4 = r7.getParent()
            r4.getClass()
            int r0 = r6.getActionMasked()
            if (r0 != 0) goto L40
            r6.getRawX()
            float r0 = r6.getRawY()
            r5.A04 = r0
            r3 = 1
            r2 = -1
            if (r8 == 0) goto L41
            android.content.Context r0 = r7.getContext()
            boolean r0 = X.AbstractC13620mo.A02(r0)
            if (r0 != 0) goto L28
            r3 = -1
            r2 = 1
        L28:
            boolean r1 = r7.canScrollHorizontally(r3)
            boolean r0 = r7.canScrollHorizontally(r2)
        L30:
            r2 = 1
            if (r1 != 0) goto L36
            r1 = 0
            if (r0 == 0) goto L37
        L36:
            r1 = 1
        L37:
            boolean r0 = r5.A03
            if (r0 != 0) goto L40
            if (r1 == 0) goto L40
            r4.requestDisallowInterceptTouchEvent(r2)
        L40:
            return
        L41:
            boolean r1 = r7.canScrollVertically(r2)
            boolean r0 = r7.canScrollVertically(r3)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130735vM.A01(android.view.MotionEvent, android.view.View, boolean):void");
    }

    public C130735vM(Context context) {
        this.A05 = AbstractC13880nE.A04(context, 20);
    }
}
