package X;

import android.animation.Animator;

/* renamed from: X.CiC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28518CiC implements Animator.AnimatorListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public C28518CiC(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i2;
        this.A03 = obj6;
        this.A07 = obj4;
        this.A06 = obj2;
        this.A02 = obj7;
        this.A01 = i;
        this.A04 = obj3;
        this.A08 = obj5;
        this.A05 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r2 = r4.A00
            java.lang.Object r0 = r4.A03
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            java.lang.Object r1 = r4.A07
            X.2Yz r1 = (X.C51762Yz) r1
            if (r2 == 0) goto L27
            if (r0 == 0) goto L39
            java.lang.Boolean r0 = X.AbstractC166997dE.A0b()
            A00(r1, r4, r0)
            java.lang.Object r1 = r4.A08
            X.Bon r1 = (X.C26590Bon) r1
            android.view.animation.OvershootInterpolator r0 = X.C26590Bon.A0h
            X.BVO r0 = r1.A04
        L1f:
            X.0sZ r0 = r0.A0B
            if (r0 == 0) goto L26
            r0.invoke()
        L26:
            return
        L27:
            if (r0 == 0) goto L39
            java.lang.Boolean r0 = X.AbstractC166997dE.A0b()
            A00(r1, r4, r0)
            java.lang.Object r1 = r4.A08
            X.BVJ r1 = (X.BVJ) r1
            android.view.animation.OvershootInterpolator r0 = X.BVJ.A0w
            X.BVO r0 = r1.A04
            goto L1f
        L39:
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            r1.A01(r0)
            java.lang.Object r3 = r4.A06
            X.2XI r3 = (X.C2XI) r3
            java.lang.Object r2 = r4.A02
            X.0sJ r2 = (X.InterfaceC16660sJ) r2
            java.lang.Object r1 = r4.A05
            X.3bS r1 = (X.C76223bS) r1
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r0 = X.AbstractC77623dm.A03(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.invoke(r0)
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28518CiC.onAnimationEnd(android.animation.Animator):void");
    }

    public static void A00(C51762Yz c51762Yz, C28518CiC c28518CiC, Object obj) {
        c51762Yz.A01(obj);
        ((C2XI) c28518CiC.A06).A00(((InterfaceC16660sJ) c28518CiC.A02).invoke(Integer.valueOf(c28518CiC.A01)));
        C77123cy c77123cy = (C77123cy) c28518CiC.A04;
        C2XV.A00();
        c77123cy.A00 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
