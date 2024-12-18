package com.instagram.video.live.mvvm.viewmodel.state;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C41181vS;
import X.C51041Mgr;
import X.InterfaceC147636ko;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1", f = "IgLiveViewerStateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveViewerStateViewModel$onEnteringBroadcast$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ boolean A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC147636ko A02;
    public final /* synthetic */ C51041Mgr A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveViewerStateViewModel$onEnteringBroadcast$1(C41181vS c41181vS, InterfaceC147636ko interfaceC147636ko, C51041Mgr c51041Mgr, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = c51041Mgr;
        this.A01 = c41181vS;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = interfaceC147636ko;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C51041Mgr c51041Mgr = this.A03;
        IgLiveViewerStateViewModel$onEnteringBroadcast$1 igLiveViewerStateViewModel$onEnteringBroadcast$1 = new IgLiveViewerStateViewModel$onEnteringBroadcast$1(this.A01, this.A02, c51041Mgr, this.A04, this.A05, interfaceC23621Ds);
        igLiveViewerStateViewModel$onEnteringBroadcast$1.A00 = AbstractC166987dD.A1a(obj);
        return igLiveViewerStateViewModel$onEnteringBroadcast$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgLiveViewerStateViewModel$onEnteringBroadcast$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0.CX2() != true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r0.A00() == true) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.AbstractC09560e7.A00(r20)
            r1 = r19
            boolean r0 = r1.A00
            if (r0 == 0) goto L94
            X.Mgr r8 = r1.A03
            X.1vS r6 = r1.A01
            java.lang.String r10 = r1.A04
            java.lang.String r9 = r1.A05
            X.6ko r7 = r1.A02
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r2 = r8.A0D
            X.6cg r1 = r2.A04
            X.6cg r0 = X.EnumC142806cg.A03
            r11 = 0
            if (r1 != r0) goto L2d
            com.instagram.reels.store.ReelStore r1 = r2.A01
            X.05A r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.Mse r0 = (X.C51709Mse) r0
            if (r0 == 0) goto Lc3
            java.lang.String r0 = r0.A08
        L2a:
            r1.A0c(r0)
        L2d:
            X.05A r0 = r2.A05
            r0.Egh(r11)
            X.6lA r5 = r8.A0E
            X.6lB r4 = r5.A01
            r2 = 0
            r4.A00 = r2
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            r4.A01 = r0
            r4.A02 = r11
            r4.A03 = r11
            r5.A00 = r11
            X.05A r1 = r5.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.Egh(r0)
            X.4pt r3 = r6.A0c
            if (r3 == 0) goto Lc1
            X.3PO r1 = r3.A0A
            if (r1 != 0) goto L58
            X.3PO r1 = X.C3PO.A08
        L58:
            X.3PO r0 = X.C3PO.A04
            r4 = 1
            if (r1 != r0) goto L79
            X.1Ai r5 = r8.A05
            X.0ry r2 = r5.A6O
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 112(0x70, float:1.57E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r5, r2, r1, r0)
            if (r0 != 0) goto L79
            X.4vU r0 = r3.A02
            if (r0 == 0) goto L7a
            X.4vN r0 = r0.A0A
            if (r0 == 0) goto L7a
            boolean r0 = r0.CX2()
            if (r0 != r4) goto L7a
        L79:
            r4 = 0
        L7a:
            r2 = 1
            if (r4 == 0) goto L97
            r8.A03 = r2
            X.6aw r0 = X.AbstractC141776au.A00(r8)
            r12 = 13
            X.JZ1 r5 = new X.JZ1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AbstractC166987dD.A1Z(r5, r0)
        L8d:
            X.195 r0 = r8.A02
            if (r0 == 0) goto L94
            r0.AGH(r11)
        L94:
            X.0eB r0 = X.C0eB.A00
            return r0
        L97:
            if (r3 == 0) goto Lbf
            java.lang.String r1 = r3.A0X
            r1.getClass()
        L9e:
            r18 = 1
            if (r3 == 0) goto Lbd
            X.4va r0 = r3.A06
            if (r0 != 0) goto La8
            X.4va r0 = X.EnumC109104va.A0E
        La8:
            boolean r0 = r0.A00()
            if (r0 != r2) goto Lbd
        Lae:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r12 = r7
            r13 = r8
            r15 = r1
            r16 = r10
            r17 = r9
            X.C51041Mgr.A00(r12, r13, r14, r15, r16, r17, r18)
            goto L8d
        Lbd:
            r2 = 0
            goto Lae
        Lbf:
            r1 = 0
            goto L9e
        Lc1:
            r1 = 0
            goto L58
        Lc3:
            r0 = r11
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
