package com.instagram.video.live.mvvm.viewmodel.state;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C51041Mgr;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1", f = "IgLiveViewerStateViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveViewerStateViewModel$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C51041Mgr A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveViewerStateViewModel$1(C51041Mgr c51041Mgr, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A04 = c51041Mgr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 == null) goto L11;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1JX r8 = X.C1JX.A02
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto Ld
            X.AbstractC09560e7.A00(r10)
        La:
            X.0eB r8 = X.C0eB.A00
            return r8
        Ld:
            X.AbstractC09560e7.A00(r10)
            boolean r6 = r9.A03
            java.lang.Object r5 = r9.A01
            X.Mse r5 = (X.C51709Mse) r5
            java.lang.Object r1 = r9.A02
            X.Mgr r0 = r9.A04
            X.0Ui r4 = r0.A0I
            if (r5 == 0) goto L21
            r3 = 1
            if (r1 != 0) goto L22
        L21:
            r3 = 0
        L22:
            r2 = 0
            if (r5 == 0) goto L37
            java.lang.String r1 = r5.A08
        L27:
            X.NcU r0 = new X.NcU
            r0.<init>(r6, r3, r1)
            r9.A01 = r2
            r9.A00 = r7
            java.lang.Object r0 = r4.emit(r0, r9)
            if (r0 != r8) goto La
            return r8
        L37:
            r1 = r2
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        IgLiveViewerStateViewModel$1 igLiveViewerStateViewModel$1 = new IgLiveViewerStateViewModel$1(this.A04, (InterfaceC23621Ds) obj4);
        igLiveViewerStateViewModel$1.A03 = A1a;
        igLiveViewerStateViewModel$1.A01 = obj2;
        igLiveViewerStateViewModel$1.A02 = obj3;
        return igLiveViewerStateViewModel$1.invokeSuspend(C0eB.A00);
    }
}
