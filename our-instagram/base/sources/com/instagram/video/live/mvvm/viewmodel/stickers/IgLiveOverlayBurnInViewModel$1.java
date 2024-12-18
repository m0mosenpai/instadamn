package com.instagram.video.live.mvvm.viewmodel.stickers;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C15370ps;
import X.C50951MfK;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveOverlayBurnInViewModel$1", f = "IgLiveOverlayBurnInViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveOverlayBurnInViewModel$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public /* synthetic */ boolean A05;
    public final /* synthetic */ C50951MfK A06;
    public final /* synthetic */ C15370ps A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveOverlayBurnInViewModel$1(C50951MfK c50951MfK, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps) {
        super(6, interfaceC23621Ds);
        this.A06 = c50951MfK;
        this.A07 = c15370ps;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0025, code lost:
    
        if (r10.A06.A07 == false) goto L13;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1JX r6 = X.C1JX.A02
            int r0 = r10.A00
            r7 = 1
            if (r0 == 0) goto Ld
            X.AbstractC09560e7.A00(r11)
        La:
            X.0eB r6 = X.C0eB.A00
            return r6
        Ld:
            X.AbstractC09560e7.A00(r11)
            boolean r2 = r10.A01
            boolean r9 = r10.A02
            boolean r8 = r10.A03
            boolean r1 = r10.A04
            boolean r0 = r10.A05
            if (r2 != 0) goto L1e
            if (r1 == 0) goto L27
        L1e:
            if (r0 != 0) goto L27
            X.MfK r0 = r10.A06
            boolean r0 = r0.A07
            r3 = 1
            if (r0 != 0) goto L28
        L27:
            r3 = 0
        L28:
            X.MfK r5 = r10.A06
            X.05A r2 = r5.A05
            r1 = 16
            X.MsJ r0 = new X.MsJ
            r0.<init>(r3, r1)
            r2.Egh(r0)
            r4 = 0
            if (r3 == 0) goto L59
            boolean r0 = r5.A08
            if (r0 == 0) goto L41
            if (r9 != 0) goto L41
            if (r8 == 0) goto L59
        L41:
            X.0ps r3 = r10.A07
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto La
            X.6aw r2 = X.AbstractC141776au.A00(r5)
            r1 = 33
            X.PZD r0 = new X.PZD
            r0.<init>(r5, r4, r1)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r0, r2)
            r3.A00 = r0
            goto La
        L59:
            X.0ps r1 = r10.A07
            java.lang.Object r0 = r1.A00
            X.195 r0 = (X.AnonymousClass195) r0
            if (r0 == 0) goto L64
            r0.AGH(r4)
        L64:
            r1.A00 = r4
            X.1Iq r4 = r5.A03
            android.graphics.Bitmap$Config r3 = r5.A02
            double r1 = r5.A00
            X.Ncd r0 = new X.Ncd
            r0.<init>(r3, r1)
            r10.A00 = r7
            java.lang.Object r0 = r4.EMz(r0, r10)
            if (r0 != r6) goto La
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveOverlayBurnInViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj3);
        boolean A1a4 = AbstractC166987dD.A1a(obj4);
        boolean A1a5 = AbstractC166987dD.A1a(obj5);
        IgLiveOverlayBurnInViewModel$1 igLiveOverlayBurnInViewModel$1 = new IgLiveOverlayBurnInViewModel$1(this.A06, (InterfaceC23621Ds) obj6, this.A07);
        igLiveOverlayBurnInViewModel$1.A01 = A1a;
        igLiveOverlayBurnInViewModel$1.A02 = A1a2;
        igLiveOverlayBurnInViewModel$1.A03 = A1a3;
        igLiveOverlayBurnInViewModel$1.A04 = A1a4;
        igLiveOverlayBurnInViewModel$1.A05 = A1a5;
        return igLiveOverlayBurnInViewModel$1.invokeSuspend(C0eB.A00);
    }
}
