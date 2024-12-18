package com.instagram.video.live.mvvm.viewmodel.viewer;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.viewer.IgLiveViewerMediaStyleViewModel$viewState$1", f = "IgLiveViewerMediaStyleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveViewerMediaStyleViewModel$viewState$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ float A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;

    public IgLiveViewerMediaStyleViewModel$viewState$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj3);
        float A09 = AbstractC166987dD.A09(obj4);
        IgLiveViewerMediaStyleViewModel$viewState$1 igLiveViewerMediaStyleViewModel$viewState$1 = new IgLiveViewerMediaStyleViewModel$viewState$1((InterfaceC23621Ds) obj5);
        igLiveViewerMediaStyleViewModel$viewState$1.A01 = A1a;
        igLiveViewerMediaStyleViewModel$viewState$1.A02 = A1a2;
        igLiveViewerMediaStyleViewModel$viewState$1.A03 = A1a3;
        igLiveViewerMediaStyleViewModel$viewState$1.A00 = A09;
        return igLiveViewerMediaStyleViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r6 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return new X.C50634MWv(r3, r2, r4, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r7 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r5 == false) goto L14;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.AbstractC09560e7.A00(r9)
            boolean r7 = r8.A01
            boolean r6 = r8.A02
            boolean r5 = r8.A03
            float r1 = r8.A00
            r0 = 1058013184(0x3f100000, float:0.5625)
            r4 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.MSY.A1R(r0)
            if (r5 != 0) goto L2d
            if (r7 != 0) goto L1a
            if (r0 != 0) goto L2d
        L1a:
            r3 = 1
        L1b:
            r2 = 1
            if (r7 != 0) goto L2b
        L1e:
            r2 = 0
            if (r5 == 0) goto L2b
            if (r6 == 0) goto L2b
        L23:
            r1 = 8
            X.MWv r0 = new X.MWv
            r0.<init>(r3, r2, r4, r1)
            return r0
        L2b:
            r4 = 0
            goto L23
        L2d:
            r3 = 0
            if (r5 != 0) goto L1e
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.viewer.IgLiveViewerMediaStyleViewModel$viewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
