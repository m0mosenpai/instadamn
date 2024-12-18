package com.instagram.rtc.interactor.areffects;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C51879MwN;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import X.NU5;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.areffects.RtcArEffectsInteractor$setup$flow$1", f = "RtcArEffectsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcArEffectsInteractor$setup$flow$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public final /* synthetic */ NU5 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcArEffectsInteractor$setup$flow$1(NU5 nu5, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A01 = nu5;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RtcArEffectsInteractor$setup$flow$1 rtcArEffectsInteractor$setup$flow$1 = new RtcArEffectsInteractor$setup$flow$1(this.A01, (InterfaceC23621Ds) obj4);
        rtcArEffectsInteractor$setup$flow$1.A00 = obj3;
        return rtcArEffectsInteractor$setup$flow$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C51879MwN c51879MwN = (C51879MwN) this.A00;
        this.A01.A0C = c51879MwN.A06;
        return C0eB.A00;
    }
}
