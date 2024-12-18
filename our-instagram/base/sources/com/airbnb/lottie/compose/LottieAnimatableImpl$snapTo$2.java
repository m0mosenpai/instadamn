package com.airbnb.lottie.compose;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC25227BEk;
import X.C0eB;
import X.C28794CnQ;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.SQ2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class LottieAnimatableImpl$snapTo$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SQ2 A02;
    public final /* synthetic */ C28794CnQ A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(SQ2 sq2, C28794CnQ c28794CnQ, InterfaceC23621Ds interfaceC23621Ds, float f, int i, boolean z) {
        super(1, interfaceC23621Ds);
        this.A03 = c28794CnQ;
        this.A02 = sq2;
        this.A00 = f;
        this.A01 = i;
        this.A04 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new LottieAnimatableImpl$snapTo$2(this.A02, this.A03, interfaceC23621Ds, this.A00, this.A01, this.A04);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((LottieAnimatableImpl$snapTo$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C28794CnQ c28794CnQ = this.A03;
        c28794CnQ.A02.Egh(this.A02);
        C28794CnQ.A00(c28794CnQ, this.A00);
        AbstractC25227BEk.A19(c28794CnQ.A04, this.A01);
        AbstractC25227BEk.A1A(c28794CnQ.A03, false);
        if (this.A04) {
            c28794CnQ.A06.Egh(Long.MIN_VALUE);
        }
        return C0eB.A00;
    }
}
