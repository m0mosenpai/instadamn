package com.instagram.nux.ndx.util;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.FMC;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.facebook.common.dextricks.JITProfilePQR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1", f = "NdxStepsManager.kt", i = {0, 0}, l = {40, JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN}, m = "invokeSuspend", n = {"steps", "start$iv"}, s = {"L$0", "J$0"})
/* loaded from: classes6.dex */
public final class NdxStepsManager$updateEligibleStepsStore$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ FMC A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NdxStepsManager$updateEligibleStepsStore$1(FMC fmc, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A06 = fmc;
        this.A05 = j;
        this.A04 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new NdxStepsManager$updateEligibleStepsStore$1(this.A06, interfaceC23621Ds, this.A04, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ed, code lost:
    
        if (r14 == r6) goto L21;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NdxStepsManager$updateEligibleStepsStore$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
