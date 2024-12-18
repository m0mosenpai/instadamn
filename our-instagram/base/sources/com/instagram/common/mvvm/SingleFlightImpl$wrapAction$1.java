package com.instagram.common.mvvm;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C130325uc;
import X.C1JX;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.common.mvvm.SingleFlightImpl$wrapAction$1", f = "SingleFlight.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SingleFlightImpl$wrapAction$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleFlightImpl$wrapAction$1(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        super(1, interfaceC23621Ds);
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new SingleFlightImpl$wrapAction$1(interfaceC23621Ds, this.A01);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new SingleFlightImpl$wrapAction$1((InterfaceC23621Ds) obj, this.A01).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC16660sJ interfaceC16660sJ = this.A01;
            this.A00 = 1;
            obj = interfaceC16660sJ.invoke(this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        return new C130325uc(obj);
    }
}
