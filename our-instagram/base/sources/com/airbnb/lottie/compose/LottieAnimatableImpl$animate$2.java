package com.airbnb.lottie.compose;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AnonymousClass191;
import X.B4Z;
import X.C0eB;
import X.C12W;
import X.C1JX;
import X.C28794CnQ;
import X.C2QZ;
import X.C57Z;
import X.D3Z;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import X.MCN;
import X.SQ2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class LottieAnimatableImpl$animate$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ SQ2 A05;
    public final /* synthetic */ C28794CnQ A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(SQ2 sq2, C28794CnQ c28794CnQ, Integer num, InterfaceC23621Ds interfaceC23621Ds, float f, float f2, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(1, interfaceC23621Ds);
        this.A06 = c28794CnQ;
        this.A03 = i;
        this.A04 = i2;
        this.A09 = z;
        this.A02 = f;
        this.A05 = sq2;
        this.A01 = f2;
        this.A0A = z2;
        this.A08 = z3;
        this.A07 = num;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C28794CnQ c28794CnQ = this.A06;
        int i = this.A03;
        int i2 = this.A04;
        boolean z = this.A09;
        float f = this.A02;
        return new LottieAnimatableImpl$animate$2(this.A05, c28794CnQ, this.A07, interfaceC23621Ds, f, this.A01, i, i2, z, this.A0A, this.A08);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((LottieAnimatableImpl$animate$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C28794CnQ c28794CnQ;
        C12W c12w;
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A00 == 0) {
                AbstractC09560e7.A00(obj);
                c28794CnQ = this.A06;
                int i = this.A03;
                InterfaceC74953Yl interfaceC74953Yl = c28794CnQ.A04;
                AbstractC25227BEk.A19(interfaceC74953Yl, i);
                int i2 = this.A04;
                InterfaceC74953Yl interfaceC74953Yl2 = c28794CnQ.A05;
                Integer valueOf = Integer.valueOf(i2);
                interfaceC74953Yl2.Egh(valueOf);
                AbstractC25227BEk.A1A(c28794CnQ.A09, this.A09);
                float f = this.A02;
                AbstractC25227BEk.A18(c28794CnQ.A0A, f);
                c28794CnQ.A01.Egh(null);
                SQ2 sq2 = this.A05;
                c28794CnQ.A02.Egh(sq2);
                C28794CnQ.A00(c28794CnQ, this.A01);
                AbstractC25227BEk.A1A(c28794CnQ.A0B, this.A0A);
                if (!this.A08) {
                    c28794CnQ.A06.Egh(Long.MIN_VALUE);
                }
                if (sq2 != null) {
                    if (Float.isInfinite(f)) {
                        C28794CnQ.A00(c28794CnQ, AbstractC25231BEo.A05(c28794CnQ.A0C));
                        AbstractC25227BEk.A1A(c28794CnQ.A03, false);
                        interfaceC74953Yl.Egh(valueOf);
                        return C0eB.A00;
                    }
                    AbstractC25227BEk.A1A(c28794CnQ.A03, true);
                    Integer num = this.A07;
                    int intValue = num.intValue();
                    if (intValue != 1) {
                        if (intValue == 0) {
                            c12w = AnonymousClass191.A00;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        c12w = D3Z.A00;
                    }
                    MCN mcn = new MCN(C57Z.A00(getContext()), c28794CnQ, num, (InterfaceC23621Ds) null, i2, i, 0);
                    this.A00 = 1;
                    if (AbstractC23641Du.A00(this, c12w, mcn) == c1jx) {
                        return c1jx;
                    }
                }
                AbstractC25227BEk.A1A(c28794CnQ.A03, false);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj);
            C2QZ.A01(getContext());
            c28794CnQ = this.A06;
            AbstractC25227BEk.A1A(c28794CnQ.A03, false);
            return C0eB.A00;
        } catch (Throwable th) {
            AbstractC25227BEk.A1A(this.A06.A03, false);
            throw th;
        }
    }
}
