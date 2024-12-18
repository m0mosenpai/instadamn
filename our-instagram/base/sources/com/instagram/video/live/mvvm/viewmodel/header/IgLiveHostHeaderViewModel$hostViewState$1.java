package com.instagram.video.live.mvvm.viewmodel.header;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C23831Eq;
import X.C51740MtP;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.header.IgLiveHostHeaderViewModel$hostViewState$1", f = "IgLiveHostHeaderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveHostHeaderViewModel$hostViewState$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ long A00;
    public /* synthetic */ boolean A01;

    public IgLiveHostHeaderViewModel$hostViewState$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        long A0N = AbstractC166987dD.A0N(obj2);
        IgLiveHostHeaderViewModel$hostViewState$1 igLiveHostHeaderViewModel$hostViewState$1 = new IgLiveHostHeaderViewModel$hostViewState$1((InterfaceC23621Ds) obj3);
        igLiveHostHeaderViewModel$hostViewState$1.A01 = A1a;
        igLiveHostHeaderViewModel$hostViewState$1.A00 = A0N;
        return igLiveHostHeaderViewModel$hostViewState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return new C51740MtP(C23831Eq.A02(this.A00), 20, this.A01);
    }
}
