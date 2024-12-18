package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes4.dex */
public final class B5x extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5x(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6IL, X.6IK] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        int i2 = this.A01;
        C5C7 c5c7 = LazyListState.A0O;
        ?? obj = new Object();
        obj.A00 = -1;
        return new LazyListState(obj, i, i2);
    }
}
