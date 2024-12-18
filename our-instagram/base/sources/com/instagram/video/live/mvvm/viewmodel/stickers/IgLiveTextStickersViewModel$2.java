package com.instagram.video.live.mvvm.viewmodel.stickers;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C05A;
import X.C0eB;
import X.C50526MSf;
import X.C50941MfA;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveTextStickersViewModel$2", f = "IgLiveTextStickersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveTextStickersViewModel$2 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C50941MfA A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveTextStickersViewModel$2(C50941MfA c50941MfA, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = c50941MfA;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj3);
        IgLiveTextStickersViewModel$2 igLiveTextStickersViewModel$2 = new IgLiveTextStickersViewModel$2(this.A03, (InterfaceC23621Ds) obj4);
        igLiveTextStickersViewModel$2.A00 = A1a;
        igLiveTextStickersViewModel$2.A01 = A1a2;
        igLiveTextStickersViewModel$2.A02 = A1a3;
        return igLiveTextStickersViewModel$2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        C05A c05a = this.A03.A03;
        boolean z4 = true;
        boolean z5 = !z;
        if (!z2 || z3) {
            z4 = false;
        }
        C50526MSf.A00(c05a, 20, z5, z4);
        return C0eB.A00;
    }
}
