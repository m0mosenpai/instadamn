package androidx.compose.animation.core;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InfiniteTransition$run$1$1$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ float A00;

    public InfiniteTransition$run$1$1$3(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InfiniteTransition$run$1$1$3 infiniteTransition$run$1$1$3 = new InfiniteTransition$run$1$1$3(interfaceC23621Ds);
        infiniteTransition$run$1$1$3.A00 = AbstractC166987dD.A09(obj);
        return infiniteTransition$run$1$1$3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InfiniteTransition$run$1$1$3) create(Float.valueOf(AbstractC166987dD.A09(obj)), (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return Boolean.valueOf(AbstractC167007dF.A1O((this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1))));
    }
}
