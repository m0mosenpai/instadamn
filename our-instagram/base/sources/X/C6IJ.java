package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.6IJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IJ extends C0YY implements InterfaceC16660sJ {
    public static final C6IJ A00 = new C6IJ();

    public C6IJ() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6IL, X.6IK] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C5C7 c5c7 = LazyListState.A0O;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        ?? obj2 = new Object();
        obj2.A00 = -1;
        return new LazyListState(obj2, intValue, intValue2);
    }
}
