package com.instagram.rtc.interactor.areffects;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass058;
import X.C0eB;
import X.C1807580d;
import X.C191258dU;
import X.C54803OJx;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.PZL;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.areffects.RtcArEffectsManager$getCollectionsFlow$2", f = "RtcArEffectsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcArEffectsManager$getCollectionsFlow$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C191258dU A01;
    public final /* synthetic */ C54803OJx A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcArEffectsManager$getCollectionsFlow$2(C191258dU c191258dU, C54803OJx c54803OJx, InterfaceC23621Ds interfaceC23621Ds, long j, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A02 = c54803OJx;
        this.A01 = c191258dU;
        this.A00 = j;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new RtcArEffectsManager$getCollectionsFlow$2(this.A01, this.A02, interfaceC23621Ds, this.A00, this.A03, this.A04);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcArEffectsManager$getCollectionsFlow$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return new AnonymousClass058(new PZL(this.A02.A09.A07(new C1807580d(this.A01, null, null, this.A00, this.A03, true, this.A04, true, false)), (InterfaceC23621Ds) null, 10));
    }
}
