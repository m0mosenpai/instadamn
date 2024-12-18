package androidx.compose.animation.core;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass194;
import X.BTO;
import X.C0eB;
import X.C19L;
import X.C1JX;
import X.C62R;
import X.DHM;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1227}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"})
/* loaded from: classes5.dex */
public final class Transition$animateTo$1$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public float A00;
    public int A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ BTO A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(BTO bto, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = bto;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.A03, interfaceC23621Ds);
        transition$animateTo$1$1$1.A02 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C19L c19l;
        float A00;
        C1JX c1jx = C1JX.A02;
        if (this.A01 != 0) {
            A00 = this.A00;
            c19l = (C19L) this.A02;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            c19l = (C19L) this.A02;
            A00 = SuspendAnimationKt.A00(c19l.Arv());
        }
        while (AnonymousClass194.A07(c19l)) {
            DHM dhm = new DHM(this.A03, A00, 0);
            this.A02 = c19l;
            this.A00 = A00;
            this.A01 = 1;
            if (C62R.A01(this, dhm) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Transition$animateTo$1$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
