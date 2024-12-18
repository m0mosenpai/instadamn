package androidx.compose.foundation.gestures;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25231BEo;
import X.AbstractC25232BEp;
import X.C0eB;
import X.C15130pT;
import X.C1JX;
import X.C25242BFb;
import X.C25249BFi;
import X.C6M3;
import X.C6MZ;
import X.C6NZ;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ ScrollingLogic A06;
    public final /* synthetic */ C15130pT A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, InterfaceC23621Ds interfaceC23621Ds, C15130pT c15130pT, long j) {
        super(2, interfaceC23621Ds);
        this.A06 = scrollingLogic;
        this.A07 = c15130pT;
        this.A05 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.A06, interfaceC23621Ds, this.A07, this.A05);
        scrollingLogic$doFlingAnimation$2.A04 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        C15130pT c15130pT;
        long j;
        float A00;
        ScrollingLogic scrollingLogic2;
        long A01;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            j = this.A01;
            c15130pT = (C15130pT) this.A03;
            scrollingLogic = (ScrollingLogic) this.A02;
            scrollingLogic2 = (ScrollingLogic) this.A04;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C6NZ c6nz = (C6NZ) this.A04;
            scrollingLogic = this.A06;
            C25249BFi c25249BFi = new C25249BFi(c6nz, scrollingLogic);
            c15130pT = this.A07;
            long j2 = this.A05;
            C6MZ c6mz = scrollingLogic.A02;
            j = c15130pT.A00;
            if (scrollingLogic.A03 == C6M3.Horizontal) {
                A00 = AbstractC25231BEo.A00(j2);
            } else {
                A00 = AbstractC25232BEp.A00(j2);
            }
            if (scrollingLogic.A07) {
                A00 *= -1.0f;
            }
            this.A04 = scrollingLogic;
            this.A02 = scrollingLogic;
            this.A03 = c15130pT;
            this.A01 = j;
            this.A00 = 1;
            obj = c6mz.E49(c25249BFi, this, A00);
            if (obj == c1jx) {
                return c1jx;
            }
            scrollingLogic2 = scrollingLogic;
        }
        float A09 = AbstractC166987dD.A09(obj);
        if (scrollingLogic2.A07) {
            A09 *= -1.0f;
        }
        if (scrollingLogic.A03 == C6M3.Horizontal) {
            A01 = C25242BFb.A01(A09, 0.0f, 2, j);
        } else {
            A01 = C25242BFb.A01(0.0f, A09, 1, j);
        }
        c15130pT.A00 = A01;
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
