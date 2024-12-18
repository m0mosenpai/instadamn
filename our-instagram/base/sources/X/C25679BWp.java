package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

/* renamed from: X.BWp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25679BWp implements C58O, Modifier, InterfaceC118925a9 {
    public final int A00;
    public final Object A01;

    public C25679BWp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC118925a9
    public final void Deg(C59A c59a) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C5C7 c5c7 = LazyGridState.A0L;
                ((LazyGridState) obj).A01 = c59a;
                return;
            case 1:
                C5C7 c5c72 = LazyStaggeredGridState.A0M;
                ((LazyStaggeredGridState) obj).A02 = c59a;
                return;
            default:
                C5C7 c5c73 = BVY.A0b;
                ((BVY) obj).A0W.Egh(c59a);
                return;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }
}
