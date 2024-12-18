package androidx.compose.foundation.pager;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C5Y6;
import X.C6M8;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2", f = "PagerState.kt", i = {}, l = {953}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class PagerStateKt$animateScrollToPage$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C5Y6 A04;
    public final /* synthetic */ C6M8 A05;
    public final /* synthetic */ InterfaceC16620sF A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$animateScrollToPage$2(C5Y6 c5y6, C6M8 c6m8, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, float f, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = interfaceC16620sF;
        this.A03 = i;
        this.A05 = c6m8;
        this.A02 = f;
        this.A04 = c5y6;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC16620sF interfaceC16620sF = this.A06;
        int i = this.A03;
        PagerStateKt$animateScrollToPage$2 pagerStateKt$animateScrollToPage$2 = new PagerStateKt$animateScrollToPage$2(this.A04, this.A05, interfaceC23621Ds, interfaceC16620sF, this.A02, i);
        pagerStateKt$animateScrollToPage$2.A01 = obj;
        return pagerStateKt$animateScrollToPage$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r1 = r0;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1JX r2 = X.C1JX.A02
            r10 = r15
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto Le
            X.AbstractC09560e7.A00(r16)
        Lb:
            X.0eB r2 = X.C0eB.A00
            return r2
        Le:
            X.AbstractC09560e7.A00(r16)
            java.lang.Object r3 = r15.A01
            X.6MC r3 = (X.C6MC) r3
            X.0sF r1 = r15.A06
            int r8 = r15.A03
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            r1.invoke(r3, r0)
            X.6M8 r7 = r15.A05
            int r0 = r7.B6n()
            r6 = 0
            boolean r9 = X.AbstractC25230BEn.A1S(r8, r0)
            int r1 = r7.BM2()
            int r0 = r7.B6n()
            int r1 = r1 - r0
            int r5 = r1 + 1
            if (r9 == 0) goto L5e
            int r0 = r7.BM2()
            if (r8 > r0) goto L64
        L3f:
            float r13 = r7.AF6(r8)
            float r0 = r15.A02
            float r13 = r13 + r0
            X.0pO r1 = new X.0pO
            r1.<init>()
            X.5Y6 r9 = r15.A04
            r0 = 5
            X.DbT r11 = new X.DbT
            r11.<init>(r0, r3, r1)
            r15.A00 = r4
            r12 = 0
            r14 = r12
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r9, r10, r11, r12, r13, r14)
            if (r0 != r2) goto Lb
            return r2
        L5e:
            int r0 = r7.B6n()
            if (r8 >= r0) goto L3f
        L64:
            int r0 = r7.B6n()
            int r0 = r8 - r0
            int r1 = java.lang.Math.abs(r0)
            r0 = 3
            if (r1 < r0) goto L3f
            if (r9 == 0) goto L80
            int r1 = r8 - r5
            int r0 = r7.B6n()
            if (r1 >= r0) goto L7c
        L7b:
            r1 = r0
        L7c:
            r7.EmI(r3, r1, r6)
            goto L3f
        L80:
            int r1 = r8 + r5
            int r0 = r7.B6n()
            if (r1 <= r0) goto L7c
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PagerStateKt$animateScrollToPage$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
