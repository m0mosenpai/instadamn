package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.M9a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50088M9a implements InterfaceC19960yQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public C50088M9a(LazyListState lazyListState, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        this.A02 = lazyListState;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        LazyListState lazyListState = this.A02;
        int A00 = lazyListState.A00();
        int i = this.A00;
        if (A00 < i || (lazyListState.A00() == i && lazyListState.A01() < this.A01)) {
            this.A03.invoke();
        }
        return C0eB.A00;
    }
}
