package com.instagram.save.api;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C31845DzD;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.save.api.SaveHomeViewModel$makeRequest$1", f = "SaveHomeViewModel.kt", i = {0}, l = {125}, m = "invokeSuspend", n = {"callbacks"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class SaveHomeViewModel$makeRequest$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ C31845DzD A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveHomeViewModel$makeRequest$1(C31845DzD c31845DzD, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A02 = c31845DzD;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new SaveHomeViewModel$makeRequest$1(this.A02, interfaceC23621Ds, this.A03, this.A04, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0101, code lost:
    
        if (X.C18U.A06(r2, r10, 36329698132836852L) != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.api.SaveHomeViewModel$makeRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SaveHomeViewModel$makeRequest$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
