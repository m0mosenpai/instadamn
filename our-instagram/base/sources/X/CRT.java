package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes5.dex */
public final class CRT {
    public final LazyListState A00;
    public final InterfaceC74953Yl A01;
    public final InterfaceC74953Yl A02;

    public CRT(LazyListState lazyListState) {
        C14360o3.A0B(lazyListState, 1);
        this.A00 = lazyListState;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A02 = new ParcelableSnapshotMutableState(c6m9, null);
        this.A01 = AbstractC25229BEm.A0R(null);
    }
}
