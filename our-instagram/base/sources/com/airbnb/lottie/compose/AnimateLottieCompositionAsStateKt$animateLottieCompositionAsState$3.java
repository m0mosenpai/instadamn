package com.airbnb.lottie.compose;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C28794CnQ;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import X.SQ2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ SQ2 A04;
    public final /* synthetic */ C28794CnQ A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(InterfaceC74953Yl interfaceC74953Yl, SQ2 sq2, C28794CnQ c28794CnQ, Integer num, InterfaceC23621Ds interfaceC23621Ds, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, interfaceC23621Ds);
        this.A07 = z;
        this.A08 = z2;
        this.A05 = c28794CnQ;
        this.A04 = sq2;
        this.A02 = i;
        this.A09 = z3;
        this.A01 = f;
        this.A06 = num;
        this.A0A = z4;
        this.A03 = interfaceC74953Yl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A07;
        boolean z2 = this.A08;
        C28794CnQ c28794CnQ = this.A05;
        SQ2 sq2 = this.A04;
        int i = this.A02;
        boolean z3 = this.A09;
        float f = this.A01;
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.A03, sq2, c28794CnQ, this.A06, interfaceC23621Ds, f, i, z, z2, z3, this.A0A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        r3 = X.AnonymousClass194.A00(r15, new X.C57170PZo(X.EnumC27348C5d.Default, r8.A00, new com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2((X.SQ2) r7.getValue(), r8, null, r10, 1, !X.AbstractC167007dF.A1N((r10 > X.AbstractC25231BEo.A03(r8.A07) ? 1 : (r10 == X.AbstractC25231BEo.A03(r8.A07) ? 0 : -1)))), (X.InterfaceC23621Ds) null, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r3 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r3 = X.C0eB.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r3 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r3 = X.C0eB.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r3 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r5 < 0.0f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if (r6 == null) goto L25;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1JX r1 = X.C1JX.A02
            int r3 = r15.A00
            r2 = 2
            r11 = 1
            if (r3 == 0) goto L10
            if (r3 == r11) goto L7e
            X.AbstractC09560e7.A00(r16)
        Ld:
            X.0eB r1 = X.C0eB.A00
            return r1
        L10:
            X.AbstractC09560e7.A00(r16)
            boolean r3 = r15.A07
            if (r3 == 0) goto L81
            X.3Yl r3 = r15.A03
            boolean r3 = X.AbstractC25230BEn.A1X(r3)
            if (r3 != 0) goto L81
            boolean r3 = r15.A08
            if (r3 == 0) goto L81
            X.CnQ r8 = r15.A05
            r15.A00 = r11
            X.3Yl r7 = r8.A02
            java.lang.Object r6 = r7.getValue()
            X.3Yl r3 = r8.A01
            r3.getValue()
            r9 = 0
            X.3Yl r3 = r8.A0A
            float r5 = X.AbstractC25231BEo.A03(r3)
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 >= 0) goto L75
            if (r6 != 0) goto L79
        L42:
            java.lang.Object r7 = r7.getValue()
            X.SQ2 r7 = (X.SQ2) r7
            X.3Yl r3 = r8.A07
            float r3 = X.AbstractC25231BEo.A03(r3)
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            boolean r3 = X.AbstractC167007dF.A1N(r3)
            r12 = r3 ^ 1
            X.6MD r5 = r8.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2 r6 = new com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.C5d r4 = X.EnumC27348C5d.Default
            r8 = 0
            X.PZo r3 = new X.PZo
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r3 = X.AnonymousClass194.A00(r15, r3)
            if (r3 == r1) goto L6e
            X.0eB r3 = X.C0eB.A00
        L6e:
            if (r3 == r1) goto L72
            X.0eB r3 = X.C0eB.A00
        L72:
            if (r3 != r1) goto L81
            return r1
        L75:
            if (r6 != 0) goto L79
        L77:
            r10 = 0
            goto L42
        L79:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 >= 0) goto L77
            goto L42
        L7e:
            X.AbstractC09560e7.A00(r16)
        L81:
            X.3Yl r4 = r15.A03
            boolean r3 = r15.A07
            X.AbstractC25227BEk.A1A(r4, r3)
            if (r3 == 0) goto Ld
            X.CnQ r5 = r15.A05
            X.SQ2 r4 = r15.A04
            int r11 = r15.A02
            boolean r12 = r15.A09
            float r8 = r15.A01
            X.3Yl r3 = r5.A07
            float r9 = X.AbstractC25231BEo.A03(r3)
            java.lang.Integer r6 = r15.A06
            boolean r13 = r15.A0A
            r7 = 0
            r15.A00 = r2
            X.3Yl r2 = r5.A04
            int r10 = X.AbstractC25231BEo.A0E(r2)
            r14 = 0
            X.6MD r2 = r5.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 r3 = new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.C5d r9 = X.EnumC27348C5d.Default
            X.PZo r8 = new X.PZo
            r10 = r2
            r11 = r3
            r12 = r7
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r0 = X.AnonymousClass194.A00(r15, r8)
            if (r0 == r1) goto Lc2
            X.0eB r0 = X.C0eB.A00
        Lc2:
            if (r0 != r1) goto Ld
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
