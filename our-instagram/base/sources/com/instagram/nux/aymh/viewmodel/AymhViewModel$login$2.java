package com.instagram.nux.aymh.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C07270a1;
import X.C0eB;
import X.E6N;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2", f = "AymhViewModel.kt", i = {}, l = {266, 278, 278}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AymhViewModel$login$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C07270a1 A03;
    public final /* synthetic */ E6N A04;
    public final /* synthetic */ AymhViewModel A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AymhViewModel$login$2(C07270a1 c07270a1, E6N e6n, AymhViewModel aymhViewModel, Integer num, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = aymhViewModel;
        this.A04 = e6n;
        this.A03 = c07270a1;
        this.A07 = z;
        this.A06 = num;
        this.A02 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        AymhViewModel aymhViewModel = this.A05;
        E6N e6n = this.A04;
        return new AymhViewModel$login$2(this.A03, e6n, aymhViewModel, this.A06, interfaceC23621Ds, this.A02, this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r7 = r14
            X.1JX r0 = X.C1JX.A02
            int r3 = r13.A00
            r2 = 3
            r1 = 2
            r5 = 1
            if (r3 == 0) goto L14
            if (r3 == r5) goto L49
            if (r3 == r1) goto L6e
            X.AbstractC09560e7.A00(r14)
        L11:
            X.0eB r0 = X.C0eB.A00
            return r0
        L14:
            X.AbstractC09560e7.A00(r14)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r3 = r13.A05
            X.FbK r4 = r3.A03
            X.E6N r3 = r13.A04
            X.GY0 r7 = r4.A00(r3)
            java.lang.Object r9 = r3.A02
            X.0a1 r8 = r13.A03
            r12 = 0
            r13.A00 = r5
            X.0vz r3 = r8.getDeviceSession()
            android.content.Context r3 = r3.A06()
            java.lang.String r10 = X.C16030qx.A00(r3)
            X.0qx r4 = X.C16030qx.A02
            X.0vz r3 = r8.getDeviceSession()
            android.content.Context r3 = r3.A06()
            java.lang.String r11 = r4.A05(r3)
            java.lang.Object r7 = r7.Cma(r8, r9, r10, r11, r12, r13)
            if (r7 != r0) goto L4c
            return r0
        L49:
            X.AbstractC09560e7.A00(r14)
        L4c:
            X.3NY r7 = (X.C3NY) r7
            com.instagram.nux.aymh.viewmodel.AymhViewModel r4 = r13.A05
            X.E6N r6 = r13.A04
            X.0a1 r5 = r13.A03
            r11 = 0
            boolean r12 = r13.A07
            java.lang.Integer r8 = r13.A06
            int r9 = r13.A02
            r10 = 3584(0xe00, float:5.022E-42)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.F9Z.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.1Iq r4 = r4.A0B
            r13.A01 = r4
            r13.A00 = r1
            java.lang.Object r7 = r3.A01(r13)
            if (r7 != r0) goto L75
            return r0
        L6e:
            java.lang.Object r4 = r13.A01
            X.1Ir r4 = (X.InterfaceC24741Ir) r4
            X.AbstractC09560e7.A00(r14)
        L75:
            X.OKH r7 = (X.OKH) r7
            java.lang.Object r3 = r7.A00()
            r1 = 0
            r13.A01 = r1
            r13.A00 = r2
            java.lang.Object r1 = r4.EMz(r3, r13)
            if (r1 != r0) goto L11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AymhViewModel$login$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
