package androidx.compose.foundation.pager;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass001;
import X.BVY;
import X.C0eB;
import X.C1JX;
import X.C5C7;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class PagerState$scrollToPage$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ BVY A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(BVY bvy, InterfaceC23621Ds interfaceC23621Ds, float f, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = bvy;
        this.A01 = f;
        this.A02 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new PagerState$scrollToPage$2(this.A03, interfaceC23621Ds, this.A01, this.A02);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            BVY bvy = this.A03;
            this.A00 = 1;
            C5C7 c5c7 = BVY.A0b;
            if (bvy.A0I.A00(this) == c1jx) {
                return c1jx;
            }
        }
        float f = this.A01;
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            BVY bvy2 = this.A03;
            bvy2.A07(BVY.A00(bvy2, this.A02), f);
            return C0eB.A00;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0Z("pageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PagerState$scrollToPage$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
