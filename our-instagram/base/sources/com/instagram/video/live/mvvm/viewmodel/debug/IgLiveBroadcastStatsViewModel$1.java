package com.instagram.video.live.mvvm.viewmodel.debug;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C50884MeF;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.debug.IgLiveBroadcastStatsViewModel$1", f = "IgLiveBroadcastStatsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveBroadcastStatsViewModel$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C50884MeF A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveBroadcastStatsViewModel$1(C50884MeF c50884MeF, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(4, interfaceC23621Ds);
        this.A03 = c50884MeF;
        this.A04 = z;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj3);
        IgLiveBroadcastStatsViewModel$1 igLiveBroadcastStatsViewModel$1 = new IgLiveBroadcastStatsViewModel$1(this.A03, (InterfaceC23621Ds) obj4, this.A04);
        igLiveBroadcastStatsViewModel$1.A01 = A1a;
        igLiveBroadcastStatsViewModel$1.A00 = obj2;
        igLiveBroadcastStatsViewModel$1.A02 = A1a2;
        return igLiveBroadcastStatsViewModel$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != false) goto L7;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.AbstractC09560e7.A00(r6)
            boolean r3 = r5.A01
            java.lang.Object r2 = r5.A00
            boolean r1 = r5.A02
            X.MeF r0 = r5.A03
            X.05A r4 = r0.A00
            boolean r0 = r5.A04
            if (r0 == 0) goto L16
            if (r3 == 0) goto L16
            r3 = 1
            if (r1 == 0) goto L17
        L16:
            r3 = 0
        L17:
            java.lang.String r2 = r2.toString()
            r1 = 19
            X.MtP r0 = new X.MtP
            r0.<init>(r2, r1, r3)
            r4.Egh(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.debug.IgLiveBroadcastStatsViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
