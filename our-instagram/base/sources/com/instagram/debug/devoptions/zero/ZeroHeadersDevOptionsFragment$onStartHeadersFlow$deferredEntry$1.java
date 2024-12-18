package com.instagram.debug.devoptions.zero;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C55171Oda;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = zeroHeadersDevOptionsFragment;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            C55171Oda c55171Oda = this.this$0.headersManager;
            if (c55171Oda == null) {
                C14360o3.A0F("headersManager");
                throw C00O.createAndThrow();
            }
            this.label = 1;
            obj = c55171Oda.A04("test", "", this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        return obj;
    }
}
