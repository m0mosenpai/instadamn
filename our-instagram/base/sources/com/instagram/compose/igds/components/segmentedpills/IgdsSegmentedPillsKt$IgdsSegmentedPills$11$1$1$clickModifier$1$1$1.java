package com.instagram.compose.igds.components.segmentedpills;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1", f = "IgdsSegmentedPills.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ LazyListState A04;
    public final /* synthetic */ InterfaceC74953Yl A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1(LazyListState lazyListState, InterfaceC74953Yl interfaceC74953Yl, InterfaceC23621Ds interfaceC23621Ds, float f, float f2, float f3) {
        super(2, interfaceC23621Ds);
        this.A04 = lazyListState;
        this.A05 = interfaceC74953Yl;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1(this.A04, this.A05, interfaceC23621Ds, this.A01, this.A02, this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r0 == r8) goto L15;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1JX r8 = X.C1JX.A02
            int r0 = r10.A00
            r2 = 1
            if (r0 == 0) goto Ld
            X.AbstractC09560e7.A00(r11)
        La:
            X.0eB r8 = X.C0eB.A00
            return r8
        Ld:
            X.AbstractC09560e7.A00(r11)
            androidx.compose.foundation.lazy.LazyListState r9 = r10.A04
            X.3Yl r0 = r10.A05
            java.lang.Object r1 = r0.getValue()
            X.BfM r1 = (X.C26033BfM) r1
            float r0 = r10.A01
            float r7 = r10.A02
            float r6 = r10.A03
            r10.A00 = r2
            float r5 = r1.A01
            float r4 = r1.A02
            float r5 = r5 - r4
            float r5 = r5 - r0
            r3 = 1
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r2 = X.AbstractC25230BEn.A1P(r0)
            float r1 = r1.A00
            float r1 = r1 + r4
            float r1 = r1 + r7
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L39
            r3 = 0
        L39:
            if (r2 != 0) goto L3f
            if (r3 == 0) goto L4d
            float r5 = r1 - r6
        L3f:
            r0 = 0
            X.5Y4 r0 = X.AbstractC25231BEo.A0P(r0)
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollExtensionsKt.A00(r0, r9, r10, r5)
            if (r0 != r8) goto L4d
        L4a:
            if (r0 != r8) goto La
            return r8
        L4d:
            X.0eB r0 = X.C0eB.A00
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
