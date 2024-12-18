package com.instagram.barcelona.common.ui.toast;

import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.BG5;
import X.C14360o3;
import X.C28727CmJ;
import X.C50154MDh;
import X.C50262MHr;
import X.InterfaceC1128957x;
import X.InterfaceC16610sE;
import X.InterfaceC30902DiF;
import X.InterfaceC74953Yl;
import X.InterfaceC74963Ym;

/* loaded from: classes5.dex */
public final class ToastDragDismissState {
    public final float A00;
    public final InterfaceC30902DiF A01;
    public final InterfaceC30902DiF A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC74963Ym A05;
    public final InterfaceC74963Ym A06;
    public final float A07;
    public final InterfaceC74963Ym A08;
    public final InterfaceC74963Ym A09;
    public final InterfaceC1128957x A0A;

    public ToastDragDismissState(InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, InterfaceC1128957x interfaceC1128957x) {
        C14360o3.A0B(interfaceC1128957x, 1);
        this.A0A = interfaceC1128957x;
        this.A08 = interfaceC74963Ym;
        this.A09 = interfaceC74963Ym2;
        this.A07 = interfaceC1128957x.EqT(100.0f);
        this.A00 = interfaceC1128957x.EqT(300.0f);
        Float A0l = AbstractC25227BEk.A0l();
        this.A03 = AbstractC25230BEn.A0U(A0l);
        this.A04 = AbstractC25229BEm.A0R(A0l);
        this.A05 = AbstractC25225BEi.A0L(null, new C50154MDh(this, 11));
        this.A06 = AbstractC25225BEi.A0L(null, new C50154MDh(this, 12));
        C50262MHr c50262MHr = new C50262MHr(this, 26);
        InterfaceC16610sE interfaceC16610sE = BG5.A00;
        this.A01 = new C28727CmJ(c50262MHr);
        this.A02 = new C28727CmJ(new C50262MHr(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC74953Yl r13, X.InterfaceC23621Ds r14, float r15) {
        /*
            r12 = this;
            r4 = 1
            boolean r0 = r14 instanceof X.D3j
            if (r0 == 0) goto L98
            r9 = r14
            X.D3j r9 = (X.D3j) r9
            int r0 = r9.A05
            if (r0 != r4) goto L98
            int r2 = r9.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r9.A01 = r2
        L17:
            java.lang.Object r6 = r9.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r9.A01
            r5 = 0
            if (r0 == 0) goto L3b
            if (r0 != r4) goto L9f
            float r2 = r9.A00
            java.lang.Object r1 = r9.A02
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r1 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r1
            X.AbstractC09560e7.A00(r6)
        L2b:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L38
            X.3Ym r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.AbstractC166987dD.A1Y(r0)
        L38:
            X.0eB r3 = X.C0eB.A00
        L3a:
            return r3
        L3b:
            X.AbstractC09560e7.A00(r6)
            X.57x r1 = r12.A0A
            X.6MT r0 = new X.6MT
            r0.<init>(r1)
            X.6MX r1 = new X.6MX
            r1.<init>(r0)
            float r0 = X.AbstractC25231BEo.A03(r13)
            float r2 = X.AbstractC28007CWe.A00(r1, r0, r15)
            float r1 = java.lang.Math.abs(r2)
            float r0 = r12.A07
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L96
            float r0 = r12.A00
            float r2 = java.lang.Math.copySign(r0, r2)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L6f
            X.3Ym r0 = r12.A08
            java.lang.Object r0 = r0.getValue()
            X.AbstractC166987dD.A1Y(r0)
        L6f:
            float r0 = X.AbstractC25231BEo.A03(r13)
            r11 = 0
            r1 = 0
            X.5Y2 r7 = X.BG4.A00(r0, r15)
            java.lang.Float r8 = X.AbstractC25225BEi.A10(r2)
            r0 = 25
            X.MHr r10 = new X.MHr
            r10.<init>(r13, r0)
            r9.A02 = r12
            r9.A00 = r2
            r9.A01 = r4
            X.5Y4 r6 = X.AbstractC25231BEo.A0P(r1)
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A02(r6, r7, r8, r9, r10, r11)
            if (r0 == r3) goto L3a
            r1 = r12
            goto L2b
        L96:
            r2 = 0
            goto L6f
        L98:
            X.D3j r9 = new X.D3j
            r9.<init>(r12, r14)
            goto L17
        L9f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.toast.ToastDragDismissState.A00(X.3Yl, X.1Ds, float):java.lang.Object");
    }
}
