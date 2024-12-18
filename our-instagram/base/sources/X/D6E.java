package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* loaded from: classes5.dex */
public final class D6E extends C0YY implements InterfaceC16820sZ {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6E(int i) {
        super(0);
        this.A00 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return new LazyStaggeredGridState(new int[]{0}, new int[]{0});
        }
        C5C7 c5c7 = LazyGridState.A0L;
        return new LazyGridState(new C28752Cmk(2), 0, 0);
    }
}
