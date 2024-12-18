package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import com.meta.compose.component.swipeable.SwipeableState;

/* loaded from: classes5.dex */
public final class D4s extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final float A03;
    public final int A04 = 0;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4s(C5Y6 c5y6, InterfaceC23621Ds interfaceC23621Ds, C15080pO c15080pO, float f) {
        super(2, interfaceC23621Ds);
        this.A03 = f;
        this.A05 = c5y6;
        this.A01 = c15080pO;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A04 != 0) {
            D4s d4s = new D4s((C5Y6) this.A05, (SwipeableState) this.A02, interfaceC23621Ds, this.A03);
            d4s.A01 = obj;
            return d4s;
        }
        D4s d4s2 = new D4s((C5Y6) this.A05, interfaceC23621Ds, (C15080pO) this.A01, this.A03);
        d4s2.A02 = obj;
        return d4s2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pO, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A04 != 0) {
            C1JX c1jx = C1JX.A02;
            Object obj2 = null;
            Object obj3 = null;
            try {
                if (this.A00 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    Object obj4 = this.A01;
                    ?? obj5 = new Object();
                    SwipeableState swipeableState = (SwipeableState) this.A02;
                    obj5.A00 = AbstractC25231BEo.A03(swipeableState.A04);
                    InterfaceC74953Yl interfaceC74953Yl = swipeableState.A06;
                    float f = this.A03;
                    interfaceC74953Yl.Egh(AbstractC25225BEi.A10(f));
                    AbstractC25227BEk.A1A(swipeableState.A08, true);
                    C5Y1 A00 = AbstractC118385Xa.A00(obj5.A00);
                    Float A10 = AbstractC25225BEi.A10(f);
                    C5Y6 c5y6 = (C5Y6) this.A05;
                    C57751Pje c57751Pje = new C57751Pje(39, obj4, (Object) obj5);
                    this.A00 = 1;
                    if (A00.A04(c5y6, A10, A00.A02(), this, c57751Pje) == c1jx) {
                        return c1jx;
                    }
                }
            } finally {
                SwipeableState swipeableState2 = (SwipeableState) this.A02;
                swipeableState2.A06.Egh(obj2);
                AbstractC25227BEk.A1A(swipeableState2.A08, false);
            }
        } else {
            C1JX c1jx2 = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                Object obj6 = this.A02;
                float f2 = this.A03;
                C5Y6 c5y62 = (C5Y6) this.A05;
                C30484DbT c30484DbT = new C30484DbT(1, obj6, this.A01);
                this.A00 = 1;
                if (SuspendAnimationKt.A03(c5y62, this, c30484DbT, 0.0f, f2, 0.0f) == c1jx2) {
                    return c1jx2;
                }
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4s) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4s(C5Y6 c5y6, SwipeableState swipeableState, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(2, interfaceC23621Ds);
        this.A02 = swipeableState;
        this.A03 = f;
        this.A05 = c5y6;
    }
}
