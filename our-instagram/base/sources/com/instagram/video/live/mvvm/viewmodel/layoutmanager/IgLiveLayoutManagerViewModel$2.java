package com.instagram.video.live.mvvm.viewmodel.layoutmanager;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C51006MgD;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.layoutmanager.IgLiveLayoutManagerViewModel$2", f = "IgLiveLayoutManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveLayoutManagerViewModel$2 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ float A00;
    public /* synthetic */ float A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C51006MgD A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveLayoutManagerViewModel$2(C51006MgD c51006MgD, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = c51006MgD;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        float A09 = AbstractC166987dD.A09(obj2);
        float A092 = AbstractC166987dD.A09(obj3);
        IgLiveLayoutManagerViewModel$2 igLiveLayoutManagerViewModel$2 = new IgLiveLayoutManagerViewModel$2(this.A03, (InterfaceC23621Ds) obj4);
        igLiveLayoutManagerViewModel$2.A02 = A1a;
        igLiveLayoutManagerViewModel$2.A00 = A09;
        igLiveLayoutManagerViewModel$2.A01 = A092;
        return igLiveLayoutManagerViewModel$2.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (X.C51006MgD.A00(r8) < r8.A01) goto L6;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.AbstractC09560e7.A00(r12)
            boolean r10 = r11.A02
            float r9 = r11.A00
            float r2 = r11.A01
            X.MgD r8 = r11.A03
            X.05A r4 = r8.A03
            X.6cg r7 = r8.A02
            X.6cg r6 = X.EnumC142806cg.A05
            r5 = 0
            if (r7 == r6) goto L1d
            int r1 = r8.A01
            int r0 = X.C51006MgD.A00(r8)
            r3 = 0
            if (r0 >= r1) goto L1e
        L1d:
            r3 = 1
        L1e:
            if (r10 == 0) goto L5e
            boolean r0 = r8.A07
            if (r0 == 0) goto L5e
            float r1 = r8.A00
        L26:
            float r0 = java.lang.Math.max(r9, r2)
            float r2 = java.lang.Math.max(r1, r0)
            if (r7 == r6) goto L41
            int r1 = r8.A01
            int r0 = X.C51006MgD.A00(r8)
            if (r0 >= r1) goto L58
            int r0 = X.C51006MgD.A00(r8)
        L3c:
            if (r0 >= r5) goto L3f
            r0 = 0
        L3f:
            int r5 = r0 / 2
        L41:
            float r0 = (float) r5
            float r2 = r2 - r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L49
            r2 = 0
        L49:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r0
            r1 = 1
            X.Mrs r0 = new X.Mrs
            r0.<init>(r1, r2, r3)
            r4.Egh(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L58:
            int r0 = X.C51006MgD.A00(r8)
            int r0 = r0 - r1
            goto L3c
        L5e:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.layoutmanager.IgLiveLayoutManagerViewModel$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
