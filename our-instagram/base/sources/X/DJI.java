package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.List;

/* loaded from: classes5.dex */
public final class DJI extends C0YY implements InterfaceC16660sJ {
    public static final DJI A00 = new DJI();

    public DJI() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C5C7 c5c7 = LazyStaggeredGridState.A0M;
        return new LazyStaggeredGridState((int[]) AbstractC166987dD.A16(list), (int[]) AbstractC25227BEk.A0t(list));
    }
}
