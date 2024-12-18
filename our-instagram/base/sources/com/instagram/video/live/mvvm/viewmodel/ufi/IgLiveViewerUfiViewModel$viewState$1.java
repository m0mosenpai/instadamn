package com.instagram.video.live.mvvm.viewmodel.ufi;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C0s9;
import X.C53011Ncj;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1", f = "IgLiveViewerUfiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveViewerUfiViewModel$viewState$1 extends AbstractC23611Dp implements C0s9 {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public /* synthetic */ boolean A05;
    public final /* synthetic */ C53011Ncj A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveViewerUfiViewModel$viewState$1(C53011Ncj c53011Ncj, InterfaceC23621Ds interfaceC23621Ds) {
        super(7, interfaceC23621Ds);
        this.A06 = c53011Ncj;
    }

    @Override // X.C0s9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj6);
        IgLiveViewerUfiViewModel$viewState$1 igLiveViewerUfiViewModel$viewState$1 = new IgLiveViewerUfiViewModel$viewState$1(this.A06, (InterfaceC23621Ds) obj7);
        igLiveViewerUfiViewModel$viewState$1.A04 = A1a;
        igLiveViewerUfiViewModel$viewState$1.A00 = obj2;
        igLiveViewerUfiViewModel$viewState$1.A01 = obj3;
        igLiveViewerUfiViewModel$viewState$1.A02 = obj4;
        igLiveViewerUfiViewModel$viewState$1.A03 = obj5;
        igLiveViewerUfiViewModel$viewState$1.A05 = A1a2;
        return igLiveViewerUfiViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r5 == X.C3PO.A05) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r4.A08 == false) goto L37;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            X.AbstractC09560e7.A00(r25)
            r0 = r24
            boolean r11 = r0.A04
            java.lang.Object r7 = r0.A00
            X.Mrj r7 = (X.C51652Mrj) r7
            java.lang.Object r10 = r0.A01
            X.9B7 r10 = (X.C9B7) r10
            java.lang.Object r9 = r0.A02
            java.lang.Object r8 = r0.A03
            X.Mse r8 = (X.C51709Mse) r8
            boolean r1 = r0.A05
            X.Ncj r4 = r0.A06
            java.util.List r3 = r4.A04
            r3.clear()
            X.Nfg r6 = X.EnumC53184Nfg.A04
            r3.add(r6)
            X.Nfg r2 = X.EnumC53184Nfg.A09
            r3.add(r2)
            r5 = 1
            if (r9 != 0) goto Lc0
            if (r8 == 0) goto L37
            boolean r0 = r8.A0M
            if (r0 != r5) goto L37
        L31:
            if (r7 == 0) goto Lb9
            boolean r0 = r7.A0B
            if (r0 != r5) goto Lb9
        L37:
            boolean r0 = r10.A01
            if (r0 == 0) goto L40
            X.Nfg r0 = X.EnumC53184Nfg.A07
            r3.add(r0)
        L40:
            if (r7 == 0) goto L4b
            boolean r0 = r7.A0F
            if (r0 != r5) goto L4b
            X.Nfg r0 = X.EnumC53184Nfg.A08
            r3.add(r0)
        L4b:
            boolean r0 = r4.A07
            if (r0 != 0) goto L54
            X.Nfg r0 = X.EnumC53184Nfg.A06
            r3.add(r0)
        L54:
            r5 = 0
            if (r8 == 0) goto Lb7
            X.3PO r7 = r8.A06
        L59:
            X.3PO r0 = X.C3PO.A04
            if (r7 == r0) goto L65
            if (r8 == 0) goto L61
            X.3PO r5 = r8.A06
        L61:
            X.3PO r0 = X.C3PO.A05
            if (r5 != r0) goto L68
        L65:
            r3.remove(r2)
        L68:
            int r0 = r3.size()
            r5 = 4
            if (r0 > r5) goto L72
            r4.A01()
        L72:
            X.Nfg r0 = X.EnumC53184Nfg.A02
            boolean r12 = r4.isButtonVisible(r0, r3, r11)
            int r0 = r3.size()
            boolean r13 = X.AbstractC25230BEn.A1S(r0, r5)
            boolean r14 = r4.isButtonVisible(r6, r3, r11)
            X.Nfg r0 = X.EnumC53184Nfg.A06
            boolean r16 = r4.isButtonVisible(r0, r3, r11)
            X.Nfg r0 = X.EnumC53184Nfg.A07
            boolean r0 = r4.isButtonVisible(r0, r3, r11)
            if (r0 == 0) goto L98
            boolean r0 = r4.A08
            r17 = 1
            if (r0 != 0) goto L9a
        L98:
            r17 = 0
        L9a:
            X.Nfg r0 = X.EnumC53184Nfg.A08
            boolean r18 = r4.isButtonVisible(r0, r3, r11)
            boolean r19 = r4.isButtonVisible(r2, r3, r11)
            r10 = 0
            java.lang.String r8 = ""
            X.Msd r7 = new X.Msd
            r9 = r8
            r15 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r7
        Lb7:
            r7 = r5
            goto L59
        Lb9:
            X.Nfg r0 = X.EnumC53184Nfg.A02
            r3.add(r0)
            goto L37
        Lc0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L37
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
