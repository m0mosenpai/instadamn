package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class BJ8 implements InterfaceC118925a9 {
    public final /* synthetic */ LazyListState A00;

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    public BJ8(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }

    @Override // X.InterfaceC118925a9
    public final void Deg(C59A c59a) {
        LazyListState lazyListState = this.A00;
        C5C7 c5c7 = LazyListState.A0O;
        lazyListState.A03 = c59a;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }
}
