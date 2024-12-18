package X;

import android.animation.Animator;

/* renamed from: X.CiB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28517CiB implements Animator.AnimatorListener {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C28517CiB(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj5;
        this.A05 = obj;
        this.A04 = obj2;
        this.A07 = obj4;
        this.A06 = obj3;
        this.A02 = j;
        this.A01 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationStart(android.animation.Animator r5) {
        /*
            r4 = this;
            int r1 = r4.A00
            java.lang.Object r0 = r4.A03
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r1 == 0) goto L49
            if (r0 == 0) goto L66
            java.lang.Object r2 = r4.A05
            X.2Yz r2 = (X.C51762Yz) r2
            java.lang.Object r1 = r4.A07
            X.Bon r1 = (X.C26590Bon) r1
            r0 = 34
            X.DRX r0 = X.DRX.A00(r1, r0)
            r2.A03(r0)
            java.lang.Object r3 = r4.A04
            X.2Yz r3 = (X.C51762Yz) r3
            android.view.animation.OvershootInterpolator r0 = X.C26590Bon.A0h
            X.0e4 r0 = r1.A07
        L25:
            if (r0 == 0) goto L46
            java.lang.Object r1 = r0.A01
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r0 == 0) goto L46
            int r0 = r1.intValue()
        L35:
            X.AbstractC25227BEk.A1K(r3, r0)
            java.lang.Object r2 = r4.A06
            X.2Yz r2 = (X.C51762Yz) r2
            long r0 = r4.A02
        L3e:
            X.2Z3 r0 = X.AbstractC25225BEi.A0p(r0)
            r2.A01(r0)
            return
        L46:
            r0 = 12
            goto L35
        L49:
            if (r0 == 0) goto L66
            java.lang.Object r3 = r4.A05
            X.2Yz r3 = (X.C51762Yz) r3
            java.lang.Object r2 = r4.A07
            X.BVJ r2 = (X.BVJ) r2
            r1 = 13
            X.PjZ r0 = new X.PjZ
            r0.<init>(r2, r1)
            r3.A03(r0)
            java.lang.Object r3 = r4.A04
            X.2Yz r3 = (X.C51762Yz) r3
            android.view.animation.OvershootInterpolator r0 = X.BVJ.A0w
            X.0e4 r0 = r2.A08
            goto L25
        L66:
            java.lang.Object r1 = r4.A04
            X.2Yz r1 = (X.C51762Yz) r1
            java.lang.Integer r0 = X.AbstractC25227BEk.A0p()
            r1.A01(r0)
            java.lang.Object r2 = r4.A06
            X.2Yz r2 = (X.C51762Yz) r2
            long r0 = r4.A01
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28517CiB.onAnimationStart(android.animation.Animator):void");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
