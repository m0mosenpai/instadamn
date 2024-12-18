package com.meta.metaai.shared.litho.ui.particlering;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C25734BYu;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1", f = "ParticleRingView.kt", i = {0, 0}, l = {197}, m = "invokeSuspend", n = {"$this$forEachIndexed$iv", "index$iv"}, s = {"L$0", "I$2"})
/* loaded from: classes5.dex */
public final class ParticleRingView$updateToSparkleType$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public Object A07;
    public Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ long A0B;
    public final /* synthetic */ C25734BYu A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticleRingView$updateToSparkleType$1(C25734BYu c25734BYu, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, long j) {
        super(2, interfaceC23621Ds);
        this.A0C = c25734BYu;
        this.A0A = i;
        this.A09 = i2;
        this.A0B = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ParticleRingView$updateToSparkleType$1(this.A0C, interfaceC23621Ds, this.A0A, this.A09, this.A0B);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x004c -> B:4:0x001e). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1JX r12 = X.C1JX.A02
            int r0 = r15.A05
            r11 = 1
            if (r0 == 0) goto L4f
            int r0 = r15.A04
            int r7 = r15.A03
            int r10 = r15.A02
            long r1 = r15.A06
            int r3 = r15.A01
            int r6 = r15.A00
            java.lang.Object r9 = r15.A08
            X.BYu r9 = (X.C25734BYu) r9
            java.lang.Object r8 = r15.A07
            android.graphics.PointF[] r8 = (android.graphics.PointF[]) r8
            X.AbstractC09560e7.A00(r16)
        L1e:
            int r7 = r7 + 1
            r14 = r10
        L21:
            if (r7 >= r0) goto L60
            r13 = r8[r7]
            int r10 = r14 + 1
            android.graphics.PointF[] r4 = r9.A08
            int r5 = r4.length
            int r4 = r5 - r11
            boolean r4 = X.AbstractC167007dF.A1P(r14, r4)
            X.C25734BYu.A01(r13, r9, r6, r3, r4)
            long r4 = (long) r5
            long r4 = r1 / r4
            r15.A07 = r8
            r15.A08 = r9
            r15.A00 = r6
            r15.A01 = r3
            r15.A06 = r1
            r15.A02 = r10
            r15.A03 = r7
            r15.A04 = r0
            r15.A05 = r11
            java.lang.Object r4 = X.AbstractC89993zf.A01(r15, r4)
            if (r4 != r12) goto L1e
            return r12
        L4f:
            X.AbstractC09560e7.A00(r16)
            X.BYu r9 = r15.A0C
            android.graphics.PointF[] r8 = r9.A08
            int r6 = r15.A0A
            int r3 = r15.A09
            long r1 = r15.A0B
            int r0 = r8.length
            r7 = 0
            r14 = 0
            goto L21
        L60:
            X.0eB r12 = X.C0eB.A00
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ParticleRingView$updateToSparkleType$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
