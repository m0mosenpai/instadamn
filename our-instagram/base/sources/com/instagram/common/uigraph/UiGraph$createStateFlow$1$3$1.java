package com.instagram.common.uigraph;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.common.uigraph.UiGraph$createStateFlow$1$3$1", f = "UiGraph.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class UiGraph$createStateFlow$1$3$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ UiGraph A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiGraph$createStateFlow$1$3$1(UiGraph uiGraph, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = uiGraph;
        this.A03 = str;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0H = AbstractC166987dD.A0H(obj2);
        UiGraph$createStateFlow$1$3$1 uiGraph$createStateFlow$1$3$1 = new UiGraph$createStateFlow$1$3$1(this.A02, this.A03, (InterfaceC23621Ds) obj3);
        uiGraph$createStateFlow$1$3$1.A01 = obj;
        uiGraph$createStateFlow$1$3$1.A00 = A0H;
        return uiGraph$createStateFlow$1$3$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r4 == Integer.MAX_VALUE) goto L23;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r2 = r10.A01
            X.9BW r2 = (X.C9BW) r2
            int r7 = r10.A00
            com.instagram.common.uigraph.UiGraph r0 = r10.A02
            java.lang.String r6 = r10.A03
            java.util.Map r3 = r0.A04
            monitor-enter(r3)
            java.util.Collection r0 = r3.values()     // Catch: java.lang.Throwable -> La6
            r5 = 0
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> La6
        L19:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L31
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> La6
            X.3ZE r0 = (X.C3ZE) r0     // Catch: java.lang.Throwable -> La6
            X.0UO r0 = r0.A08     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La6
            int r0 = X.AbstractC166987dD.A0H(r0)     // Catch: java.lang.Throwable -> La6
            int r5 = r5 + r0
            goto L19
        L31:
            monitor-exit(r3)
            r9 = 0
            X.AbstractC167007dF.A1K(r2, r6)
            java.lang.Object r1 = r2.A00
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.isEmpty()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L78
            java.lang.Object r0 = r2.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L75
            java.lang.Object r1 = r0.get()
            X.3ZQ r1 = (X.C3ZQ) r1
            if (r1 == 0) goto L75
            boolean r0 = r1 instanceof X.C3ZR
            if (r0 == 0) goto L75
            X.3ZR r1 = (X.C3ZR) r1
            if (r1 == 0) goto L75
            int r4 = r1.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L75
            r3 = r4
        L62:
            if (r4 != r8) goto L65
        L64:
            r4 = 0
        L65:
            int r0 = java.lang.Math.max(r3, r9)
            X.E6s r2 = new X.E6s
            r2.<init>(r6, r7, r4, r0)
            r1 = 5
            X.Mtc r0 = new X.Mtc
            r0.<init>(r2, r5, r1)
            return r0
        L75:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L64
        L78:
            java.util.Iterator r2 = r1.iterator()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 2147483647(0x7fffffff, float:NaN)
        L81:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r1 = r2.next()
            X.3ZQ r1 = (X.C3ZQ) r1
            boolean r0 = r1 instanceof X.C3ZR
            if (r0 == 0) goto L81
            X.3ZR r1 = (X.C3ZR) r1
            if (r1 == 0) goto L81
            int r1 = r1.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L81
            int r4 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.max(r3, r1)
            goto L81
        La6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.uigraph.UiGraph$createStateFlow$1$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
