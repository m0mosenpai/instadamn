package X;

import android.animation.ValueAnimator;

/* renamed from: X.OfD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55241OfD implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public static Object A00(C55241OfD c55241OfD, Object obj) {
        C14360o3.A0B(obj, 0);
        return c55241OfD.A01;
    }

    public C55241OfD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C55241OfD(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r6) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55241OfD.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
